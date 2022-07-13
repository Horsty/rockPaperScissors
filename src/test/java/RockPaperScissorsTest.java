import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {

    RockPaperScissors game = new RockPaperScissors();

    @Test
    public void scissorsBeatsPaperTest() {
        String scissor = "Scissors";
        String paper = "Paper";

        assertTrue(game.playWith(scissor, paper));
    }

    @Test
    public void rockBeatsScissorsTest() {
        String rock = "Rock";
        String scissor = "Scissors";

        assertTrue(game.playWith(rock, scissor));
    }

    @Test
    public void paperBeatsRock() {
        String paper = "Paper";
        String rock = "Rock";

        assertTrue(game.playWith(paper, rock));
    }

    @Test
    public void rockLosesAgainstPaperTest() {
        String rock = "Rock";
        String paper = "Paper";

        assertFalse(game.playWith(rock, paper));
    }

    @Test
    public void randomHandComputerInputTest() {
        String hand = game.simulateComputerInput();
        assertTrue(hand.equals("Scissors") || hand.equals("Rock") || hand.equals("Paper"));
    }

    @Test
    public void simulateComputerInputTest() {
        String hand = game.simulateComputerInput();
        assertTrue(game.playWith("Rock",hand));
    }
}
