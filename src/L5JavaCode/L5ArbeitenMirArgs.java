package L5JavaCode;

import java.io.*;
import java.util.Scanner;

public class L5ArbeitenMirArgs {
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
        System.out.println("Arguments: " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("Eingabe "+ i + ": > " + args[i]);
        }
    }
    public static String codiere(String text, int key) {
        char[] zeichen = text.toCharArray();
        for (int i=0; i<zeichen.length; i++)
            zeichen[i] = (char)(zeichen[i]^key);
        return new String(zeichen);
    }


    public static void main(String[] args) {
        L5ArbeitenMirArgs myArgs = new L5ArbeitenMirArgs();
        myArgs.readFileFromArgs(args);
        myArgs.writeToFileFromArgs(args);
        myArgs.printArgsToConsol(args);

    }
}
