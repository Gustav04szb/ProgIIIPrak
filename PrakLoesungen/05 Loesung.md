# 05 Kleiner Ausflug in die Kryptographie
## 05–Verständnisfragen zur selbstständigen Beantwortung
### (1) Wir haben gesehen was passiert, wenn weniger Parameter übergeben werden als das Programm sie verlangt oder erwartet. Testen Sie, wie das Programm reagiert, wenn Sie mehr als die erwartete Anzahl von Parametern übergeben.
### (2) Erläutern Sie mit Ihren eigenen Worten, wie das Codierungsverfahren von Caesar funktioniert.
> Das **Caesar-Verfahren** verschiebt jeden Buchstaben im Klartext um eine feste Anzahl von Positionen im Alphabet. Zum Beispiel, bei einer Verschiebung von 3 wird `A` zu `D`, `B` zu `E` usw. Um den Text zu entschlüsseln, wird die Verschiebung in die entgegengesetzte Richtung angewendet. Es ist einfach, aber unsicher, da nur wenige mögliche Schlüssel existieren.
### (3) Erläutern Sie das xor-Codierungsverfahren und welchen entscheidenden Unterschied es in Bezug auf das Caesar-Codierungsverfahren hat.
> Das **XOR-Codierungsverfahren** verschlüsselt Daten, indem es jedes Bit des Klartextes mit dem entsprechenden Bit eines Schlüssels durch die XOR-Operation kombiniert. Zum Entschlüsseln wird der gleiche Schlüssel erneut angewendet, da XOR selbstinvertierend ist.
> #### Unterschied zum Caesar-Verfahren:
> - **Caesar** verschiebt Buchstaben im Alphabet, **XOR** arbeitet auf Bit-Ebene.
> - **XOR** ist symmetrisch (gleicher Schlüssel für Verschlüsselung und Entschlüsselung), während Caesar nur eine feste Verschiebung verwendet.
### (4) Erläutern Sie detailliert, was hat es mit dieser Programmzeile auf sich hat: zeichen[i] = (char)(zeichen[i]^key);
> Die Zeile `zeichen[i] = (char)(zeichen[i]^key);` führt eine **XOR-Operation** auf das Zeichen `zeichen[i]` und dem Schlüssel `key` durch. Das Ergebnis wird als neues Zeichen gespeichert.
### (5) Erklären Sie anhand eines konkreten Beispiels, wie die Strategie aussieht, die xor-Codierung zu knacken?
> Um eine XOR-Codierung zu knacken, verwendet man in der Regel die **Brute-Force-Methode**, bei der alle möglichen Schlüssel ausprobiert werden. Da der gleiche Schlüssel für Verschlüsselung und Entschlüsselung genutzt wird, kann man den verschlüsselten Text mit verschiedenen Schlüsseln XOR-verknüpfen und auf lesbaren Klartext prüfen. 
> 
> Ein **Schlüssel** (z. B. `3`) wird auf den verschlüsselten Text angewendet. Wenn das Ergebnis lesbar ist, hat man den richtigen Schlüssel gefunden. Da XOR selbstinvertierend ist, kann der verschlüsselte Text so entschlüsselt werden.

### (6) Wie und warum unterscheiden wir zwei Typen von Binäroperatoren in Java? Geben Sie für beide gute  Beispiele an.
> **Arithmetische Operatoren** führen mathematische Berechnungen durch (z. B. `+`, `-`).
> **Logische Operatoren** vergleichen Wahrheitswerte oder führen bitweise Operationen durch (z. B. `&&`, `&`).
## 05–Aufgabensammlung
### (1)Wir haben gesehen was passiert, wenn weniger Parameter übergeben werden als das Programm sie verlangt oder erwartet
```Java
public class MeineEingaben { 
    public static void main(String[] args) {
        System.out.println("Eingabe 1: >"+args[0]+"< und");
        System.out.println("Eingabe 2: >"+args[1]+"<");
    }
}
```
### (2)
> [!NOTE]
> [Hier findest du das Funktionen aus der Vorlesung ](../src/L5JavaCode/L5ArbeitenMirArgs.java) \
> `readFileFromArgs(String[] args);` \
> `writeToFileFromArgs(String[] args)`\
> `printArgsToConsol(String [] args)`