import java.util.Scanner;

//Arguments pass and Return value
public class Prog3 {
    public static int fact(int n) {

        int fact = 1, i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return (fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, count, f;
        System.out.println("Enter how many factorials you want calculate");
        count = in.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter any Number");
            n = in.nextInt();
            f = fact(n);
            System.out.println(n + " Fact is " + f);
        }

    }

}