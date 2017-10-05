package com.example.sfarias.cleanmvp.listitem.view.presenter;

import javax.inject.Inject;

import com.example.sfarias.cleanmvp.main.view.presenter.PresenterImpl;

/**
 * Created by sfarias on 05-10-17.
 */
public class ListItemPresenter extends PresenterImpl<ListItemPresenter.View> {

    // TODO: Add your useCase

    private View mView;

    @Inject
    public ListItemPresenter() {
    }

    @Override
    public void setView(View view) {
        this.mView = view;
    }


    public interface View {
        //TODO: Create methods to implements in Activity or Fragment
    }

}
