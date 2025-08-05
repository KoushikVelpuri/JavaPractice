import java.util.Scanner;

//No Arguments pass and No Return values
public class Prog1 {

    public static void fact() {
        Scanner in = new Scanner(System.in);
        int fact = 1, n, i = 1;
        System.out.println("Enter any number");
        n = in.nextInt();
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(n + " Fact is " + fact);
    }

    public static void main(String[] args) {
        fact();
        fact();
        fact();
        fact();
        fact();
        fact();

    }

}