package com.andrzej.company.screens;

import com.andrzej.company.TutorialClickerClass;
import com.andrzej.company.entities.Player;
import com.andrzej.company.ui.IClickCallback;
import com.andrzej.company.ui.PlayerButton;
import com.andrzej.company.ui.ResetScoreButton;
import com.andrzej.company.ui.ScoreLabel;

public class GameplayScreen extends AbstractScreen {
    private Player player;
    private PlayerButton playerButton;
    private ResetScoreButton resetScoreButton;
    private ScoreLabel scoreLabel;

    public GameplayScreen(TutorialClickerClass game) {
        super(game);
    }

    @Override
    protected void init() {
        initPlayer();
        initPlayerButton();
        initScoreLabel();
        initResetScoreButton();
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
