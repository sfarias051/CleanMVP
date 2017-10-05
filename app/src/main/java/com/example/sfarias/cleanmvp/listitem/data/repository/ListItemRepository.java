package com.example.sfarias.cleanmvp.listitem.data.repository;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by sfarias on 05-10-17.
 */
public class ListItemRepository {

    @Inject
    ListItemDataStoreFactory mFactory;

    @Inject
    public ListItemRepository() {
    }

    // TODO: Add methods to connect with mFactory
}