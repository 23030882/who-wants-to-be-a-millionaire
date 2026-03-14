import java.util.Scanner;

public class GameController {

    QuestionBank questionBank = new QuestionBank();
    GameController() {

    }
    public void ShowMenu(Player player, Scanner input, int currentLevel){
        System.out.println("\n 🦑🦑 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉Welcome to who wants to be a Millionaire😜😜😜😜 🦑🦑");
        System.out.println("\n 🦑🦑🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 1.Procced to game 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🦑🦑");
        System.out.println("\n 🦑🦑🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 2.Exit 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🦑🦑");
        System.out.println("\n 🦑🦑🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 3.Read terms and conditions 🐉🐉🐉🐉🐉🐉🐉🐉🦑🦑");

        System.out.print("Option :");
        int option = input.nextInt();

        switch (option){
            case 1:
                questionBank.showMenu(player, input);
                break;
            case 2:
                return;
            case 3:
                questionBank.terms_and_Conditions();
                break;
            default:
                System.out.println("please select valid option (1-3)");
        }
    }

    public void AnswerChecker(String Answer,int score, int currentLevel){
        if(Answer.equals(questionBank.quiz.get(questionBank.getCorrectAnswerIndex()))){

            score +=100;
            currentLevel++;


        }
        else {
            currentLevel++;
        }
    }




}