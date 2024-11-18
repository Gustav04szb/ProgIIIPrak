package L3JavaCode;

public class L3ForWhile {
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
    public static void main(String[] args) {
        L3ForWhile l3 = new L3ForWhile();

        l3.forInWhile1();
        l3.forInWhile2();
        l3.whileInFor();
    }
}
