package com.example.sfarias.cleanmvp.listitem.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.sfarias.cleanmvp.R;

import javax.inject.Inject;

import com.example.sfarias.cleanmvp.main.view.activity.ParentActivity;

import com.example.sfarias.cleanmvp.main.view.presenter.Presenter;
import com.example.sfarias.cleanmvp.listitem.view.presenter.ListItemPresenter;

/**
 * Created by sfarias on 05-10-17.
 */
public class ListItemActivity extends ParentActivity implements ListItemPresenter.View {

    public @Inject
    ListItemPresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem);

        mPresenter.create();
    }

    @Override
    public void initInjector() {

    }

    @Override
    public Presenter getPresenter() {
        return mPresenter;
    }
}