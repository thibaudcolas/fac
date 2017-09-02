#include <iostream>
#include <cstdlib>
#include <ctime>
#include "fonctions.h"

using namespace std;

void affiche ( int tab[MAX], int nbVal)
{
    for (int i = 0; i < nbVal; i++)
        cout << tab[i] << " ";
    cout << endl;
}

void affiche ( int ecriture, int lecture )
{
    cout << "Il y a eu " << ecriture << " ecriture(s) et "
         << lecture << " lecture(s)...\n\n";
}

void triABulles ( int tab[MAX], int nbVal, int & ecriture, int & lecture )
{
    bool trouve = false;
    for (int i = 0; i < nbVal-1; i++) {
        lecture += 2;
        if (tab[i] > tab[i+1]) {
            int tmp = tab[i];
            tab[i] = tab[i+1];
            tab[i+1] = tmp;
            trouve = true;
            lecture += 2;
            ecriture += 2;
        }
    }
    if (nbVal-1 > 0 && trouve)
        triABulles(tab, --nbVal, ecriture, lecture);
}

void triABullesInverse ( int tab[MAX], int nbVal, int & ecriture, int & lecture, int cpt )
{
    bool trouve = false;
    for (int i = nbVal-1; i > cpt; i--) {
        lecture += 2;
        if (tab[i-1] < tab[i]) {
            int tmp = tab[i];
            tab[i] = tab[i-1];
            tab[i-1] = tmp;
            trouve = true;
            ecriture += 2;
            lecture += 2;
        }
    }
    cpt++;
    if (nbVal-1 > cpt && trouve)
        triABullesInverse(tab, nbVal, ecriture, lecture, cpt);
}

/**
 * Sélectionne la plus grande valeur du tableau
 */
int selectGrand ( int tab[MAX], int nbVal )
{
    int grand = 0;
    for (int i = 0; i < nbVal; i++)
        if (tab[i] > tab[grand])
            grand = i;
}

void triSelection ( int tab[MAX], int nbVal, int & ecriture, int & lecture)
{
    // on selectionne la plus grande valeur
    int i = selectGrand(tab, nbVal);
    // on la met à la fin en inversant la dernière et la plus grande
    int tmp = tab[nbVal-1];
    tab[nbVal-1] = tab[i];
    tab[i] = tmp;
    ecriture += 2;
    lecture += 2;
    // on refait jusqu'au bout
    if (nbVal - 1 > 0)
        triSelection ( tab, nbVal - 1, ecriture, lecture);
}
