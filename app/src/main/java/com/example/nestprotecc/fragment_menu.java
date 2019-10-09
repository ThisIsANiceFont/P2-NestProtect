package com.example.nestprotecc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_menu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflator.inflate(R.layout.menu_fragment, container, false);
        return view;
    }

    public void goToLights (View view){
        Intent intent = new Intent (getActivity(), activity_lights.class);
        startActivity(intent);
    }

    public void goToTemp (View view){
        Intent intent = new Intent (getActivity(), activity_temperature.class);
        startActivity(intent);
    }

    public void goToSettings (View view){
        Intent intent = new Intent (getActivity(), activity_settings.class);
        startActivity(intent);
    }

}
