package com.yss1.gdxgame;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by a0804 on 10.10.2016.
 */

public class ScrGame implements Screen {
    SpriteBatch batch1;
    Texture img1;

    private Game game;

    public ScrGame(Game g)
    {
        game=g;
        batch1 = new SpriteBatch();
        img1 = new Texture("badlogic.jpg");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch1.begin();
        batch1.draw(img1, 10, 10);
        batch1.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch1.dispose();
        img1.dispose();
    }
}
