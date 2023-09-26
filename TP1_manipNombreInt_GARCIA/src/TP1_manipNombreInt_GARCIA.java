import java.util.Scanner;

public class TP1_manipNombreInt_GARCIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux entiers
        System.out.print("Veuillez saisir le premier entier : ");
        int premierEntier = scanner.nextInt();

        System.out.print("Veuillez saisir le second entier : ");
        int secondEntier = scanner.nextInt();

        // Affiche les entiers saisis
        System.out.println("Vous avez saisi les entiers suivants :");
        System.out.println("Premier entier : " + premierEntier);
        System.out.println("Second entier : " + secondEntier);

        // Calculs et affichage des résultats
        int somme = premierEntier + secondEntier;
        int difference = premierEntier - secondEntier;
        int produit = premierEntier * secondEntier;
        int quotient = premierEntier / secondEntier;
        int reste = premierEntier % secondEntier;

        System.out.println("Somme : " + somme);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + produit);
        System.out.println("Quotient entier : " + quotient);
        System.out.println("Reste de la division : " + reste);
    }
}

