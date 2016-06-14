package com.andrzej.company.screens;

import com.andrzej.company.TutorialClickerClass;
import com.andrzej.company.entities.Player;
import com.andrzej.company.ui.IClickCallback;
import com.andrzej.company.ui.PlayerButton;
import com.andrzej.company.ui.ResetScoreButton;
import com.andrzej.company.ui.ScoreLabel;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class GameplayScreen extends AbstractScreen {
    private Image bgImage;
    private Player player;
    private PlayerButton playerButton;
    private ResetScoreButton resetScoreButton;
    private ScoreLabel scoreLabel;
    public GameplayScreen(TutorialClickerClass game) {
        super(game);
    }
    @Override
    protected void init() {

        initBg();
        initPlayer();
        initPlayerButton();
        initScoreLabel();
        initResetScoreButton();
    }

    private void initBg() {
        bgImage = new Image(new Texture("bg.png"));
        stage.addActor(bgImage);
    }

    private void initResetScoreButton() {
        resetScoreButton = new ResetScoreButton(new IClickCallback() {
            @Override
            public void onClick() {
                game.resetGameScore();
            }
        });

        stage.addActor(resetScoreButton);
 }
    private void initScoreLabel() {
        scoreLabel = new ScoreLabel();

        stage.addActor(scoreLabel);
    }

    private void initPlayerButton() {
        playerButton = new PlayerButton(new IClickCallback() {
            @Override
            public void onClick() {
                player.reactOnClick();
                game.addPoint();
            }
        });

        stage.addActor(playerButton);
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
        scoreLabel.setText("Score: " + game.getPoints());
        stage.act();
    }
}
