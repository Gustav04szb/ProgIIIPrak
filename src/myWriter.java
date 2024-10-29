import java.io.*;
import java.util.Arrays;


public class myWriter {
    public void writer(String[] args) {
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

}
