import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Entr n value:");
        n=in.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.println(j+" ");

            }
            System.out.println(" ");
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println(" ");
        }
    }
}
