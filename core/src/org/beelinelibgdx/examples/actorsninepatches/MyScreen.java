package org.beelinelibgdx.examples.actorsninepatches;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.Viewport;

import org.beelinelibgdx.actors.BeelineActor;
import org.beelinelibgdx.actors.BeelineAssetManager;
import org.beelinelibgdx.actors.BeelineNinePatch;
import org.beelinelibgdx.actors.NinePatchStyleBuilder;
import org.beelinelibgdx.actors.PreGameLaunchConfigBuilder;
import org.beelinelibgdx.screens.BeelineScreen;

class MyScreen extends BeelineScreen {
    private final BeelineActor logo;

    public MyScreen(Viewport viewport, BeelineAssetManager assets) {
        super(viewport);

        logo = new BeelineActor(assets.createSprite(() -> "logo")) {
            @Override
            public void onTouchUp() {
                super.onTouchUp();
                flipLogo();
            }
        };
        logo.setOrigin(logo.getWidth()/2, logo.getHeight()/2);
        logo.setPosition(0, getHeight(), Align.topLeft);
        addActor(logo);

        BeelineNinePatch ninePatch = new BeelineNinePatch(assets.createNinePatchStyle(
                new NinePatchStyleBuilder()
                        .withTexture(() -> "ninepatch")
                        .withBorder(60)
                        .build()),
                600, 200, "My nine patch");
        ninePatch.setPosition(getWidth()/2, getHeight() - 50, Align.top);
        addActor(ninePatch);

        BeelineNinePatch ninePatchThin = new BeelineNinePatch(assets.createNinePatchStyle(
                new NinePatchStyleBuilder()
                        .withTexture(() -> "ninepatch")
                        .withPressedDownTexture(() -> "ninepatch-down")
                        .withBorder(60)
                        .build()),
                300, 400, "My thin nine patch");
        ninePatchThin.setPosition(getWidth()/2, ninePatch.getY() - 50, Align.top);
        ninePatchThin.getLabel().setWrap(true);
        addActor(ninePatchThin);

        BeelineNinePatch ninePatchButton = new BeelineNinePatch(
                assets.createNinePatchStyle(
                        new NinePatchStyleBuilder()
                                .withTexture(() -> "ninepatch")
                                .withColor(Color.BLUE)
                                .withPressedDownTexture(() -> "ninepatch-down")
                                .withFontColor(Color.WHITE)
                                .withPressedDownColor(Color.YELLOW)
                                .withPressedDownFontColor(Color.GREEN)
                                .withBorder(60)
                                .build()
                ),
                700, 200, "My nine patch button") {
            @Override
            public void onTouchUp() {
                super.onTouchUp();
                flipLogo();
            }
        };
        ninePatchButton.setPosition(getWidth()/2, ninePatchThin.getY() - 50, Align.top);
        addActor(ninePatchButton);
    }

    private void flipLogo() {
        logo.addAction(Actions.rotateBy(180, 0.2f));
    }
}
