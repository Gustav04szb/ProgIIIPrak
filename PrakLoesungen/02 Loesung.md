#  02 Vorbereitungen und Javas kleinste Bausteine
## 02 – Verständnisfragen zur selbstständigen Beantwortung
### (1) Ist die Zuweisung eines Wertes in eine Variable auch manchmal von links nach rechts erlaubt?
> Nein, von rechts nach links.
### (2) Was verbirgt sich hinter dem Syntax-Highlighting?
> Verbessert die Lesbarkeit: Schlüsselwörter, Variablen und Kommentare werden hervorgehoben.
### (3) Worauf müssen wir bei den Wertebereichen von Zahlen besonders achten? Gerade wenn es um
> Grundlage vieler Operatoren &rarr; wichtig für die Speicherverwaltung.
### (4) komplizierte, unübersichtliche Berechnungen geht?
> Achtung auf die Grenzen der Datentypen, sonst droht ein Überlauf.
### (5) Was ist der Unterschied von a++ und ++a?
> `a++;` = Post-Inkrement (Zuweisung danach)\
> `++a;` = Pre-Inkrement (Zuweisung davor)
### (6) Worin unterscheiden sich die impli  zite und die explizite Typumwandlung?
> Implizit erfolgt die Umwandlung automatisch, z.B. von `int` zu `double`.\
> Explizit ist die Umwandlung erforderlich, weil Informationen verloren gehen können, z.B. von `double` zu `float`.

## 02 – Aufgabensammlung
### (1) Wandeln Sie die folgenden Binärzahlen in Dezimalzahlen um:
> a) 110        &rarr; 6\
> b) 1000000000 &rarr; 512\
> c) 1011101    &rarr; 93\
> d) 00000001   &rarr; 1

### (2) Wandeln Sie die folgenden Dezimalzahlen in Binärzahlen um
> a) 7      &rarr; 0111\
> b) 112    &rarr; 0111 0000\
> c) 1025   &rarr; 0100 0000 0001\
> d) 517    &rarr; 0010 0000 0101

### (3) Welche der folgenden Variablennamen sind gültig bzw. ungültig?
`Norbert, $eins, _abc123, #hallihallo, erne$sto, const, int, 1a, k_l-e_i-n, %nummer, Class, klasse, !wahr, final, blablubs`
> | Gültig                                                                  | Ungültig                                             |
> |-------------------------------------------------------------------------|------------------------------------------------------|
> | `Norbert, $eins, _abc123, erne$sto, k_l-e_i-n, CLass, klasse, blablubs` | `#hallihallo, const, int, 1a, %nummer, !wahr, final` |

### (4) Welchen Datentyp und welche Bezeichnung würden Sie für die folgenden Informationen vergeben:
> a) Alter einer Person                 &rarr; `int`\
> b) Anfangsbuchstabe                   &rarr; `char`\
> c) Position eines Lichtschalters      &rarr; `bool`\
> d) Geldbetrag Ihres Kontos            &rarr; `double`\
> e) Fläche eines Fußballfeldes ($cm^2$)   &rarr; `int`\
> f) Kreiszahl $\pi$                    &rarr; `final double`

### 

