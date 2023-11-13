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

        // Créez une partie avec une grille nxn
        Partie partie = new Partie(3, 3);
        partie.initialiserPartie();
        partie.lancerPartie();
    }
}
