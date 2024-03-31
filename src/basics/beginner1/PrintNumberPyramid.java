package basics.beginner1;

import java.util.Scanner;

public class PrintNumberPyramid {

    /**
     * This class is used to build a pyramid pattern by taking number as input
     *
     * eg: input n = 4
     *
     * output     1 (n-1 spaces before number 1)
     *           1 2 (n-2 spaces before number 1)
     *          1 2 3 (n-3 spaces before number 1)
     *         1 2 3 4 (n-4 spaces before number 1)
     * @param args - main method accepts all arguments as array of string
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
