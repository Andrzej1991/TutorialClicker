package com.andrzej.company.screens;

import com.andrzej.company.TutorialClickerClass;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

/**
 * Created by Andrzej on 2016-05-23.
 */
public abstract class AbstractScreen implements Screen {
    protected TutorialClickerClass game;
    protected Stage stage;
    private OrthographicCamera camera;
    protected SpriteBatch spriteBatch;

    public AbstractScreen(TutorialClickerClass game) {
        this.game = game;
        createCamera();
        stage = new Stage(new StretchViewport(TutorialClickerClass.WIDTH, TutorialClickerClass.HEIGHT, camera));
        spriteBatch = new SpriteBatch();
        Gdx.input.setInputProcessor(stage);
        init();
    }

    protected abstract void init();

    private void createCamera() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, TutorialClickerClass.WIDTH, TutorialClickerClass.HEIGHT);
        camera.update();
    }

    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);

    }

    private void clearScreen() {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void show() {}

    @Override
    public void resume() {
        game.setPaused(false);
    }

    @Override
    public void pause() {
        game.setPaused(true);
    }

    @Override
    public void dispose() {
        game.dispose();
    }
    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void hide() {}

}
