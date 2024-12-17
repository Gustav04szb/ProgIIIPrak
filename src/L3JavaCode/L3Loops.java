package L3JavaCode;

public class L3Loops {
    public static int summenForLoopA() {
        int sum = 0;
        for (int i = 0; 28 > i; i++) {
            sum += (i - 1) * (i - 1);
        }
        return sum;
    }

    public static int summenForLoopB() {
        int sum = 0;
        for (int i = 0; 100 > i; i++) {
            sum += (i * (i + 1)) / 2;
        }
        return sum;
    }

    public static int summenForLoopC() {
        int sum = 0;
        for (int i = 1; 25 > i; i++) {
            sum += (i + 1) / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summenForLoopA());
        System.out.println(summenForLoopB());
        System.out.println(summenForLoopC());
    }
}
