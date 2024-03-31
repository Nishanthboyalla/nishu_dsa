package basics.Intermediate1.carryforward;

import java.util.Scanner;

public class CountPairs {

    /**
     * Method to test the logic
     * @param args - String array
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.print(getCountOfPairs(input));
    }

    /**
     * method to count number of pairs of 'a' & 'g'
     * Condition - 'a' should be preceding 'g'
     * @param input - String that contains set of characters
     * @return - integer representing count of pairs
     */
    private static int getCountOfPairs(String input) {
        int countA = 0, pairCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g' || input.charAt(i) == 'G') {
                pairCount += countA;
            }
            else if(input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                countA++;
            }
        }
        return pairCount;
    }
}
