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
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3);

        if (choix == 0) {
            int ligneAleatoire = rand.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);
        } else if (choix == 1) {
            int colonneAleatoire = rand.nextInt(nbColonnes);
            activerColonneDeCellules(colonneAleatoire);
        } else {
            if (rand.nextBoolean()) {
                activerDiagonaleDescendante();
            } else {
                activerDiagonaleMontante();
            }
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        Random rand = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }

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

        grilleString.append("   ");
        for (int col = 0; col < nbColonnes; col++) {
            grilleString.append(" " + col + "  ");
        }
        grilleString.append("\n");

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            grilleString.append(" " + ligne + " ");

            for (int col = 0; col < nbColonnes; col++) {
                if (matriceCellules[ligne][col].estEteint()) {
                    grilleString.append("[O] ");
                } else {
                    grilleString.append("[X] ");
                }
            }
            grilleString.append("\n");
        }

        return grilleString.toString();
    }
}
