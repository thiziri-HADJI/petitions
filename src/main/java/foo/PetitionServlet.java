package foo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.KeyRange;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

@WebServlet(name = "PetServlet", urlPatterns = { "/petition" })
public class PetitionServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		Random r = new Random();
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

		// Create petition
		for (int i = 0; i < 500; i++) {
			Entity e = new Entity("Petition", "P" + i);
			int owner= r.nextInt(1000);
			e.setProperty("Owner", "U" + owner);
			e.setProperty("Date", new Date());
			e.setProperty("Body", "bla bla");
			
			
			// Create random votants
			HashSet<String> fset = new HashSet<String>();
			//while (fset.size() < 200) {
			for(int j=0; j<200; j++) {
				fset.add("U" + r.nextInt(1000));
			}
			e.setProperty("Votants", fset);
			e.setProperty("nbVotants", fset.size());
			
			// Create random tags
						HashSet<String> ftags = new HashSet<String>();
						while (ftags.size() <10) {
							ftags.add("T" + r.nextInt(1000));
						}
						e.setProperty("tags", ftags);

			datastore.put(e);
			response.getWriter().print("<li> created post:" + e.getKey() + "<br>");
			
		}
	}
}