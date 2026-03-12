
public class Question {
    public String question;
    public String options;
    public int correctAnswerIndex;


    public Question(String question, String options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public int getCorrectAnswerIndex(){

        return this.correctAnswerIndex;
    }
}

