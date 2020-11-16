package com.example.myapplicationtestmvp;

public class LoginInteractor {

    public LoginInteractor() {
    }

    public void login(LoginPresenter.LoginCallBackImpl loginCallBack) {
        loginCallBack.onSuccess("dgfrs");
    }

}
