package com.andrzej.company;

import com.andrzej.company.screens.SplashScreen;
import com.badlogic.gdx.Game;

public class TutorialClickerClass extends Game {
	public final static String GAME_NAME = "Clicker";
	public final static  int WIDTH = 480;
	public final static int HEIGHT = 700;



	private boolean paused;



	
	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));

	}



	//getters and setters

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
