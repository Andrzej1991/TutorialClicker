package com.andrzej.company.screens;

import com.andrzej.company.TutorialClickerClass;
import com.andrzej.company.entities.Player;

/**
 * Created by Andrzej on 2016-05-23.
 */
public class GameplayScreen extends AbstractScreen {
    private Player player;

    public GameplayScreen(TutorialClickerClass game) {
        super(game);
        init();
    }

    @Override
    protected void init() {
        initPlayer();
    }


    private void initPlayer() {
        player = new Player();
        stage.addActor(player);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update();
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    private void update() {
        stage.act();
    }
}
