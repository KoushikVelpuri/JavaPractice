import java.util.InputMismatchException;
import java.util.Scanner;

class Prog3 {
    public static void main(String[] args) {
        int a[], n, i;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter n value:");
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println("The elements are:");
            for (i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ax) {
            System.out.println("Array out of index exception raised");
        } catch (InputMismatchException nx) {
            System.out.println("Input mis-match");
        }
    }
}