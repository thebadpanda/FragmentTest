package com.example.arsenko.fragmenttest;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GrizzlyFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.grizzly_desc, container, false);
        return rootView;
    }
}
