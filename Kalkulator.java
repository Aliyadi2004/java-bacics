import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Einfacher Rechner");
            System.out.print("Bitte geben Sie die erste Zahl ein: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Fehler: Bitte eine gültige Zahl eingeben.");
                return;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Bitte geben Sie den Operator ein (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Bitte geben Sie die zweite Zahl ein: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Fehler: Bitte eine gültige Zahl eingeben.");
                return;
            }
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Ergebnis: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Ergebnis: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Ergebnis: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Ergebnis: " + result);
                    } else {
                        System.out.println("Fehler: Division durch null ist nicht erlaubt.");
                    }
                    break;
                default:
                    System.out.println("Ungültiger Operator.");
            }

        } catch (Exception e) {
            System.out.println("Unerwarteter Fehler: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

