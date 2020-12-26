package com.example.myconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Time extends AppCompatActivity {

    LinearLayout lay;
    Button kg,pound,convert;
    TextView res;
    Double temp;
    boolean one=false, two=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        lay=findViewById(R.id.con);
        kg=findViewById(R.id.kg);
        pound=findViewById(R.id.pound);
        res = findViewById(R.id.field2);
        convert= findViewById(R.id.convert3);
        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                one = true;
                lay.setVisibility(View.VISIBLE);
                two = false;
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
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
                if (one) {

                    Double value = Double.valueOf(res.getText().toString());
                    temp = value * 60;
                    String toString = String.valueOf(temp);
                    res.setText(toString);
                    Context context = getApplicationContext();
                    CharSequence text = toString + " mins";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                    two = false;
                }else if (two){

                    Double value = Double.valueOf(res.getText().toString());
                    temp = value / 60;
                    String toString = String.valueOf(temp);
                    res.setText(toString);
                    Context context2 = getApplicationContext();
                    CharSequence text2 = toString+" hrs";
                    int duration2 = Toast.LENGTH_SHORT;
                    Toast.makeText(context2, text2, duration2).show();

                }
            }
        });
    }
}