package com.citisense.vidklopcic.citisense;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.citisense.vidklopcic.citisense.data.entities.CitiSenseStation;
import com.citisense.vidklopcic.citisense.fragments.MeasuringStationDataFragment;

import java.util.ArrayList;


public class AqiCardsFragment extends Fragment implements MeasuringStationDataFragment {
    public AqiCardsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aqi_cards, container, false);;
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void update(ArrayList<CitiSenseStation> stations) {

    }
}