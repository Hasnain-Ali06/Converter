package com.example.myconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Currency extends AppCompatActivity {

    LinearLayout lay;
    Button ft,m,convert;
    TextView res;
    Double temp;
    boolean one, two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        lay=findViewById(R.id.con);
        ft=findViewById(R.id.ft);
        m=findViewById(R.id.m);
        res = findViewById(R.id.field2);
        convert= findViewById(R.id.convert3);
        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                one = true;
                lay.setVisibility(View.VISIBLE);
                two=false;
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText("");
                two = true;
                lay.setVisibility(View.VISIBLE);
                one = false;
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one){
                    Double value = Double.valueOf(res.getText().toString());
                    temp = value * 0.0062;
                    String toString = String.valueOf(temp);
                    res.setText(toString);
                    Context context = getApplicationContext();
                    CharSequence text = toString+" USD";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                if (two){
                    Double value = Double.valueOf(res.getText().toString());
                    temp = value * 160.30;
                    String toString = String.valueOf(temp);
                    res.setText(toString);
                    Context context = getApplicationContext();
                    CharSequence text = toString+" PKR";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
            }
        });

    }
}