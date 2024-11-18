package L2JavaCode;

public class L2BoolAuswerten {
    public void boolAuswerten(){
        boolean a = true, b = false, c, d, e, f, g;
        c = a ^ b;
        d = !a || b;
        e = (d && !c) || !a;
        f = ((d == e) || (d != e) == true);
        g = 5==7;
        System.out.println("L2 "+ c +", L3 " + d + ", L4 " + e + ", L5 " + f + ", L6 " + g);
    }

    public static void main(String[] args) {
        new L2BoolAuswerten().boolAuswerten();
    }


}
