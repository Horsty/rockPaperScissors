import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
    String player1 = "";
    String player2 = "";

    public String simulateComputerInput() {
        String[] hands = {"Scissors","Rock", "Paper"};
        Random rand = new Random();
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
                if (player2.equals("Paper")) {
                    System.out.println("You win! \n" + player1 + " beats " + player2 + "!!!");
                    return true;
                } else return false;
            case "Rock":
                if (player2.equals("Scissors")) {
                    System.out.println("You win! \n" + player1 + " beats " + player2 + "!!!");
                    return true;
                }

                break;
            case "Paper":
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
