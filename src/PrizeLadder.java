public class PrizeLadder {

    public int score;
    public int price;
    public int currentLevel;


    PrizeLadder (int score, int price, int currentLevel){
        this.price = price;
        this.score = score;
        this.currentLevel = currentLevel;

    }

    public int score() {
        score = 0;
        for (currentLevel = 0 ; currentLevel<= 49 ; currentLevel++){
            score +=100;

        }

        return score;
    }

}
