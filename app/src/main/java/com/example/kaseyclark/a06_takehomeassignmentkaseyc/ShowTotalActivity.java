package com.example.kaseyclark.a06_takehomeassignmentkaseyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowTotalActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_total);
        textview=(TextView)findViewById(R.id.total);
        double total =this.getIntent().getDoubleExtra("total" , 0);
        textview.setText(""+total);
    }
}
//hi//