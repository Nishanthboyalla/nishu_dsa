package basics.Intermediate1.slidingwindow;

import java.util.Scanner;

public class StartAndEndIndicesOfAllSubArraysOfSizeK {

    /**
     * method to print start and end index of all sub-arrays of length k
     * @param input - Array
     * @param k - length of sub-array
     */
    private static void printStartAndEndIndicesOfAllSubArraysOfSizeK(int[] input, int k) {
        int i = 0;
        while (i <= input.length-k) {
            System.out.println("Start Index is :"+ i + " and End Index is :"+ (k+i-1));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int k = s.nextInt();
        printStartAndEndIndicesOfAllSubArraysOfSizeK(input, k);
    }
}
