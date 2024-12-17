package L6JavaCode;

import java.util.Arrays;

public class L6Arrays {

    private static void initRandomMatrix(int[][] list){
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++){
                list[i][j] = 4 + (int) (Math.random() * 7);
            }
        }
    }
    private static void printArray(int[] list){
        System.out.println("Array List");
        for (int j : list) {
            if (j != list.length){
                System.out.print(j + ", ");
            } else{
                System.out.print(j);
            }
        }
    }
    private static void printMatrix(int[][] list){
        System.out.println("\nRandom Matrix: " + list.length + "x" + list[0].length);
        for (int[] ints : list) {
            for (int anInt : ints) {
                System.out.print(anInt + ",\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(a);
        System.out.println();
        int[][] b = new int[10][10];
        initRandomMatrix(b);
        printMatrix(b);
    }
}
