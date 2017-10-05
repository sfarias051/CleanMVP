package com.example.sfarias.cleanmvp.listitem.data.repository.datasource;

import com.example.sfarias.cleanmvp.main.data.api.BaseService;
import com.example.sfarias.cleanmvp.listitem.data.cache.ListItemCache;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by sfarias on 05-10-17.
 */
public class DiskListItemDataSource extends BaseService {

    ListItemCache mCache;

    @Inject
    public DiskListItemDataSource(ListItemCache cache) {
        this.mCache = cache;
    }

    // TODO: Add methods to connect with mCache
}