import org.junit.Test;

import static org.junit.Assert.*;

public class MoveTypeTest {
    @Test
    public void shouldReturnCoperateIfInputisCO() {
        assertEquals(MoveType.COOPERATE,MoveType.valueFor("CO"));
    }

    @Test
    public void shouldReturnCheatIfInputisCH() {
        assertEquals(MoveType.CHEAT,MoveType.valueFor("CH"));
    }

    @Test
    public void shouldReturnNullIfInputisInvalid() {
        String inputText = "CY";
        assertNull(MoveType.valueFor(inputText));
    }
}