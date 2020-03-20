package org.beelinelibgdx.examples.helloworld;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main(String[] arg) {
		HelloWorldGame game = new HelloWorldGame();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = HelloWorldGame.getWidth()/2;
		config.height = HelloWorldGame.getHeight()/2;

		new LwjglApplication(game, config);
	}
}