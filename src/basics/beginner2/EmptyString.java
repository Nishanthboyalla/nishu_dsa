package basics.beginner2;

import java.util.Scanner;

public class EmptyString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.print(verifyStringCanBeEmptied(input));
    }

    /**
     * method verifies whether given string can be emptied or not on a condition
     * Condition: In a given string at a time 'p' can be removed when 'm' can be removed from any part of string
     *  Similarly 'a' can be removed when 'm' can be removed from any part of string
     *
     * @param input - string to check
     * @return true or false
     */
    private static boolean verifyStringCanBeEmptied(String input) {
        int paCounter = 0;
        int mCounter = 0;
        int len = input.length();
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            if (c == 'p' || c == 'a') {
                paCounter++;
            }
            else {
                mCounter++;
            }
        }
        return paCounter==mCounter;
    }
}
