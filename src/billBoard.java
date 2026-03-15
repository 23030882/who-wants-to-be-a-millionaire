
import java.time.LocalDate;
import java.util.Scanner;


public class billBoard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameController gameController = new GameController();
        Player player = new Player();

        QuestionBank questionBank = new QuestionBank();
        int currentLevel = 0;

        System.out.println("\n 🦑🦑 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 Welcome to who wants to be a Millionaire 😜😜😜😜 🦑🦑");
        System.out.println("\n 🦑🦑 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉 Before you can play please register 😜😜😜😜 🦑🦑");
        System.out.print("\n 🦑🦑 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉Please enter playerFull Name :");
        player.Name = input.nextLine();
        System.out.print("\n 🦑🦑 🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉Enter birth date (yyyy-MM-dd): ");
        player.birthDate = LocalDate.parse(input.nextLine());

        System.out.printf("Welcome %s born in %s\n", player.Name, player.birthDate);

        gameController.startGame(player, input);


    }
}


