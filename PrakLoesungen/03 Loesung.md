# 03 Grundlegende Prinzipien der Programmentwicklung
## 03–Verständnisfragen zur selbstständigen Beantwortung
### (1) Nenne die drei Programmprinzipien.
> Modularität, Abstraktion, Verbesserung & Polymorphismus
### (2) Lassen sich alle Schleifentypen ineinander überführen? Wenn ja, warum brauchen wir die unterschiedlichen Varianten überhaupt?
> for-, while- und do-while-Schleifen (unterschiedliche Vorteile)
### (3) Ist das Einrücken von Programmcode eine sinnvolle Sache?
> Für bessere Lesbarkeit & Struktur
### (4) Warum ist die Auslagerung von Funktionen sinnvoll?
> Wiederverwendbarkeit / bessere Wartbarkeit
## 03–Aufgabensammlung
### (1) Versuchen Sie ihr Lieblingsrezept in Pseudocode zu notieren und anschließend in ein Aktivitätsdiagramm zu übertragen.
```
BEGIN   Eierkuchen
        EIER in eine SCHÜSSEL geben
        RÜHREN (EIER)
        MEHL hinzufügen
        MILCH hinzufügen, bis die Mischung glatt ist
        ÖL in einer PFANNE erhitzen
        TEIG in die Pfanne geben
        PFANNKUCHEN von beiden Seiten braten
        SERVIEREN
END     Eierkuchen
```
### (2) Überlegen Sie sich Fälle, bei denen ein Programm nicht terminiert. Verwenden Sie für die Erläuterung ebenfalls Aktivitätsdiagramme.
> `while(true)` & Endlose Rekursion

```mermaid
graph TB
  StartWhile[Start] --> NodeWhile[Überprüfen der Bedingung]
  NodeWhile -->|true| DoAction[Aktion: Wiederhole]
  DoAction --> NodeWhile
```
```mermaid
graph TB
  StartRecursion[Start] --> CallRecursion[endloseRekursion]
  CallRecursion --> |Selbstaufruf|CallRecursion
```
### (3) Gehen Sie die einzelnen Schritte aus Abschnitt 2.3.2 durch und bringen Sie das Programm ProgrammEins zum Laufen:
```java
 public class ProgramEins {
    public static void main(String[] args) {
        System.out.println("Endlich ist es soweit! Mein erstes Programm läuft...");
    }
}
 ```
