import java.util.Scanner;

public class Prog2 {

    public static void main(String args[]) {
        int[][] a;
        int r, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter r,c value");
        r = in.nextInt();
        c = in.nextInt();
        a = new int[r][c];
        System.out.println("Enter " + r + "X" + c + " Values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }

        }
        System.out.println("The elements are");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }

}