import java.util.Scanner;

//Arguments pass But No Return values
public class Prog2 {

    public static void fact(int n) {

        int fact = 1, i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(n + " Fact is " + fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, count;
        System.out.println("Enter how many factorials you want calculate");
        count = in.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter any Number");
            n = in.nextInt();
            fact(n);
        }

    }

}