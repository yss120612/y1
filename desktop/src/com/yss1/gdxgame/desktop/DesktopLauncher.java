package com.yss1.gdxgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.yss1.gdxgame.Yss1GdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//config.height=720;
		//config.width=1280;
		new LwjglApplication(new Yss1GdxGame(), config);
	}
}
