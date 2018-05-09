package com.burger.juls.kassensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numPadBtnPressed(View btn) {
        Button button = (Button) btn;
        TextView txt = (TextView) findViewById(R.id.result);
        txt.setText((String)button.getTag());


    }
}


