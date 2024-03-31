package Intermediate1.slidingwindow;

import java.util.HashMap;
import java.util.Scanner;

public class MaxSumSubArrayOfSizeK {

    /**
     * Method to print start and end index of a sub-array of size k
     * @param input - An integer array
     * @param k - size of sub-array
     * @return - map of start and end index
     */
    private static HashMap<String, Integer> printStartAndEndIndicesOfMaxSumSubArrayOfSizeK(int[] input, int k) {
        HashMap<String, Integer> result = new HashMap<>();
        //checking first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += input[i];
        }

        //iterating over other windows with reference of first window
        for (int i = 1; i <= input.length-k; i++) {
            if(sum < sum-input[i-1]+input[k+i-1]) {
                sum = sum-input[i-1]+input[k+i-1];
                result.put("Start", i);
                result.put("End", k+i-1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.println("startIndex: "+printStartAndEndIndicesOfMaxSumSubArrayOfSizeK(input, k).get("Start")+" EndIndex: "+printStartAndEndIndicesOfMaxSumSubArrayOfSizeK(input, k).get("End"));
    }
}
