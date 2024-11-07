# 04 UML, Zustandsdiagramme
## 04 – Verständnisfragen zur selbstständigen Beantwortung
### (1) Warum haben Zustandsdiagramme eine besondere Bedeutung bei der Kommunikation zwischenProgrammierern und Designern?
>Zustandsdiagramme sind besonders wichtig, weil sie den Ablauf und die Zustände eines Systems visuell darstellen. Dadurch können Programmierer und Designer besser verstehen, wie das System auf verschiedene Ereignisse reagiert und wie es sich verändert. Das schafft eine klare, gemeinsame Basis und erleichtert die Kommunikation über das Verhalten der Anwendung.

### (2) Nennen Sie sechs Gründe, die für den Einsatz einer Zustandsmaschine sprechen.
> 1. **Klarheit**: Zustandsmaschinen machen den Systemablauf und die Zustände transparent und leicht verständlich. 
> 2. **Fehlervermeidung**: Durch klar definierte Zustandsübergänge werden unvorhergesehene Systemzustände vermieden. 
> 3. **Wartbarkeit**: Änderungen und Erweiterungen lassen sich einfacher und systematischer umsetzen. 
> 4. **Effizienz**: Zustandsmaschinen erlauben optimierte Abläufe und reduzieren unnötige Zustandsabfragen. 
> 5. **Wiederverwendbarkeit**: Einmal entwickelte Zustandsmaschinen können oft für ähnliche Anwendungen wiederverwendet werden. 
> 6. **Testsicherheit**: Zustandsübergänge lassen sich systematisch testen, was die Qualitätssicherung erleichtert.
### (3) Erläutern Sie den Vorteil von Enumeratoren im Vergleich zu einem int bzw. einem String (Zeichenkette) bei der Implementierung einer Zustandsmaschine in Java.
> Der Einsatz von Enumeratoren bietet mehrere Vorteile gegenüber int oder String bei der Implementierung einer Zustandsmaschine in Java:
> 1. **Typensicherheit**: Enumeratoren verhindern, dass ungültige Zustandswerte verwendet werden können, da nur vordefinierte Werte zulässig sind. 
> 2. **Lesbarkeit**: Der Code wird lesbarer, da die Zustände durch sprechende Namen (z. B. State.START, State.END) statt durch Zahlen oder Strings dargestellt werden. 
> 3. **Wartbarkeit**: Änderungen an Zuständen sind einfacher, da alle Zustandswerte zentral in der Enum-Klasse definiert sind. 
> 4. **Fehlerreduktion**: Mit Enumeratoren wird vermieden, dass durch Tippfehler (wie bei Strings) falsche Zustände verwendet werden. 
> 5. **Zusätzliche Funktionalität**: Enums können Methoden und Attribute enthalten, die für den Zustand spezifisch sind, was zusätzliche Funktionalitäten ermöglicht.
### (4) Was ist eine Fuzzy-Finite-State-Machine? Welche Motivation liegt dieser Form einer Zustandsmaschine zu Grunde
>Eine **Fuzzy-Finite-State-Machine (Fuzzy FSM)** ist eine erweiterte Form der Zustandsmaschine, die Fuzzy-Logik verwendet, um die Übergänge zwischen Zuständen nicht nur durch klare, binäre Bedingungen zu steuern, sondern auch durch unscharfe, graduelle Bedingungen. Anstatt dass ein Zustand immer nur in einem festen Zustand oder einem bestimmten Übergang aktiv wird, kann ein Zustand basierend auf einem kontinuierlichen Spektrum von Eingabewerten (z. B. zwischen 0 und 1) aktiv werden.
> #### Motivation hinter Fuzzy FSM:
>1. **Unsicherheit und Flexibilität**: In realen Systemen sind die Eingaben und Bedingungen oft nicht schwarz-weiß, sondern können ungenau oder unscharf sein. Eine Fuzzy FSM ermöglicht es, mit dieser Unsicherheit umzugehen und graduelle Übergänge zu modellieren.
>2. **Realistischere Modellierung**: Viele reale Systeme reagieren nicht abrupt auf Änderungen, sondern in einem Übergangsbereich. Fuzzy FSMs erlauben eine fließende Zustandsänderung, die diese natürlichen Übergänge besser widerspiegelt.
>3. **Verbesserte Steuerung**: Sie können verwendet werden, um die Steuerung von Systemen zu verbessern, bei denen Entscheidungen nicht mit klaren Schwellenwerten getroffen werden, sondern auf unscharfen, unsicheren oder teilweise bekannten Informationen basieren.
## 04 –Aufgabensammlung
### (1) Verbessern Sie durch Umstrukturierung und Auslagerung von Programmteilen in Funktionen die Eigenschaften Übersichtlichkeit, Erweiterbarkeit und Wartbarkeit des Programms Javagotchi
> [!NOTE]
> [Hier findest du das Javagotich mit einer verbesserten Funktion](../src/JavaGotchi.java)
```java
public class Main {
    public static void main(String[] args) {
        new JavaGotchi().Einschalten();
    }
}
```