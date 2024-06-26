package chess.game.utils;

public class Position {
    private int x, y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getParity() {
        return x + y;
    }
}
