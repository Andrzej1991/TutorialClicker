package com.andrzej.company.screens;

import com.andrzej.company.TutorialClickerClass;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;

/**
 * Created by Andrzej on 2016-05-23.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(final TutorialClickerClass game) {
        super(game);
        init();

        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {
              game.setScreen(new GameplayScreen(game));
            }
        }, 3);
    }

    private void init() {
        //TODO implement better assets loading when game grows
        splashImg = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();

        spriteBatch.draw(splashImg, 0, 0);

        spriteBatch.end();
    }
}
