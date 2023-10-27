/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_garcia_version_console;

/**
 *
 * @author arthurgarcia
 */
import java.util.Scanner;

/**
 * La classe Partie gère le jeu LightOff.
 */
public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    /**
     * Initialise une nouvelle partie du jeu.
     *
     * @param nbLignes    Le nombre de lignes de la grille.
     * @param nbColonnes  Le nombre de colonnes de la grille.
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 1;
    }

    /**
     * Initialise la partie en mélangeant la grille.
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); // Mélange la grille en effectuant 10 tours (ajustez le nombre si nécessaire)
    }

    /**
     * Lance le jeu LightOff.
     */
    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Coup #" + nbCoups);
            System.out.println(grille.toString());

            System.out.print("Choisissez une ligne, colonne ou diagonale (L, C ou D) : ");
            String choixType = scanner.nextLine();

            if (choixType.equalsIgnoreCase("L")) {
                System.out.print("Entrez le numéro de la ligne : ");
                String saisie = scanner.nextLine();
                if (saisie.matches("\\d+")) {
                    int choix = Integer.parseInt(saisie) - 1; // Soustrayez 1 pour correspondre aux indices (ligne 1 devient index 0)
                    if (choix >= 0 && choix < grille.getNbLignes()) {
                        grille.activerLigneDeCellules(choix);
                    }
                }
            } else if (choixType.equalsIgnoreCase("C")) {
                System.out.print("Entrez le numéro de la colonne : ");
                String saisie = scanner.nextLine();
                if (saisie.matches("\\d+")) {
                    int choix = Integer.parseInt(saisie) - 1; // Soustrayez 1 pour correspondre aux indices (colonne 1 devient index 0)
                    if (choix >= 0 && choix < grille.getNbColonnes()) {
                        grille.activerColonneDeCellules(choix);
                    }
                }
            } else if (choixType.equalsIgnoreCase("D")) {
                System.out.print("Choisissez une diagonale (D/M pour descendante/montante) : ");
                String saisie = scanner.nextLine();
                if (saisie.equalsIgnoreCase("D")) {
                    grille.activerDiagonaleDescendante();
                } else if (sasie.equalsIgnoreCase("M")) {
                    grille.activerDiagonaleMontante();
                }
            }

            nbCoups++;
        }

        System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        scanner.close();
    }
}
