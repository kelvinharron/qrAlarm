package com.example.kelvinharron.qralarm;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kelvinharron.qralarm.R;

/**
 * Created by kelvinharron on 04/04/2016.
 */
public class AlarmsFragment extends Fragment {

    public AlarmsFragment() {
// Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.alarm_fragment, container, false);
    }
}

