package com.example.sfarias.cleanmvp.main.view.presenter;

/**
 * Created by sfarias on 05-10-17.
 */

public interface Presenter<T> {

    void setView(T view);

    void create();

    void resume();

    void fromBackground();

    void pause();

    void destroy();


    // TODO: Add your methods

}