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

public class GrilleDeJeu {
    public CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

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

    /**
     * Active toutes les cellules d'une ligne spécifique.
     *
     * @param idLigne Le numéro de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Active toutes les cellules d'une colonne spécifique.
     *
     * @param idColonne Le numéro de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Active la diagonale descendante de la grille en allumant les cellules correspondantes.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Active la diagonale montante de la grille en allumant les cellules correspondantes.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }

    /**
     * Active de manière aléatoire une ligne, une colonne ou une diagonale de cellules de la grille.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(4);

        if (choix == 0) {
            int ligneAleatoire = rand.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);
        } else if (choix == 1) {
            int colonneAleatoire = rand.nextInt(nbColonnes);
            activerColonneDeCellules(colonneAleatoire);
        } else if (choix == 2) {
            activerDiagonaleDescendante();
        } else {
            activerDiagonaleMontante();
        }
    }

    /**
     * Mélange la grille de cellules lumineuses de manière aléatoire à partir d'un nombre spécifié de tours.
     *
     * @param nbTours Le nombre de tours pour mélanger la grille.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

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

    @Override
    public String toString() {
        StringBuilder grilleString = new StringBuilder();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    grilleString.append("[X]");
                } else {
                    grilleString.append("[O]");
                }
            }
            grilleString.append("\n");
        }

        return grilleString.toString();
    }
}


    
    
