package com.example.sfarias.cleanmvp.main.data.model;

/**
 * Created by sfarias on 05-10-17.
 */
public class ServerResponse<T> {

    private T data;

    public ServerResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}