package beginner2;

import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        int y = s.nextInt();
        insertElementIntoIndex(arr, x, y);
        System.out.print(arr[0]);
    }

    /**
     * this method is used to insert an element 'y' into position 'x' of an array 'arr'
     *
     * note: x is a 1-based indexing
     * @param arr - An array
     * @param x - An index/position which element to be inserted
     * @param y - An element that needs to be inserted
     */
    public static void insertElementIntoIndex(int []arr, int x, int y) {

        for(int i = x-1; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = y;
            y = temp;
        }
    }
}
