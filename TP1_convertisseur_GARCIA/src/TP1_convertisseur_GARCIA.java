import java.util.Scanner;

public class TP1_convertisseur_GARCIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Bonjour, saisissez une valeur en degrés Celsius : ");
        double valeurCelsius = scanner.nextDouble();

        
        System.out.println("Vous avez saisi : " + valeurCelsius + " degrés Celsius.");

     
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        int choix = scanner.nextInt();

        double resultat = 0.0;

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
                break;
            case 2:
                resultat = KelvinVersCelsius(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
                break;
            case 3:
                resultat = FarenheitVersCelsius(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
                break;
            default:
                System.out.println("Choix non valide.");
        }
    }

    public static double CelciusVersKelvin(double tCelsius) {
        
        return tCelsius + 273.15;
    }

    public static double KelvinVersCelsius(double tKelvin) {
        
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelsius(double tFahrenheit) {
        
        return (tFahrenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelsius) {
        // Formule de conversion de Celsius vers Fahrenheit
        return (tCelsius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        
        double tCelsius = KelvinVersCelsius(tKelvin);
        return CelciusVersFarenheit(tCelsius);
    }

    public static double FarenheitVersKelvin(double tFahrenheit) {
       
        double tCelsius = FarenheitVersCelsius(tFahrenheit);
        return CelciusVersKelvin(tCelsius);
    }
}
