package chess.game.board;

import chess.game.utils.Position;
import com.badlogic.gdx.graphics.Texture;

public class Tile {
    // has a size and a texture, however it should be in charge of it's texture
    private Texture texture;
    private Position position;

    public Tile(Position position) {
        this.position = position;

    }

    /**
     * For initial testing
     * @return
     */
    public String getColor() {
        int vector = position.getX() + position.getY();
        return vector % 2 == 0 ? "black" : "white";
    }



}
