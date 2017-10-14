package com.example.arsenko.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class BtnFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        // getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);

        View rootView = inflater.inflate(R.layout.btn_fragment, container, false); // container - false, because we'll not use container

        final Button pandaBtn = (Button) rootView.findViewById(R.id.pandaBtn);
        final Button whitebearBtn = (Button) rootView.findViewById(R.id.whitebearBtn);
        final Button grizzlyBtn = (Button) rootView.findViewById(R.id.grizzlyBtn);

        pandaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerDesc, new PandaFragment()).commit();
            }
        });

        whitebearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerDesc, new WhitebearFragment()).commit();
            }
        });

        grizzlyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerDesc, new GrizzlyFragment()).commit();
            }
        });

        return rootView;
    }
}
