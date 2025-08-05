import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        int amount, cum_amount = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter amount:");
            amount = in.nextInt();
            if (amount > 0)
                cum_amount += amount;
            System.out.println(cum_amount);
        } while (amount > 0);
    }

}
