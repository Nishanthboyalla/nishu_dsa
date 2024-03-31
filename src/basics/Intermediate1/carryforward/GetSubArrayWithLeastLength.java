package basics.Intermediate1.carryforward;

import java.util.Scanner;

public class GetSubArrayWithLeastLength {
    public static int getSubArrayLengthWithLeastSize(int []input) {
        int max = input[0];
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if(input[i] > max) {
                max = input[i];
            }
            else if(input[i] < min) {
                min = input[i];
            }
        }
        if (max == min) {
            return 1;
        }
        int least_min = -1;
        int least_max = -1;
        int leastSize = input.length;
        for (int i = 0; i < input.length; i++) {
            if(input[i] == max) {
                if(least_min > -1) {
                    leastSize = Math.min(i-least_min+1, leastSize);
                }
                least_max = i;
            } else if (input[i] == min) {
                if(least_max > -1) {
                    leastSize = Math.min(i-least_max+1, leastSize);
                }
                least_min = i;
            }
        }
        return leastSize;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(getSubArrayLengthWithLeastSize(input));
    }
}
