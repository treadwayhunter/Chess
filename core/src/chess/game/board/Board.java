package chess.game.board;

import chess.game.utils.Position;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int size = 8;
    private Map<Position, Tile> board = new HashMap<>();
    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Position p = new Position(i, j);
                board.put(p, new Tile(p));
            }
        }
    }


    public void draw(SpriteBatch batch) {
        for(Tile t : board.values()) {
            batch.draw(t.getTexture(), t.getX(), t.getY(), 1, 1);
        }
    }

    public void dispose() {

    }
}
