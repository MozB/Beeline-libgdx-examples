package org.beelinelibgdx.examples.modelactorcontract;

import org.beelinelibgdx.actors.BeelineActor;
import org.beelinelibgdx.actors.BeelineAssetManager;
import org.beelinelibgdx.actors.VisibleActor;
import org.beelinelibgdx.actors.VisibleModel;

class MyModelActor extends BeelineActor implements VisibleActor {
    private MyModel model;

    public MyModelActor(BeelineAssetManager assets, MyModel model) {
        super(assets.createSprite(() -> "square"), 20, 20);
        this.model = model;
    }

    @Override
    public VisibleModel getModel() {
        return model;
    }

    @Override
    public void refresh() {
        setX(ModelActorContractGame.getWidth() * model.x);
        setY(ModelActorContractGame.getHeight() * model.y);
    }
}
