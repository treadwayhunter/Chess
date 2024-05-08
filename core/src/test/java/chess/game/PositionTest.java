package test.java.chess.game;

import chess.game.utils.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositionTest {
    @Test
    void CreatePosition() {
        Position p = new Position(1, 2);
        assertTrue(p != null);
    }

    @Test
    void PositionGetCoordinates() {
        Position p = new Position(1, 2);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
    }
}
