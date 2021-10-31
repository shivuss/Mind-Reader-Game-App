package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.mindreader.page1.p1;

public class page3 extends AppCompatActivity implements View.OnClickListener {
Button B5;
Button B6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        B5=(Button)findViewById(R.id.button7);
        B6=(Button)findViewById(R.id.button8);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==B5){
            p1=p1+8;
            Intent i7 = new Intent(this, page4.class);
            startActivity(i7);
        }
        if (v==B6){
            p1=p1+0;
            Intent i8 = new Intent(this, page4.class);
            startActivity(i8);
        }
    }

    //public class input3 extends page2 {

    //}


}