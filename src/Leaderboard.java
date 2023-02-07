public class Leaderboard {

    private Player root = null;

    public Leaderboard(Player root) {
        this.root = root;
    }

    public boolean addPlayer(Player player) {
        if (this.root == null) {
            this.root = player;
            return true;
        }
        Player currentPlayer = this.root;
        while (currentPlayer != null) {
            boolean comparison;
            comparison = currentPlayer.getScore() > player.getScore();
            if (comparison) {
                if (currentPlayer.next() != null) {
                    currentPlayer = currentPlayer.next();
                } else {
                    currentPlayer.setNext(player).setPrevious(currentPlayer);
                    return true;
                }
            } else if (!comparison) {
                if (currentPlayer.previous() != null) {
                    currentPlayer.previous().setNext(player).setPrevious(currentPlayer.previous());
                    player.setNext(currentPlayer).setPrevious(player);
                } else {
                    player.setNext(this.root).setPrevious(player);
                    this.root = player;
                }
                return true;
            } else {
                System.out.println(player.getName() + " is already present, not added");
                return false;
            }

        }
        return false;
    }

    public void getLeaderboard() {
        int i = 1;
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(i + ") " + root.getName() + " has a score of " + root.getScore());
                root = root.next();
                i++;
            }
        }
    }
}
