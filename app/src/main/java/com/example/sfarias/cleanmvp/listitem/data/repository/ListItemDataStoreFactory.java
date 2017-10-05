package com.example.sfarias.cleanmvp.listitem.data.repository;

import com.example.sfarias.cleanmvp.listitem.data.api.ListItemService;
import com.example.sfarias.cleanmvp.listitem.data.cache.ListItemCache;
import com.example.sfarias.cleanmvp.listitem.data.repository.datasource.CloudListItemDataSource;
import com.example.sfarias.cleanmvp.listitem.data.repository.datasource.DiskListItemDataSource;

import javax.inject.Inject;

/**
 * Created by sfarias on 05-10-17.
 */
public class ListItemDataStoreFactory {

    @Inject
    ListItemService mService;
    @Inject
    ListItemCache mCache;

    private CloudListItemDataSource mCloudAnnouncementsDataSource;
    private DiskListItemDataSource mDiskAnnouncementsDataSource;

    @Inject
    public ListItemDataStoreFactory() {

    }

    public CloudListItemDataSource getCloudDataSource() {
        if (mCloudAnnouncementsDataSource != null) {
            return mCloudAnnouncementsDataSource;
        } else {
            mCloudAnnouncementsDataSource = new CloudListItemDataSource(mCache);
            return mCloudAnnouncementsDataSource;
        }
    }

    public DiskListItemDataSource getDiskDataSource() {
        if (mDiskAnnouncementsDataSource != null) {
            return mDiskAnnouncementsDataSource;
        } else {
            mDiskAnnouncementsDataSource = new DiskListItemDataSource(mCache);
            return mDiskAnnouncementsDataSource;
        }
    }

}