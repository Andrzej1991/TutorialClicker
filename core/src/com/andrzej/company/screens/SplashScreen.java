package com.andrzej.company.screens;

import com.andrzej.company.TutorialClickerClass;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Andrzej on 2016-05-23.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(TutorialClickerClass game) {
        super(game);
        init();
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
