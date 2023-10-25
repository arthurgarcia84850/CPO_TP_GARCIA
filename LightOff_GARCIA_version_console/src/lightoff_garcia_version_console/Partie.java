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

public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie() {
        grille = new GrilleDeJeu(5, 5); // Crée une grille 5x5 (vous pouvez ajuster les dimensions)
        nbCoups = 0;
    }

    // Initialise la partie en mélangeant la grille
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); // Mélange la grille en effectuant 10 tours (ajustez le nombre si nécessaire)
    }

    // Lance le jeu LightOff
    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Coup #" + nbCoups);
            System.out.println(grille.toString());

            System.out.print("Entrez une ligne, colonne ou diagonale (par exemple, '1' pour activer la ligne 1) : ");
            String saisie = scanner.nextLine();

            if (saisie.matches("\\d+")) {
                int choix = Integer.parseInt(saisie);
                if (choix >= 0 && choix < grille.getNbLignes()) {
                    grille.activerLigneDeCellules(choix);
                }
            }

            nbCoups++;
        }

        System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        scanner.close();
    }

    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.lancerPartie();
    }
}
