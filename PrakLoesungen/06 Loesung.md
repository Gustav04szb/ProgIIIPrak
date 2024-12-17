# 06 Arrays ein- und mehrdimensional
## 06 Verständnisfragen zur selbstständigen Beantwortung
> Wie lassen sich die folgenden Zeilen jeweils im Speicher interpretieren. Geben Sie dafür Zeichnungen an:
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
> b)

```mermaid
graph TD
    c["c (int[][])"] --> c0["c[0] (int[2])"]
    c --> c1["c[1] (int[1])"]
    
    c0 --> c00["1"]
    c0 --> c01["2"]
    
    c1 --> c10["3"]