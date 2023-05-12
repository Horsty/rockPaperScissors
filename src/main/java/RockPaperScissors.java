import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
    String player1 = "";
    String player2 = "";
    private static final String SCISSORS = "scissors";
    private static final String PAPER = "Paper";

    public String simulateComputerInput() {
        String[] hands = {SCISSORS,"Rock", PAPER};
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(3);
        return hands[rand_int1];
    }
    public boolean playWith(String player1,String player2) {
        System.out.println("Playing with " + player1);
        if (player1.equals(player2)) {
            System.out.println("Computer has got " + player2 + ". Draw! Try again!");
            return false;
        }
        switch (player1) {
            case "Scissors":
                if (player2.equals(PAPER)) {
                    System.out.println("You win! \n" + player1 + " beats " + player2 + "!!!");
                    return true;
                } else return false;
            case "Rock":
                if (player2.equals("Scissors")) {
                    System.out.println("You win! \n" + player1 + " beats " + player2 + "!!!");
                    return true;
                }

                break;
            case PAPER:
                if (player2.equals("Rock")) {
                    System.out.println("You win! \n" + player1 + " beats " + player2 + "!!!");
                    return true;
                }

                break;
        }
        System.out.println("You lose! \n" + player2 + " beats " + player1 + "!!!");
        return false;
    }
}
