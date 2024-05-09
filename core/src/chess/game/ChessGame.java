package chess.game;

import chess.game.board.Board;
import chess.game.board.Tile;
import chess.game.inputs.ChessInputProcessor;
import chess.game.utils.GlobalVars;
import chess.game.utils.Position;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
        viewport = new FitViewport((float)1920 / GlobalVars.UNIT_SIZE, (float)1080/GlobalVars.UNIT_SIZE, camera);
        Gdx.input.setInputProcessor(new ChessInputProcessor());
        camera.position.set((viewport.getWorldWidth() / 2) - 4, viewport.getWorldHeight() / 2, 0);

    }

    @Override
    public void render () {
        viewport.apply();
        camera.update();
        ScreenUtils.clear(0, 0, 0, 1);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
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
