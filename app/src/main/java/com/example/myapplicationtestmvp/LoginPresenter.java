package com.example.myapplicationtestmvp;

import java.util.List;

public class LoginPresenter {

    private LoginView view;

    private LoginInteractor loginInteractor;

    public LoginPresenter() {
        loginInteractor = new LoginInteractor();
    }

    public void setView(LoginView view) {
        this.view = view;
    }

    public void login() {

        loginInteractor.login(new LoginCallBackImpl());
    }

    public class LoginCallBackImpl implements LoginCallBack<String> {
        @Override
        public void onSuccess(String data) {
            if (data.length() > 0) {
                view.done(data);
            } else {

            }
        }

        @Override
        public void onFail(String error) {

        }
    }

}
