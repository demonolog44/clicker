package com.mygdx.game.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.mygdx.game.Assets;

/**
 * Created by armok on 8/30/18.
 */
public class GameScreenUI {

    Skin skin;
    Stage stage;

    GameControllerHandler cntrlHandler;


    public GameScreenUI(GameControllerHandler eventHandler) {

        cntrlHandler = eventHandler;

        stage = new Stage();
        skin = new Skin();

        Gdx.input.setInputProcessor(stage);


        // Create a table that fills the screen. Everything else will go inside this table.
        Table table = new Table();
        table.setFillParent(true);
        stage.addActor(table);


        for(String name : Assets.namesGameScreenUI){
            Texture texture = new Texture(name + ".png");

            skin.add(name, texture);

            ImageButton.ImageButtonStyle imgButtonStyle = new ImageButton.ImageButtonStyle();
            imgButtonStyle.up = skin.newDrawable(name, Color.WHITE);
            imgButtonStyle.down = skin.newDrawable(name, Color.WHITE);
            imgButtonStyle.checked = skin.newDrawable(name, Color.BLUE);
            imgButtonStyle.over = skin.newDrawable(name, Color.LIGHT_GRAY);
            skin.add(name, imgButtonStyle);

        }

        ImageButton btnGoUpdateMenu = new ImageButton(skin, "btnGoUpdateMenu");

        table.add(btnGoUpdateMenu).size(128f).bottom();

        btnGoUpdateMenu.addListener(new InputListener(){
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                cntrlHandler.pressKey(KeyInput.GoUpdateMenu);
                return true;
            }

            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                cntrlHandler.releaseKey(KeyInput.GoUpdateMenu);
            }
        });
    }



    public void Draw(){
        stage.act();
        stage.draw();
    }

    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }
}
