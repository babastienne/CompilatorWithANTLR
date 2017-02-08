# TP 2 : Un compilateur de A � Z

## Disclaimer

Ce projet n'est pas complet, il a �t� effectu� dans le cadre d'un cours. Vous pourrez trouver des versions plus compl�tes de ce projet ailleurs.

## Architecture du projet

Le projet WORK contient la premi�re partie du TP (TP2-0).
Le projet TP contient la seconde partie du TP (TP2).
Le projet Test contient les fichiers Java de test.
Le projet ALL contient les 3 projets pr�c�dent (inclus dynamiquement au niveau de IntelliJ) ainsi que les fichiers de test. 
Le lancement de chaque main doit �tre fait � partir du projet ALL.

## Probl�mes rencontr�s

Lors de mes tests la g�n�ration de code a fonctionn� mais pas la compilation (li� � une erreur de chemins de fichiers). A priori ce probl�me est propre � mon syst�me et ne devrait pas �tre impactant lors des tests effectu�s sur une autre machine normalement configur�e.
Apr�s de nombreux tests il m'a �t� impossible de configurer correctement la commande de compilation (changement de dossier de lancement des tests, changement du chemins des fichiers de tests ...). J'ai donc compil� et lanc� les fichiers c g�n�r�s � l'aide d'un script bash.

## R�sultats des tests

Les tests nominaux de la piste verte ainsi que la piste bleu fonctionnent. 
Les tests d'erreur de la piste verte fonctionnent � l'exception du test 24 qui produit un code c mais ne devrait pas. 
Lorsque les tests concernent une exception de type 'division par 0', un code c est g�n�r� mais au moment la compilation de celui-ci une erreur est g�n�r�e. 

La piste rouge a �t� partiellement impl�ment�e mais est non fonctionnelle, les tests ne passent pas. 

## R�ponse � la question 4.2

La strat�gie utilis�e pour obtenir les types des variables utilis�es dans le programme est de passer la liste des d�finitions g�n�r�es afin de la parcourir en cas d'appel de la variable. La m�me strat�gie doit �tre mise en oeuvre avec les fonctions cr��es afin de tester le type de retour (signature) de la fonction appel�e dans un programme.

