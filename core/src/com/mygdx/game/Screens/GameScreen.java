package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.UI.GameControllerHandler;
import com.mygdx.game.UI.GameScreenUI;
import com.mygdx.game.UI.KeyInput;

/**
 * Created by armok on 8/30/18.
 */
public class GameScreen implements Screen, GameControllerHandler{

    GameScreenUI ui;

    Stage stage;
    OrthographicCamera camera;

    Music music;

    public GameScreen () {

        stage = new Stage(new ScreenViewport());

        //camera = (OrthographicCamera)stage.getViewport().getCamera();
        //camera.setToOrtho(false,1920,1080);

        ui = new GameScreenUI(this);


        music = Gdx.audio.newMusic(Gdx.files.internal("music_test1.wav"));
        music.setLooping(true);
        music.setVolume(1f);
        music.play();
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        stage.draw();
        ui.Draw();
    }

    @Override
    public void resize(int width, int height) {
        ui.resize(width, height);
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
        stage.dispose();
        music.dispose();
    }

    @Override
    public void pressKey(KeyInput key) {

    }

    @Override
    public void releaseKey(KeyInput key) {

    }
}
