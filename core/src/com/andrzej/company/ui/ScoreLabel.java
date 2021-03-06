package com.andrzej.company.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;

import javafx.scene.control.Skin;

/**
 * Created by Andrzej on 2016-06-08.
 */
public class ScoreLabel extends Label {
    public ScoreLabel(){

        super("", prepareLabelStyle());
        init();
    }
    private void init(){
        this.setX(120);
        this.setColor(Color.BLACK);
        this.setY(650);
    }
    private static LabelStyle prepareLabelStyle(){
        LabelStyle labelStyle = new LabelStyle();
        labelStyle.font = new BitmapFont();
        return labelStyle;
    }

}
