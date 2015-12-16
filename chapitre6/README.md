# Introduction : Création du projet

Compléter ce projet dans le but de fournir un formulaire d'inscription pour des utilisateurs avec les technologies JSF.
Le livrable (format __war__) sera a déployé dans Glassfish.

# TP1 : Création du Bean
Créer un simple bean pour stocker le nom saisi par l'utilisateur, puis ajouter les annotations qui permettent :
 
* De préciser au serveur que ce bean est dorénavant géré par JSF
* De préciser au serveur que ce bean a pour portée la requête

# TP2 : Création des facelets
Créer maintenant les vues pour l'application, il s'agit ici de créer 2 facelets (extension __.xhtml__) qui contiennent des
balises propres à JSF :
 
* Une première page permet d'afficher un formulaire
* L'autre permet d'afficher les données saisies

# TP3 : Ajouter des champs à l'utilisateur
L'utilisateur doit pouvoir désormais indiquer d'autres informations :

* nom
* prénom
* identifiant
* mail
* mot de passe

Modifier alors les pages et le Bean pour cela.

# TP4 : Enregistrer et lister les utilisateurs
Les informations de l'utilisateur doivent désormais être enregistrées en base de données.
Il s'agit ici d'injecter un EJB qui se chargera de la persitence des informations.
Une fois enregistré, l'utilisateur aperçoit sur la vue suivante les diférents utilisateurs déjà inséré avec leurs
informations respectives.

# TP5 : Validation des champs du formulaire
Il existe différentes façons de vérifier qu'un formulaire est bien rempli :

* Indiquer dans les pages que les champs sont obligatoires, si une valeur n'est pas renseignée alors un message s'affiche
 directement
* La longueur des chaines de caractère (minimum 5 caractères) doît être valider coté Bean : utiliser BeanValidation
* Vérifier que le pattern d'un email est bien restecté (BeanValidation) pour l'utilisateur

# TP6 : Utilisation AJAX
Une fois l'email saisi, l'utilisateur recoit un message signalant que l'email existe déjà ou n'existe pas encore en
base de données. Pour cela, l'information lui est donné directement à la fin de la saisie de l'information.
Utiliser les validateurs créés au TP6 pour cela.

# TP7 : Vérifier que l'utilisateur n'existe pas
Utiliser les faces Validator pour vérifier l'identifiant utilisé pour l'utilisateur n'est pas déjà pris par un autre
utilisateur.



