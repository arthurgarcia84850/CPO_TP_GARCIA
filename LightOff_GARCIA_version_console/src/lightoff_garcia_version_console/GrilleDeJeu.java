/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_garcia_version_console;

/**
 *
 * @author arthurgarcia
 */

import java.util.Random;

/**
 * La classe GrilleDeJeu représente la grille de cellules lumineuses.
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Initialise une nouvelle grille de jeu avec le nombre de lignes et de colonnes spécifié.
     *
     * @param nbLignes    Le nombre de lignes de la grille.
     * @param nbColonnes  Le nombre de colonnes de la grille.
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de toutes les cellules de la grille
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    // ... (autres méthodes)

    /**
     * Vérifie si toutes les cellules de la grille sont éteintes.
     *
     * @return true si toutes les cellules sont éteintes, sinon false.
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Représente la grille sous forme d'une chaîne de caractères.
     *
     * @return Une représentation textuelle de la grille.
     */
    @Override
    public String toString() {
        StringBuilder grilleString = new StringBuilder();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    grilleString.append("[O]");
                } else {
                    grilleString.append("[X]");
                }
            }
            grilleString.append("\n");
        }

        return grilleString.toString();
    }
}
