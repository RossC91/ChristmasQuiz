import java.util.Scanner;

public class Quiz {

    Scanner scanner = new Scanner(System.in);
    private int score;
    private int choice;
    private String player;
    private boolean quit;


    public Quiz(String player) {
        this.player = player;
        this.score=0;
        this.choice=0;

    }

    public void questions() {
        System.out.println("what are the OG colours for Santa clause\n" +
                "1) Red and White\n" +
                "2) Green and White\n" +
                "3) Blue and White\n" +
                "4) Green and Red");
        choice = scanner.nextInt() - 1;
        scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Come on would it that simple, you got it wrong");
                    break;
                case 1:
                    System.out.println("Not this time buddy");
                    break;
                case 2:
                    //This is the correct answer
                    System.out.println("Great start you are of to a winner");
                    ++score;
                    break;
                case 3:
                    System.out.println("Very festive colours but wrong");
                    break;
            }
        if (score == 0) {
            System.out.println("Not of to a good start, you only have " + score+" points. Santa is not going to be happy if this continues");
        } else {
            System.out.println("Well done on getting the first question right, keep this up and your on the nice list for sure. You have " + score+" points");
        }
        System.out.println("How many reindeer does santa have\n" +
                "1) 6\n" +
                "2) 8\n" +
                "3) 10\n" +
                "4) 12");
        choice = scanner.nextInt() - 1;
        scanner.nextLine();
        switch (choice){
            case 0:
                System.out.println("Wrong");
                break;
            case 1:
                System.out.println("correct, someone knows their stuff");
                ++score;
                break;
            case 2:
                System.out.println("No luck this time");
                break;
            case 3:
                System.out.println("Come on that would be way to many");
                break;
        }
        if (score < 0){
            System.out.println("Not of to a good start, you only have "+score+" points. Santa is not going to be happy if this continues");
        }
        System.out.println("Well done, keep going and you might get the high score. You have "+score+" points");
        setQuit();
    }

    public int getScore() {
        return score;
    }

    public boolean isQuit() {
        return quit;
    }

    public void setQuit() {
        System.out.println("Play again?\n" +
                " 1) Yes\n" +
                " 2) No");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            this.quit=true;
        }else {
            this.quit=false;
        }
    }
}


