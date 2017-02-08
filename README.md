# TP 2 : Un compilateur de A à Z

## Disclaimer

Ce projet n'est pas complet, il a été effectué dans le cadre d'un cours. Vous pourrez trouver des versions plus complètes de ce projet ailleurs.

## Architecture du projet

Le projet WORK contient la première partie du TP (TP2-0).
Le projet TP contient la seconde partie du TP (TP2).
Le projet Test contient les fichiers Java de test.
Le projet ALL contient les 3 projets précédent (inclus dynamiquement au niveau de IntelliJ) ainsi que les fichiers de test. 
Le lancement de chaque main doit être fait à partir du projet ALL.

## Problèmes rencontrés

Lors de mes tests la génération de code a fonctionné mais pas la compilation (lié à une erreur de chemins de fichiers). A priori ce problème est propre à mon système et ne devrait pas être impactant lors des tests effectués sur une autre machine normalement configurée.
Après de nombreux tests il m'a été impossible de configurer correctement la commande de compilation (changement de dossier de lancement des tests, changement du chemins des fichiers de tests ...). J'ai donc compilé et lancé les fichiers c générés à l'aide d'un script bash.

## Résultats des tests

Les tests nominaux de la piste verte ainsi que la piste bleu fonctionnent. 
Les tests d'erreur de la piste verte fonctionnent à l'exception du test 24 qui produit un code c mais ne devrait pas. 
Lorsque les tests concernent une exception de type 'division par 0', un code c est généré mais au moment la compilation de celui-ci une erreur est générée. 

La piste rouge a été partiellement implémentée mais est non fonctionnelle, les tests ne passent pas. 

## Réponse à la question 4.2

La stratégie utilisée pour obtenir les types des variables utilisées dans le programme est de passer la liste des définitions générées afin de la parcourir en cas d'appel de la variable. La même stratégie doit être mise en oeuvre avec les fonctions créées afin de tester le type de retour (signature) de la fonction appelée dans un programme.

