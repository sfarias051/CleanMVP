package com.example.sfarias.cleanmvp.listitem.data.api;

import com.example.sfarias.cleanmvp.main.data.api.BaseService;

import javax.inject.Inject;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by sfarias on 05-10-17.
 */
public class ListItemService extends BaseService {

    private Service mService;

    @Inject
    public ListItemService() {
        this.mService = getAdapter().create(Service.class);
    }

    // TODO: Create methods to conect with API 

    private interface Service {
        // TODO: Complete with calls
    }

}