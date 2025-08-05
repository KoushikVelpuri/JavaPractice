//command line argumets
//while running the Java file must be proivde in command line arguments
public class Prog1 {
    public static void main(String[] args) {
        int n;
        n = args.length;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + args[i]);
        }
    }
}