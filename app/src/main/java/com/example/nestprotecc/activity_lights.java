package com.example.nestprotecc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class activity_lights extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);

    }

    private Button btn, btn2, btn3, btn4, btn5;
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
            btn.setText("Light OFF");
        }

        else if(v.getId() == R.id.button2){
            btn2.setText("Light OFF");
        }
        else if(v.getId() == R.id.button3) {
            btn3.setText("Light OFF");
        }
        else if(v.getId() == R.id.button4) {
            btn4.setText("Light OFF");
        }
        else if(v.getId() == R.id.button5) {
            btn5.setText("Light OFF");
        }
    }
}
