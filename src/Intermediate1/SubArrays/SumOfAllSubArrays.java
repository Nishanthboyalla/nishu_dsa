package Intermediate1.SubArrays;

import java.util.Scanner;

public class SumOfAllSubArrays {

    /**
     * Method to find sum of all sub-arrays of the given array
     * Example:
     * Array : [1 2 3 4]
     * Output : 50 => (1) + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (2) + (2 + 3) + (2 + 3 + 4) + (3) + (3 + 4) + (4)
     * @param input - Array of type int
     * @return - sum of all sub arrays
     */
    private static int sumOfAllSubArrays(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += ((i+1)*(input[i])*(input.length-i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(sumOfAllSubArrays(input));
    }
}
