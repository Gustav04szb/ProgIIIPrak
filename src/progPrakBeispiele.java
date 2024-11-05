import java.io.*;
import java.util.Scanner;

public class progPrakBeispiele {
    /* 02 Loesungen */
     public void boolAuswerten(){
        boolean a = true, b = false, c, d, e, f, g;
        c = a ^ b;
        d = !a || b;
        e = (d && !c) || !a;
        f = ((d == e) || (d != e) == true);
        g = 5==7;
        System.out.println("L2 "+ c +", L3 " + d + ", L4 " + e + ", L5 " + f + ", L6 " + g);
    }

    /* 05 Loesungen */
    public void readFileFromArgs(String[] args) {
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
    public void writeToFileFromArgs(String[] args) {
        String dateiName = args[0]; // Dateiname wird übergeben
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(dateiName, false)); // schreibe zeilenweise in die Datei dateiName
            for (int i = 0; i < args.length - 1; i++) {
                myWriter.write(args[i + 1]);
                myWriter.newLine();
            }
            myWriter.close(); // schliesse die Datei
        } catch (IOException eIO) {
            System.out.println("Folgender Fehler trat auf: " + eIO);
        }
    }
    public void printArgsToConsol(String [] args){
        if (args.length == 0) {
            System.out.println("No arguments given");
        }
        for(int i = 0; i < args.length; i++) {
            System.out.println("Eingabe "+ i+1 + ": >" + args[i]);
        }
    }
}