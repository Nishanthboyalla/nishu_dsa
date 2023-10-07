package leetcode;

import java.util.Scanner;

public class SwapVowels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        input = swapVowelsInASentence(input);
        System.out.print(input);
    }

    /**
     * This method is used to swap 2 consecutive vowels in a sentence
     *
     * eg- Sun rises in the east
     * o/p - Sin rusis en the east
     * @param input - a sentence
     * @return sentence with swapped vowels
     */
    private static String swapVowelsInASentence(String input) {
        char []inp = input.toCharArray();
        int n = inp.length;
        String vowels = "aeiou";
        int i = 0, j = 0;
        while (i < n) {
            if (j == n) {
                break;
            }
            else if (vowels.contains("" + Character.toLowerCase(inp[i]))) {
                j = i + 1;
                while(j < n) {
                    if (vowels.contains("" + Character.toLowerCase(inp[j]))) {
                        char temp = inp[i];
                        inp[i] = inp[j];
                        inp[j] = temp;
                        i = j + 1;
                        break;
                    }
                    else {
                        j++;
                    }
                }
            }  else {
                i++;
            }
        }
        String result = new String(inp);
        return result;
    }
}
