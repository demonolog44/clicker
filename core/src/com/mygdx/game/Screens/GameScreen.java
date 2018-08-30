package com.mygdx.game.Screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.UI.GameScreenUI;

/**
 * Created by armok on 8/30/18.
 */
public class GameScreen implements Screen {

    GameScreenUI ui;

    Stage stage;
    OrthographicCamera camera;

    Music music;

    public GameScreen () {

        stage = new Stage(new ScreenViewport());

        //camera = (OrthographicCamera)stage.getViewport().getCamera();
        //camera.setToOrtho(false,1920,1080);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
