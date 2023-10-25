/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_garcia_version_console;

/**
 *
 * @author arthurgarcia
 */
public class LightOff_GARCIA_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    
 // Créez une grille de cellules lumineuses 3x3 (ajustez les dimensions si nécessaire)
        GrilleDeCellules grille = new GrilleDeCellules(3, 3);

        // Mélangez la grille de manière aléatoire (10 tours)
        grille.melangerMatriceAleatoirement(10);

        // Affichez la grille
        System.out.println("Grille après mélange :");
        System.out.println(grille.toString());

        // Testez différentes méthodes
        grille.activerLigneDeCellules(1); // Active la ligne 1
        System.out.println("Grille après activation de la ligne 1 :");
        System.out.println(grille.toString());

        grille.activerColonneDeCellules(2); // Active la colonne 2
        System.out.println("Grille après activation de la colonne 2 :");
        System.out.println(grille.toString());

        grille.activerDiagonaleDescendante(); // Active la diagonale descendante
        System.out.println("Grille après activation de la diagonale descendante :");
        System.out.println(grille.toString());

        grille.activerDiagonaleMontante(); // Active la diagonale montante
        System.out.println("Grille après activation de la diagonale montante :");
        System.out.println(grille.toString());

        grille.activerLigneColonneOuDiagonaleAleatoire(); // Active aléatoirement une ligne, colonne ou diagonale
        System.out.println("Grille après activation aléatoire :");
        System.out.println(grille.toString());

        // Vérifiez si toutes les cellules sont éteintes
        if (grille.cellulesToutesEteintes()) {
            System.out.println("Toutes les cellules sont éteintes !");
        } else {
            System.out.println("Il reste des cellules allumées.");
        }
    }
}


