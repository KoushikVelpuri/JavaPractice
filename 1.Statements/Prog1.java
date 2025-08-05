import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        int score;
        String player_name, rank;
        Scanner in = new Scanner(System.in);
        player_name = in.next();
        System.out.println("Enter player name:");
        ;
        score = in.nextInt();
        if (score == 0)
            rank = "Duck Out";
        else if (score > 0 && score < 50)
            rank = "Below Half Century";
        else if (score == 50)
            rank = "Half Century";
        else if (score > 50 && score < 100)
            rank = "Below Century";
        else if (score == 100)
            rank = "Century";
        else if (score > 100 && score < 200)
            rank = "Below Double Century";
        else if (score == 200)
            rank = "Double Century";
        else
            rank = "Above Double Century";
        System.out.println(player_name + "scored " + score + " and his rank is " + rank);
    }
}