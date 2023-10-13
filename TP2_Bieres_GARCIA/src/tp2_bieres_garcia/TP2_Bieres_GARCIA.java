/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_garcia;

/**
 *
 * @author arthurgarcia
 */
public class TP2_Bieres_GARCIA {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
    uneBiere.ouverte=false;
    System.out.println(uneBiere);

    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
    autreBiere.ouverte=true;
    autreBiere.decapsuler();
    System.out.println(autreBiere);

    BouteilleBiere encoreBiere= new BouteilleBiere ("Cherry Chouffe", 8.0, "Chouffe");
    encoreBiere.ouverte=false;
    System.out.println(encoreBiere);

    BouteilleBiere etBiere= new BouteilleBiere ("8.6", 8.6, "Swinkels");
    etBiere.ouverte=true;
    etBiere.decapsuler();
    System.out.println(etBiere);

    BouteilleBiere etUneBiere= new BouteilleBiere ("heineken blonde", 4, "heineken");
    etUneBiere.ouverte=false;
    System.out.println(etUneBiere);
    }
}