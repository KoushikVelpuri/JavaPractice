import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        int n, count = 0, i = 2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = in.nextInt();
        while (i < n) {
            if (n % i == 0)
                count++;
            i++;
        }
        if (count == 0)
            System.out.println("This is a prime number");
        else
            System.out.println("Not a prime number");

    }

}