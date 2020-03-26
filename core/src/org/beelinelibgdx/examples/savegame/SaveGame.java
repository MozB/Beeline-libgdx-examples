package org.beelinelibgdx.examples.savegame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Align;

import org.beelinelibgdx.BeelineGame;
import org.beelinelibgdx.actors.BeelineActor;
import org.beelinelibgdx.actors.BeelineLabel;
import org.beelinelibgdx.actors.BeelineNinePatch;
import org.beelinelibgdx.actors.NinePatchStyle;
import org.beelinelibgdx.actors.NinePatchStyleBuilder;
import org.beelinelibgdx.exception.BeelineLoadFailureException;
import org.beelinelibgdx.exception.BeelineLoadFileNotFoundException;
import org.beelinelibgdx.screens.BeelineScreen;

import java.io.IOException;
import java.io.Serializable;

public class SaveGame extends BeelineGame<IncrementInteger> {
    private BeelineNinePatch counterButton;
    private IncrementInteger currentGame;

    public SaveGame() {
        super(1920, 1080);
    }

    @Override
    public void create() {
        super.create();
        try {
            currentGame = loadGame("mygame.savegame");
        } catch (IOException | ClassNotFoundException | BeelineLoadFailureException e) {
            throw new IllegalStateException(e);
        } catch (BeelineLoadFileNotFoundException e) {
            currentGame = new IncrementInteger();
        }

        BeelineScreen screen = new BeelineScreen(getViewport());
        setScreen(screen);

        NinePatchStyle style = new NinePatchStyleBuilder()
                .withTexture(() -> "ninepatch")
                .withBorder(60)
                .build();
        counterButton = new BeelineNinePatch(getAssetManager().createNinePatchStyle(style),
                500, 200, "") {
            @Override
            public void onTouchUp() {
                super.onTouchUp();
                currentGame.counter++;
                refreshButtons();
                SaveGame.this.saveGame(currentGame,"mygame.savegame");
            }
        };
        counterButton.setPosition(getWidth()/2, getHeight()/2, Align.center);
        screen.addActor(counterButton);

        BeelineLabel instructions = new BeelineLabel("Click to increment and save game!", getAssetManager().getSkin());
        instructions.setPositionAndResize(getWidth()/2, counterButton.getY() + counterButton.getHeight() + 10, Align.bottom);
        screen.addActor(instructions);

        refreshButtons();
    }

    private void refreshButtons() {
        counterButton.setText(String.valueOf(currentGame.counter));
    }
}
