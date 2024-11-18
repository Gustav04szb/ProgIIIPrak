package L3JavaCode;

public class L3Formeln {
    public int formelf1x(int input){
        return input;
    }
    public float formelf1x(float input){
        return input;
    }
    public int formelf2x(int input){
        return (input * input) / 2 + (17 *2);
    }
    public float formelf2x(float input){
        return  (input * input) / 2 + (17 *2);
    }

    public float formelf3x(float input){
        return (float) (Math.pow(input,3) - 14) / 2;
    }
    public double formelf3x(double input){
        return (Math.pow(input,3) - 14) / 2;
    }

    public static void main(String[] args) {
        L3Formeln formeln = new L3Formeln();
        int aIntNumber = 5;
        float aFloatNumber = 2.8f;

        System.out.println(formeln.formelf1x(aIntNumber));
        System.out.println(formeln.formelf1x(aFloatNumber));
        System.out.println(formeln.formelf2x(aIntNumber));
        System.out.println(formeln.formelf2x(aFloatNumber));
        System.out.println(formeln.formelf3x(aIntNumber));
        System.out.println(formeln.formelf3x(aFloatNumber));
    }

}
