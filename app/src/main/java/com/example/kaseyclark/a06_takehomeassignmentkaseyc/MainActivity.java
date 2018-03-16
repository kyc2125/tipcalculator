package com.example.kaseyclark.a06_takehomeassignmentkaseyc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText et_amount;
    private EditText et_taxpercent;
    private EditText et_tippercent;
    private Button submitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                et_amount = (EditText)findViewById(R.id.amount);
                et_taxpercent=(EditText)this.findViewById(R.id.taxpercent);
                et_tippercent = (EditText)this.findViewById(R.id.tippercent);
                submitbutton=(Button)this.findViewById(R.id.submitbutton);

                submitbutton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                       String s_amount= et_amount.getText().toString();
                       int amount =Integer.parseInt(s_amount);
                       String s_taxpercent= et_taxpercent.getText().toString();
                       int taxpercent=Integer.parseInt(s_taxpercent);
                       String s_tippercent=et_tippercent.getText().toString();
                       int tippercent=Integer.parseInt(s_tippercent);
                       double total=getTotal( amount, tippercent, taxpercent);
                        Intent intent = new Intent (MainActivity.this,ShowTotalActivity.class);
                        intent.putExtra("total", total);
                        startActivity(intent);

                    }
                });

    }
    public double getTotal (int amount, int tippercent, int taxpercent){
       double  tip =amount * ( tippercent *.01  );
       double tax =amount * (taxpercent *.01);
       double total = tip + tax + amount ;
        return total ;
    }
}

