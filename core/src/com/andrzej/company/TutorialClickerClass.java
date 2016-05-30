package com.andrzej.company;

import com.andrzej.company.screens.SplashScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class TutorialClickerClass extends Game {
	public final static String GAME_PREFS = "com.andrzej.company.prefs";
	public final static String GAME_SCORE = "com.andrzej.company.score";
	public final static String GAME_NAME = "Clicker";
	public final static  int WIDTH = 480;
	public final static int HEIGHT = 700;
	private com.badlogic.gdx.Preferences preferences;
	private int points;
	private boolean paused;

	public int getPoints() {
		return points;
	}
	public void addPoint(){
		points++;
		updateGamedSavedScore();
	}
	@Override
	public void create () {
		init();
		this.setScreen(new SplashScreen(this));

	}

	private void init() {
		preferences = Gdx.app.getPreferences(GAME_PREFS);
		loadScore();
		
	}

	private void loadScore() {
		points = preferences.getInteger(GAME_SCORE, points);
	}

	//getters and setters
	public boolean isPaused() {
		return paused;
	}
	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public void resetGameScore() {
		points = 0;
		updateGamedSavedScore();
	}

	private void updateGamedSavedScore() {
		preferences.putInteger(GAME_SCORE, points);
		preferences.flush();
	}
}
