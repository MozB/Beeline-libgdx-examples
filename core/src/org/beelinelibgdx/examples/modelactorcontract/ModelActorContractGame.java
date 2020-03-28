package org.beelinelibgdx.examples.modelactorcontract;

import com.google.common.collect.Lists;

import org.beelinelibgdx.BeelineGame;
import org.beelinelibgdx.actors.BeelineGroup;
import org.beelinelibgdx.actors.ModelAndActorVisibilityContract;
import org.beelinelibgdx.screens.BeelineScreen;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class ModelActorContractGame extends BeelineGame<Serializable> {
    private ModelAndActorVisibilityContract<MyModel, MyModelActor> contract;
    private List<MyModel> models;
    private List<MyModelActor> actors;

    public ModelActorContractGame() {
        super(1920, 1080);
    }

    @Override
    public void create() {
        super.create();
        Random random = new Random();
        BeelineScreen screen = new BeelineScreen(getViewport()) {
            @Override
            public void render(float delta) {
                super.render(delta);
                contract.refresh();
                if (random.nextInt(20) == 0) {
                    models.add(new MyModel());
                }
            }
        };
        setScreen(screen);
        BeelineGroup group = new BeelineGroup();
        screen.addActor(group);

        models = Lists.newArrayList();
        actors = Lists.newArrayList();
        contract = new ModelAndActorVisibilityContract<MyModel, MyModelActor>(group, models, actors) {
            @Override
            public void forEachFrame(MyModel model, MyModelActor actor) {
                model.refresh();
                actor.refresh();
            }

            @Override
            public MyModelActor createActor(MyModel model) {
                return new MyModelActor(getAssetManager(), model);
            }
        };
    }
}
