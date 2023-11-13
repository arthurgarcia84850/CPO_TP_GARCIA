/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_garcia_version_console;

/**
 *
 * @author arthurgarcia
 */
public class CelluleLumineuse {
    private boolean etat;

    // Constructeur par défaut
    public CelluleLumineuse() {
        etat = false; // Initialisation de l'état à "éteinte"
    }
    public void activerCellule() {
        etat = !etat; // Inverser l'état actuel de la cellule
    }
    public void  eteindreCellule() {
        if (etat==true) {
            etat =!etat;
        
       }
    }
        
    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return etat == false;
    }
     
    public boolean getEtat() {
        return etat;
                }
    
   
            
    // Méthode toString pour afficher l'état de la cellule
    @Override
    public String toString() {
        if (etat==true) {
            return "O";
        } else {
            return "X";
        }
    }
  

}
   
   
   
   

