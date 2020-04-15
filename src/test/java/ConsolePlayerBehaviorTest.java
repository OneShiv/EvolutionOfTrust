import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ConsolePlayerBehaviorTest {

    @Test
    public void shouldReturnCooperateIfInputIsCO() {
        // Reader inputString = new StringReader("CO");
        Scanner inputText = new Scanner("CO");
//        BufferedReader inputReader =
//                new BufferedReader(inputString);
        ConsolePlayerBehavior consolePlayerBehavior = new ConsolePlayerBehavior(inputText);
        assertEquals(consolePlayerBehavior.move(),MoveType.COOPERATE);
    }
}