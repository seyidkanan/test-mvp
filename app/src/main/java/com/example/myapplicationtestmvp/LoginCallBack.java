package com.example.myapplicationtestmvp;

public interface LoginCallBack<T> {

    public void onSuccess(T data);

    public void onFail(String error);

}
