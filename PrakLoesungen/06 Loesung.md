# 06 Arrays ein- und mehrdimensional
## 06 Verständnisfragen zur selbstständigen Beantwortung
### (1) Wie lassen sich die folgenden Zeilen jeweils im Speicher interpretieren. Geben Sie dafür Zeichnungen an:
```Java
int[][] a = new int[n][m];
int[][] c = {{1,2},{3}};
```
> a)
```mermaid
graph TD
a["a (int[][])"] --> a0["a[0] (int[m])"]
a --> a1["a[1] (int[m])"]
a --> an["a[n-1] (int[m])"]

    a0 --> a00["a[0][0]"]
    a0 --> a01["a[0][1]"]
    a0 --> a0m["a[0][m-1]"]
    
    a1 --> a10["a[1][0]"]
    a1 --> a11["a[1][1]"]
    a1 --> a1m["a[1][m-1]"]
    
    an --> an0["a[n-1][0]"]
    an --> an1["a[n-1][1]"]
    an --> anm["a[n-1][m-1]"]
```
> b)

```mermaid
graph TD
    c["c (int[][])"] --> c0["c[0] (int[2])"]
    c --> c1["c[1] (int[1])"]
    
    c0 --> c00["1"]
    c0 --> c01["2"]
    
    c1 --> c10["3"]
```
### (2) Welche Programmzeilen erzeugen die beiden folgenden Speicherkonstellationen
> ```JAVA
> int[][] a = new int[3][];
> a[0] = new int[]{1};      
> a[1] = new int[]{-1, 5};   
> a[2] = new int[]{2, 4, 6}; 

> ```JAVA
> float[][] b = new float[3][];      
> b[0] = new float[n];               // Erste Zeile mit n Elementen (n unbestimmt).
> b[1] = new float[]{3.5f, -0.3f};   
> b[2] = new float[]{0.0f, -4.03f, 2.0f};
```

## 06 Aufgabensammlung




