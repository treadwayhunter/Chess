package chess.game.board;

import chess.game.utils.Position;
import com.badlogic.gdx.graphics.Texture;

public class Tile {
    // has a size and a texture, however it should be in charge of it's texture
    private Texture texture;
    private Position position;

    public Tile(Position position) {
        this.position = position;
        updateTexture();
    }

    /**
     * For initial testing
     * @return
     */
    public String getColor() {
        return (position.getParity() & 1) == 0 ? "black" : "white";
    }

    public Texture getTexture() {
        return texture;
    }

    private void updateTexture() {
        try {
            if ((position.getParity() & 1) == 0) {
                texture = new Texture("tiles/black_tile.png");
            } else {
                texture = new Texture("tiles/white_tile.png");
            }
        }
        catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("Issue Changing the Texture of Tile at: " + position.getX() + " " + position.getY());
        }
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }
}
