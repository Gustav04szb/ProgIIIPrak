import java.io.*;
import java.util.Scanner;

public class myScanner {
    public void scan(String[] args) {
        try {
            String dateiName = args[0]; // Dateiname wird übergeben
            try {
                Scanner scanner = new Scanner(new File(dateiName)); // öffne Datei zum Auslesen
                int zaehler = 0;
                while (scanner.hasNextLine()) { // Solange es noch neue Zeilen gibt, lies diese aus
                    String zeile = scanner.nextLine();
                    System.out.println("Zeile "+zaehler+": "+zeile);
                    zaehler++;
                }
                scanner.close(); // schließe die Datei
            } catch (FileNotFoundException e) {
                System.out.println("Fehler: "+e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: "+e.getMessage());
        }

    }
}
