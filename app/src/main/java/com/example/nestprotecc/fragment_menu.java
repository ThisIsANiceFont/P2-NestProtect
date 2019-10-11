package com.example.nestprotecc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_menu extends Fragment implements View.OnClickListener {
    private Button mButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);

        Button one = (Button) view.findViewById(R.id.button2);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) view.findViewById(R.id.button3);
        two.setOnClickListener(this);
        Button three = (Button) view.findViewById(R.id.button4);
        three.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                goToLights();
                break;
            case R.id.button3:
                goToTemp();
                break;
            case R.id.button4:
                goToSettings();
                break;
        }
    }


    public void goToLights (){
        Intent intent = new Intent (getActivity(), activity_lights.class);
        startActivity(intent);
    }

    public void goToTemp (){
        Intent intent = new Intent (getActivity(), activity_temperature.class);
        startActivity(intent);
    }

    public void goToSettings (){
        Intent intent = new Intent (getActivity(), activity_settings.class);
        startActivity(intent);
    }

}
