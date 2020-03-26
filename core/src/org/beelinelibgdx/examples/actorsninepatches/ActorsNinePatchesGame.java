package org.beelinelibgdx.examples.actorsninepatches;

import org.beelinelibgdx.BeelineGame;

import java.io.Serializable;

public class ActorsNinePatchesGame extends BeelineGame<Serializable> {
    public ActorsNinePatchesGame() {
        super(1920, 1080);
    }

    @Override
    public void create() {
        super.create();
        MyScreen screen = new MyScreen(getViewport(), getAssetManager());
        setScreen(screen);
    }
}
