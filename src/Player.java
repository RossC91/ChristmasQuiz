public class Player {
    private String name;
    private int score;
    protected Player rightLink = null;
    protected Player leftLink = null;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    Player next() {
        return this.rightLink;
    }

    Player setNext(Player item) {
        this.rightLink = item;
        return this.rightLink;
    }


    Player previous() {
        return this.leftLink;
    }


    Player setPrevious(Player item) {
        this.leftLink = item;
        return this.leftLink;
    }




    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
