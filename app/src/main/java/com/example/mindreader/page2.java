package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.mindreader.page1.p1;


public class page2 extends AppCompatActivity implements View.OnClickListener {
    Button B3;
    Button B4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        B3=(Button)findViewById(R.id.button5);
        B4=(Button)findViewById(R.id.button6);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==B3){
            p1=p1+16;
            Intent i5 = new Intent(this, page3.class);
            startActivity(i5);
        }
        if (v==B4){
            p1=p1+0;
            Intent i6 = new Intent(this, page3.class);
            startActivity(i6);
        }

    }

    //public class input2 extends page1 {


    //}

}