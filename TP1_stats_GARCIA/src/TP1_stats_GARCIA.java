import java.util.Random;
import java.util.Scanner;

public class TP1_stats_GARCIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        int[] facesDuDe = new int[6]; 

        System.out.print("Saisissez le nombre d'itérations (m) : ");
        int iterations = scanner.nextInt();

       
        for (int i = 0; i < 6; i++) {
            facesDuDe[i] = 0;
        }

    
        for (int i = 0; i < iterations; i++) {
            int resultatLancer = randomGenerator.nextInt(6);  // Tirage aléatoire entre 0 et 5
            facesDuDe[resultatLancer]++;  // Incrémenter la case correspondante
        }

        System.out.println("Résultats en pourcentage :");

        
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) facesDuDe[i] / iterations * 100;
            System.out.printf("Face %d : %.2f%%\n", i + 1, pourcentage);
        }
    }
}
