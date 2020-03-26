package org.beelinelibgdx.examples.actorsninepatches;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.beelinelibgdx.examples.actorsninepatches.ActorsNinePatchesGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		ActorsNinePatchesGame game = new ActorsNinePatchesGame();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = ActorsNinePatchesGame.getWidth()/2;
		config.height = ActorsNinePatchesGame.getHeight()/2;

		new LwjglApplication(game, config);
	}
}