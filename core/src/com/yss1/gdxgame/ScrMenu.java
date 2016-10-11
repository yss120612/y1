package com.yss1.gdxgame;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by a0804 on 10.10.2016.
 */

public class ScrMenu implements Screen {
    SpriteBatch batch;
    Texture img;
    private Game game;
    BitmapFont font;

    OrthographicCamera camera;
    public ScrMenu(Game g)
    {
        game=g;
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        font=new BitmapFont();

        camera=new  OrthographicCamera(800,480);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        font.draw(batch,"Приветиг!",100,350,300,0,true);

        batch.draw(img, 0, 0);
        batch.end();
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
        batch.dispose();
        img.dispose();
        font.dispose();
    }
}
