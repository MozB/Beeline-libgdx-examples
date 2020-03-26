package org.beelinelibgdx.examples.helloworld;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Align;

import org.beelinelibgdx.BeelineGame;
import org.beelinelibgdx.actors.BeelineActor;
import org.beelinelibgdx.actors.BeelineLabel;
import org.beelinelibgdx.screens.BeelineScreen;

import java.io.Serializable;

public class HelloWorldGame extends BeelineGame<Serializable> {
    public HelloWorldGame() {
        super(1920, 1080);
    }

    @Override
    public void create() {
        super.create();
        BeelineScreen screen = new BeelineScreen(getViewport());
        setScreen(screen);

        BeelineActor logo = new BeelineActor(getAssetManager().createSprite(() -> "logo"));
        logo.setPosition(0, getHeight(), Align.topLeft);
        screen.addActor(logo);

        BeelineActor redSquare = new BeelineActor(getAssetManager().createSprite(() -> "square"), 600, 200);
        redSquare.setColor(Color.RED);
        redSquare.setPosition(getWidth()/2, getHeight()/2, Align.center);
        screen.addActor(redSquare);

        BeelineLabel helloWorld = new BeelineLabel("Hello world!", getAssetManager().getSkin());
        helloWorld.setPosition(getWidth()/2, getHeight()/2, Align.center);
        screen.addActor(helloWorld);
    }
}
