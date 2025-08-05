import java.util.Scanner;

public class Prog1 {

    public static void main(String args[]) {
        // int a[],n;
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " Values");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("The elements are");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}