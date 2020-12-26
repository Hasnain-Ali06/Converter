package com.example.myconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView one,two,three,four,five,six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.cView1);
        two = findViewById(R.id.cView2);
        three = findViewById(R.id.cView3);
        four = findViewById(R.id.cView4);
        five = findViewById(R.id.cView5);
        six = findViewById(R.id.cView6);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elec= new Intent(MainActivity.this,Elec.class);
                startActivity(elec);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this, Heights.class);
                startActivity(h);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w= new Intent(MainActivity.this, Weather.class);
                startActivity(w);
            }
        });

       four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c= new Intent(MainActivity.this, Currency.class);
                startActivity(c);
            }
        });

       five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c= new Intent(MainActivity.this, Weight.class);
                startActivity(c);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c= new Intent(MainActivity.this, Time.class);
                startActivity(c);
            }
        });
    }
}