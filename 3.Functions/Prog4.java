import java.util.Scanner;

//No Arguments pass But  Return value
public class Prog4 {
    public static int fact() {

        int fact = 1, i = 1, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Number");
        n = in.nextInt();
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.print(n);
        return (fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, count, f;
        System.out.println("Enter how many factorials you want calculate");
        count = in.nextInt();

        for (int i = 1; i <= count; i++) {

            f = fact();
            System.out.println(" Fact is " + f);
        }

    }

}