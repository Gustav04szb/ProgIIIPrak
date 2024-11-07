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

    /* 03 Loesungen */
    public int formelf1x(int input){
        return input;
    }
    public float formelf1x(float input){
        return input;
    }

    public int formelf2x(int input){
        return (input * input) / 2 + (17 *2);
    }
    public float formelf2x(float input){
        return  (input * input) / 2 + (17 *2);
    }

    public float formelf3x(float input){
        return (float) (Math.pow(input,3) - 14) / 2;
    }
    public double formelf3x(double input){
        return (Math.pow(input,3) - 14) / 2;
    }

   public int fakultaet(int input){
       if (input < 0) {
           throw new IllegalArgumentException("Die Zahl muss nicht negativ sein.");
       }
       if(input > 19){
           throw new IllegalArgumentException("Die Zahl darf nicht größer als 19 sein.");
       }
       if (input == 0 || input == 1) {
           return 1; // Basisfall: 0! und 1! sind 1
       }
       return input * fakultaet(input - 1);

   }

   public static int summenForLoopA(){
        int sum = 0;
        for(int i = 0; 28 > i; i++){
            sum += (i - 1) * (i - 1);
        }
        return sum;
   }
    public static int summenForLoopB(){
        int sum = 0;
        for(int i = 0; 100 > i; i++){
            sum += (i * (i + 1)) / 2;
        }
        return sum;
    }
    public static int summenForLoopC(){
        int sum = 0;
        for(int i = 1; 25 > i; i++){
            sum += (i + 1) / i;
        }
        return sum;
    }

    public void forInWhile1(){
        int x =7;
        while(x<12){
            System.out.println(x);
            ++x;
        }
    }
    public void forInWhile2(){
        int x = 10, y = 0;
        while(x>y) {
            System.out.println("x = " + x + ", y = " + y);
            --x;
        }
    }
    public void whileInFor(){
        for (int i = 1024; i > 2; i /= 2) {
            System.out.println(i);
        }
    }

    public static void LongToFloatCastin(){
        long originalLong = Long.MAX_VALUE;
        float castedFloat = (float) originalLong;
        long backToLong = (long) castedFloat;

        System.out.println("Originaler long-Wert: " + originalLong);
        System.out.println("Nach float und zurück gecasteter long-Wert: " + backToLong);

        if (originalLong == backToLong) {
            System.out.println("Der größte darstellbare long-Wert passt in einen float.");
        } else {
            System.out.println("Der größte darstellbare long-Wert passt nicht in einen float (Genauigkeitsverlust).");
        }
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
