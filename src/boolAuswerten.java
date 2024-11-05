public class boolAuswerten {
     public void U2A6(){
        boolean a = true, b = false, c, d, e, f, g;
        c = a ^ b;
        d = !a || b;
        e = (d && !c) || !a;
        f = ((d == e) || (d != e) == true);
        g = 5==7;
        System.out.println("L2 "+ c +", L3 " + d + ", L4 " + e + ", L5 " + f + ", L6 " + g);
    }
}
