package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.mindreader.page1.p1;

public class page6 extends AppCompatActivity implements View.OnClickListener {
    Button B11;
    Button B12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        B11=(Button)findViewById(R.id.button13);
        B12=(Button)findViewById(R.id.button14);
        B11.setOnClickListener(this);
        B12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==B11){
            p1=p1+1;
            if (p1<=60){
                Intent i13 = new Intent(this, pagelast.class);
                startActivity(i13);
            }
            else {
                Toast.makeText(this,"Your number cannot be in all slides :) Please try again ", Toast.LENGTH_LONG).show();
                Intent i20 = new Intent(this, pagelast.class);
                startActivity(i20);
            }

        }
        if (v==B12){
            p1=p1+0;
            Intent i14 = new Intent(this, pagelast.class);
            startActivity(i14);
        }
    }
}