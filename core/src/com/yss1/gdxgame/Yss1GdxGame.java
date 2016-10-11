package com.yss1.gdxgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class Yss1GdxGame extends Game {

	public int sN;
	private Screen sMenu,sGame;
	@Override
	public void create () {
		//super.create();
		sMenu=new ScrMenu(this);
		sGame=new ScrGame(this);
		setScreen(sMenu);
		sN=0;

	}

	@Override
	public void render() {
		super.render();
		if (Gdx.input.isTouched())
		{
			if (sN==0)
			{
				sN=1;
				this.setScreen(sGame);
			}
			else
			{
				sN=0;
				this.setScreen(sMenu);
			}
		}
	}
}
