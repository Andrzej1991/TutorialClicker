package com.andrzej.company.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.andrzej.company.TutorialClickerClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = TutorialClickerClass.GAME_NAME;
		config.width = TutorialClickerClass.WIDTH;
		config.height = TutorialClickerClass.HEIGHT;
		config.resizable = false;
		new LwjglApplication(new TutorialClickerClass(), config);
	}
}
