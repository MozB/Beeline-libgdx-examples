package org.beelinelibgdx.examples.modelactorcontract;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.beelinelibgdx.examples.helloworld.HelloWorldGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		ModelActorContractGame game = new ModelActorContractGame();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = HelloWorldGame.getWidth()/2;
		config.height = HelloWorldGame.getHeight()/2;

		new LwjglApplication(game, config);
	}
}