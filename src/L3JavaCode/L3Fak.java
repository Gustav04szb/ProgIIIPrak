package L3JavaCode;

public class L3Fak {
    public static int fakultaet(int input){
        if (input < 0) {
            throw new IllegalArgumentException("Die Zahl muss nicht negativ sein.");
        }
        if(input > 19){
            throw new IllegalArgumentException("Die Zahl darf nicht größer als 19 sein.");
        }
        if (input == 0 || input == 1) {
            return 1; // Basisfall: 0! und 1! sind 1
        }
        return input * fakultaet(input - 1);

    }

    public static void main(String[] args) {
        System.out.println(fakultaet(15));
    }
}
