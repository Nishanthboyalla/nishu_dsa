package beginner1;

import java.util.Scanner;

public class functionToUse {

    /**
     * method used to find volume of sphere
     * @param A - radius of sphere
     */
    public static void volumeOfSphere(final int A) {
        double pi = Math.PI;
        int product = (int)Math.ceil((4.0*pi*A*A*A)/(double)3.0);
        System.out.print(product);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int A = s.nextInt();
        volumeOfSphere(A);
    }
}
