import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int zufallszahl = random.nextInt(100) + 1; // Zufallszahl zwischen 1 und 100
        int versuche = 0;
        int benutzereingabe = 0;

        System.out.println("Willkommen zum Zahlenratespiel!");
        System.out.println("Ich habe eine Zahl zwischen 1 und 100 ausgewählt. Versuche sie zu erraten!");

        while (benutzereingabe != zufallszahl) {
            System.out.print("Geben Sie Ihre Vermutung ein: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Bitte geben Sie eine gültige Zahl ein.");
                scanner.next(); // Ungültige Eingabe überspringen
                continue;
            }

            benutzereingabe = scanner.nextInt();
            versuche++;

            if (benutzereingabe < zufallszahl) {
                System.out.println("Die Zahl ist größer.");
            } else if (benutzereingabe > zufallszahl) {
                System.out.println("Die Zahl ist kleiner.");
            } else {
                System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl erraten.");
                System.out.println("Anzahl der Versuche: " + versuche);
            }
        }

        scanner.close();
    }
}
