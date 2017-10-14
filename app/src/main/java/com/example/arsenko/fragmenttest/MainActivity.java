package com.example.arsenko.fragmenttest;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().add(R.id.containerBtn, new BtnFragment()).commit();

        getSupportFragmentManager().beginTransaction().add(R.id.containerDesc, new PandaFragment()).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.containerDesc, new GrizzlyFragment()).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.containerDesc, new WhitebearFragment()).commit();
    }
}
