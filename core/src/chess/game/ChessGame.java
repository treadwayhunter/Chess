package chess.game;

import chess.game.board.Board;
import chess.game.board.Tile;
import chess.game.utils.Position;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class ChessGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;

    Viewport viewport;
    OrthographicCamera camera;

    Board board;
    @Override
    public void create () {
        batch = new SpriteBatch();
        board = new Board();
        camera = new OrthographicCamera();
        viewport = new FitViewport(1920/128, 1080/128, camera);

        camera.position.set((viewport.getWorldWidth() / 2) - 4, viewport.getWorldHeight() / 2, 0);

    }

    @Override
    public void render () {
        viewport.apply();
        camera.update();
        ScreenUtils.clear(0, 0, 0, 1);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        //batch.draw(img, 0, 0);
        //batch.draw(tile.getTexture(), tile.getX(), tile.getY(), 1, 1);
        //batch.draw(tile2.getTexture(), tile2.getX(), tile2.getY(), 1, 1);
        board.draw(batch);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        //img.dispose();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }
}
