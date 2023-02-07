import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int playGame = 0;
        boolean quit = true;
        List<Player> players = new ArrayList<Player>();
        Leaderboard leaderboard = new Leaderboard(null);

        while (playGame < 2) {
            System.out.println("Merry Christmas please enter your name to begin the quiz");
            String name = scanner.nextLine();


            while (quit) {
                Player player = new Player(name);
                Quiz quiz = new Quiz(name);
                quiz.questions();
                player.setScore(quiz.getScore());
                System.out.println(name + " your final score is " + player.getScore());
                players.add(player);
                quit = quiz.isQuit();
                System.out.println("");
                if (!quit) {
                    leaderboard.addPlayer(player);
                }
            }
            quit = true;


            System.out.println("To quit the game Enter 2, if someone else would like a go enter 1");
            playGame = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("The highScores are ");
        leaderboard.getLeaderboard();
    }
}