import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Bitte geben Sie die Anzahl der Sekunden ein, die Sie herunterzählen möchten: ");
        int seconds = scanner.nextInt();

        for (int i = seconds; i >= 0; i--) {
            System.out.println("Verbleibende Zeit: " + i + " Sekunden");
            try {
                // توقف به مدت یک ثانیه
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Fehler beim Timer!");
            }
        }

     
        System.out.println("Der Countdown ist vorbei!");

        scanner.close();
    }
}
