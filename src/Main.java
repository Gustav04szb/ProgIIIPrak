public class Main {
    public static void main(String[] args) {
        printArgs args1 = new printArgs(); // Zugriff auf die Klasse Aufgabe05
        args1.Arguments(args); // Abrufen der funktion Arguments aus der klasse Aufgabe05


        myWriter myWriter = new myWriter();
        myWriter.writer(args);

        myScanner scanner = new myScanner(); // Legt scanner aus der Klasse myScanner an
        scanner.scan(args); //Ruft den scanner mit arguments auf.
    }
}