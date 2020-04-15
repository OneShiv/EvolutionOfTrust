import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    private Game game;

    @Test
    public void shouldProcessWhenBothMovesAreCooperate() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player cheatPlayer = new Player(new CooperatePlayerBehavior());
        game = new Game(cooperatePlayer, cheatPlayer);
        ScoreBoard scores = game.play();

        assertEquals(new ScoreBoard(2,2), scores);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRoundsForBothCooperate() {
        Player cooperatePlayerOne = new Player(new CooperatePlayerBehavior());
        Player cooperatePlayerTwo = new Player(new CooperatePlayerBehavior());
        game = new Game(cooperatePlayerOne, cooperatePlayerTwo);
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(10,10), finalScore);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRoundsForCooperateAndCheat() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player cheatPlayer = new Player(new CheatPlayerBehavior());
        game = new Game(cooperatePlayer, cheatPlayer);
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(-5,15), finalScore);
    }

    @Test
    public void shouldGetTwoForBothForOneRoundOfCoperateAndConsoleWithCO() {
//        Player consolePlayer = mock(Player.class);
//        when(consolePlayer.makeMove()).thenReturn(MoveType.COOPERATE);
//        Reader inputString = new StringReader("CO");
//        BufferedReader br = new BufferedReader(inputString);
//        try {
//            Mockito.when(br.readLine()).thenReturn("CO");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextLine()).thenReturn("CO");
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player consolePlayer = new Player(new ConsolePlayerBehavior(scanner));
        game = new Game(cooperatePlayer, consolePlayer);
        ScoreBoard scores = game.play();
        assertEquals(new ScoreBoard(2,2), scores);
    }
}
