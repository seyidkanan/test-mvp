package com.example.myapplicationtestmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LoginPresenter();
        presenter.setView(this);
    }

    @Override
    public void done(String data) {

    }

    public void onCliclButton(){
        presenter.login();
    }
}