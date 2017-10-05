package com.example.sfarias.cleanmvp.listitem.data.repository.datasource;

import com.example.sfarias.cleanmvp.listitem.data.api.ListItemService;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by sfarias on 05-10-17.
 */
public class CloudListItemDataSource {
    ListItemService mService;

    @Inject
    public CloudListItemDataSource(ListItemService service) {
        this.mService = service;
    }

    // TODO: Add actions to conect with mService
}