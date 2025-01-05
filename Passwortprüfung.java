import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<String, String> passwordDatabase;

    public Main() {
        passwordDatabase = new HashMap<>();
    }

    // اضافه کردن پسورد جدید
    public void addPassword(String website, String password) {
        passwordDatabase.put(website, password);
        System.out.println("Password für " + website + " wurde erfolgreich hinzugefügt.");
    }

    // بازیابی پسورد برای وب‌سایت خاص
    public void getPassword(String website) {
        if (passwordDatabase.containsKey(website)) {
            System.out.println("Das Passwort für " + website + " ist: " + passwordDatabase.get(website));
        } else {
            System.out.println("Kein Passwort für " + website + " gefunden.");
        }
    }

    // حذف پسورد
    public void deletePassword(String website) {
        if (passwordDatabase.containsKey(website)) {
            passwordDatabase.remove(website);
            System.out.println("Das Passwort für " + website + " wurde gelöscht.");
        } else {
            System.out.println("Kein Passwort für " + website + " gefunden.");
        }
    }

    // نمایش منو
    public void showMenu() {
        System.out.println("1. Passwort hinzufügen");
        System.out.println("2. Passwort anzeigen");
        System.out.println("3. Passwort löschen");
        System.out.println("4. Beenden");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main manager = new Main();
        int choice;

        while (true) {
            manager.showMenu();
            System.out.print("Wählen Sie eine Option: ");
            String input = scanner.nextLine();  // استفاده از nextLine برای خواندن ورودی به عنوان رشته
            try {
                choice = Integer.parseInt(input);  // تبدیل رشته به عدد
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl ein.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Geben Sie den Namen der Website ein: ");
                    String website = scanner.nextLine();
                    System.out.print("Geben Sie das Passwort ein: ");
                    String password = scanner.nextLine();
                    manager.addPassword(website, password);
                    break;
                case 2:
                    System.out.print("Geben Sie den Namen der Website ein: ");
                    website = scanner.nextLine();
                    manager.getPassword(website);
                    break;
                case 3:
                    System.out.print("Geben Sie den Namen der Website ein: ");
                    website = scanner.nextLine();
                    manager.deletePassword(website);
                    break;
                case 4:
                    System.out.println("Programm wird beendet...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Auswahl. Versuchen Sie es noch einmal.");
            }
        }
    }
}
