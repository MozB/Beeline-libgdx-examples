package org.beelinelibgdx.examples.modelactorcontract;

import org.beelinelibgdx.actors.VisibleModel;

import java.util.Random;

class MyModel implements VisibleModel {

    float x;
    float y;

    private float xDelta;
    private float yDelta;
    private int life;

    public MyModel() {
        Random random = new Random();

        x = random.nextFloat();
        y = random.nextFloat();
        xDelta = random.nextFloat()/100;
        yDelta = random.nextFloat()/100;

        life = 200;
    }

    public void refresh() {
        life--;
        x += xDelta;
        y += yDelta;
        if (x < 0 || x > 1) xDelta *= -1;
        if (y < 0 || y > 1) yDelta *= -1;
    }

    @Override
    public boolean shouldRemoveFromScreen() {
        return life == 0;
    }
}
