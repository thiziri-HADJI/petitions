## Projet TinyPet

Dans le cadre du module développement d'applications sur le Cloud, il nous a été demandé de réaliser une application web pour la gestion des pétitions en s’inspirant des sites existants comme change.org et d’autres.

Dans ce readme nous allons détailler les différentes fonctionnalités réalisées ainsi que quelques aperçus de notre application. 

Ce projet a été réalisé par BARRY Boubacar, BOULID Hamza, HADJI Thiziri, NING Binbing. 


## Les liens
<li></li>
<li></li> <br/>


## Fonctionnalités réalisées

Voici des fonctionnalités qu’on a réalisées :

<li>Ajouter/Modifier/Supprimer une pétition</li>  

Pour créer une pétition nous avons mis en place un formulaire avec six champs : titre et description comme champs obligatoires, thème, tag, une URL d’une image et un nombre de signatures comme objectif à atteindre en champs optionnels.

<li>Ajouter un objectif pour un nombre de signature</li>

Laisser l’utilisateur choisir le nombre de signatures nécessaires pour que sa pétition atteigne son objectif final.

<li>Afficher les détails d’une pétition</li>

Nous avons mis en place des boutons “Voir la pétition” qui permet de consulter les détails de chaque pétition, les champs remplis lors de la création de la pétition ainsi que l’auteur de la pétition, la date de la création et la date de la dernière modification.

<li>Signer une pétition/Enlever une signature</li>

Pour chaque signature, nous avons mis en place un bouton “Signer la pétition” qui augmente le nombre de signataires à chaque nouvelle signature. Dans le cas où l’utilisateur est le propriétaire de la pétition, nous affichons un message à l'écran pour lui indiquer qu’il ne peut pas signer sa propre pétition. Si l’utilisateur veut signer une pétition plus d’une fois, il aura également un message d’erreur.

<li>Lister mes pétitions créées/signées</li>

Chaque utilisateur a la possibilité de consulter la liste des pétitions qu’il a créé/signé et également la possibilité de consulter les détails de chacune et de les modifier ou les supprimer.

<li>Lister les pétitions les plus récentes/signées</li>

Dans la catégorie “Parcourir des pétitions”, nous pouvons consulter les pétitions postées triées par date de création en cliquant sur “Les pétitions récentes” ou obtenir les pétitions signées triées par le nombre de signatures dans l’ordre décroissant en choisissant la sous-catégorie “Top pétitions signées”. 

<li>Rechercher les pétitions en fonction du titre/tag</li>

En cliquant sur l’icône de Recherche, nous pouvons effectuer une recherche de pétition souhaitée en fonction du titre ou du tag. 
En fonction du titre, nous pouvons saisir les mots-clés et les pétitions qui les ont dans leurs titres seront affichées. 
En fonction du tag, nous avons besoin de saisir l’un des tags de la pétition souhaitée et toutes les pétitions avec ce tag seront affichées.
<br/>

## Performance

Nous avons testé les différentes fonctionnalités sur différents systèmes d’exploitation, nous avons également vérifié si notre application est scalable et respecte le délai maximum de 500 ms. Pour cela, le tableau représente un calcule du délai d’exécution de chaque requête , c'est-à-dire le temps qu’il a fallu pour la récupération des données nécessaires depuis la base de données, ou l'envoi de ces derniers pour certaines requêtes.

Ce délais change d’une requête à une autre, il dépend de la quantité d'information à récupérer et non du nombre d’utilisateurs, ce qu’on peut voir sur le tableau par exemple sur la récupération des pétition signé qu’on on récupère les top 100 ça nous prend 343,25 ms alors que 10 pétition prend 72,15 ms. </br>

<img width="673" alt="Performance" src="https://user-images.githubusercontent.com/76114615/117509958-7731cf00-af8b-11eb-8f05-5b04129fb9e8.png">


## Aperçu de l’application


## Conclusion

Ce projet est une expérience très intéressante, qui nous a permis d’acquérir des connaissances tout au long de sa réalisation, ainsi que de mettre en pratique ce qu’on a appris durant le module développement d’applications sur le cloud avec un cas réel. 

Au niveau de la gestion d'équipe, la réalisation de TinyPet nous a permis de s’entraider et de partager nos connaissances avec les autres, ainsi que savoir s’organiser et répartir les tâches tout en respectant les deadlines.

Pour réaliser l’interface de notre application web, nous avons utilisé Mithril.js qui est un framework javascript réactif. Ce projet nous a apporté l’opportunité de découvrir Mithril.js utilisé pour concevoir des applications monopage et d’avoir une solution plus efficace pour améliorer les performances.  

