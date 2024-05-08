package test.java.chess.game;

import chess.game.board.Tile;
import chess.game.utils.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TileTest {
    @Test
    void ColorTest() {
        Position p1 = new Position(0, 0);
        Position p2 = new Position(0, 1);

        Tile tile1 = new Tile(p1);
        Tile tile2 = new Tile(p2);

        assertTrue(tile1.getColor().equals("black"));
        assertTrue(tile2.getColor().equals("white"));
    }
}
