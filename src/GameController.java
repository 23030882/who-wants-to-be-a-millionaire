import java.util.List;
import java.util.Scanner;

public class GameController {

    boolean fiftyFiftyUsed;
    boolean phoneAFriendUsed;
    QuestionBank questionBank = new QuestionBank();
    LifeLineServices lineServices = new LifeLineServices();
    GameController() {

    }

    public void startGame(Player player, Scanner input) {
        while (true) {
            showMainMenu(player, input);

        }
    }
    public void showMainMenu(Player player, Scanner input){
        System.out.println("\n 🦑🦑 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉Welcome to who wants to be a Millionaire😜😜😜😜 🦑🦑");
        System.out.println("\n 🦑🦑🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 1.Procced to game 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🦑🦑");
        System.out.println("\n 🦑🦑🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 2.Exit 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🦑🦑");
        System.out.println("\n 🦑🦑🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 3.Read terms and conditions 🐉🐉🐉🐉🐉🐉🐉🐉🦑🦑");

        System.out.print("Option :");
        int option = input.nextInt();
        input.nextLine();

        switch (option){
            case 1:
                questionBank.showMenu(player, input);
                playGame(player, input);
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

    public void playGame(Player player, Scanner input) {
        System.out.println("\n=== GAME STARTED ===");
        int currentLevel = 0;

        // Reset lifelines for new game
        fiftyFiftyUsed = false;
        phoneAFriendUsed = false;

        while (currentLevel < questionBank.quiz.size()) {
            Question q = questionBank.QuestionServer(currentLevel);

            if (q == null) {
                System.out.println("Error loading question!");
                break;
            }
            boolean answered = false;
            String userChoice = "";

            if (!answered){

                System.out.println("\n╔══════════════════════════════════════╗");
                System.out.println("║  Question " + (currentLevel + 1) + " - $" + getPrizeForLevel(currentLevel) + "  ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println("\n" + q.question);
                System.out.println(q.options);


                System.out.print("\nYour answer (A/B/C/D/E) or L for lifeline: ");
                userChoice = input.nextLine().toUpperCase();

                if (userChoice.equals("L")) {
                    UseLifeLines(input, q, currentLevel);
                }else  {
                    answered = true;
                }

            }

            boolean isCorrect = AnswerChecker(userChoice, q);

            if (isCorrect) {
                System.out.println("\n✅ CORRECT! You've won $" + getPrizeForLevel(currentLevel));
                currentLevel++;

                if (currentLevel < questionBank.quiz.size() && (currentLevel + 1) % 10 == 0) {
                    System.out.print("\nContinue playing? (Y/N): ");
                    String choice = input.nextLine().toUpperCase();
                    if (!choice.equals("Y")) {
                        System.out.println("\n💰 Walking away with $" + getPrizeForLevel(currentLevel - 1) + "! Congratulations!");
                        break;
                    }
                } else {
                    System.out.println("\n🏆🏆🏆 CONGRATULATIONS! "+player.Name +" YOU'VE WON $1,000,000! 🏆🏆🏆");
                }
            } else {
                System.out.println("\n❌ WRONG! Game Over.");
                System.out.println(player.Name+" You leave with $0");
                break;
            }
        }
    }

    private void UseLifeLines(Scanner input, Question q, int currentLevel) {

        if (fiftyFiftyUsed && phoneAFriendUsed){
            System.out.println("❌ All lifelines have already been used!");
            return;
        }

        System.out.print("\n ------ Available Lifelines ------");
        if (!fiftyFiftyUsed) System.out.print("1."+ "[50:50] ");
        if (!phoneAFriendUsed) System.out.print("2."+ "[Phone a Friend]: ");
        System.out.println("3. Go Back");

        System.out.print("Select: ");
        String choice = input.nextLine();

        switch (choice){
            case "1":
                if (!fiftyFiftyUsed) {
                    List<Integer> incorrect = lineServices.use5050(q);
                    System.out.print("Lifeline used! Incorrect options are: ");
                    for (int idx : incorrect) {
                        System.out.print((char)('A' + idx - 1) + " ");
                    }
                    System.out.println();
                    fiftyFiftyUsed = true;
                } else {
                    System.out.println("Already used!");
                }
                break;
            case "2":
                if (!phoneAFriendUsed) {
                    String advice = lineServices.usePhoneAFriend(q, currentLevel);
                    System.out.println("\n📞 Calling your friend...");
                    System.out.println(advice);
                    phoneAFriendUsed = true;
                } else {
                    System.out.println("Already used!");
                }
                break;
            default:
                break;
        }
    }


    public boolean AnswerChecker(String userAnswer, Question currentQuestion) {
        char correctLetter = switch (currentQuestion.getCorrectAnswerIndex()) {
            case 1 -> 'A';
            case 2 -> 'B';
            case 3 -> 'C';
            case 4 -> 'D';
            case 5 -> 'E';
            default -> ' ';
        };

        return userAnswer.equalsIgnoreCase(String.valueOf(correctLetter));
    }
    private int getPrizeForLevel(int level) {
        int[] prizes = {100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000,
                64000, 125000, 250000, 500000, 1000000};
        if (level < prizes.length) {
            return prizes[level];
        }
        return 1000 * (level + 1);
    }
}