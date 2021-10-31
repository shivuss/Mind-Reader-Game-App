package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.mindreader.page1.p1;

public class page4 extends AppCompatActivity implements View.OnClickListener {
Button B7;
Button B8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        B7=(Button)findViewById(R.id.button9);
        B8=(Button)findViewById(R.id.button10);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==B7){
            p1=p1+4;
            Intent i9 = new Intent(this, page5.class);
            startActivity(i9);
        }
        if (v==B8){
            p1=p1+0;
            Intent i10 = new Intent(this, page5.class);
            startActivity(i10);
        }
    }

    //public class input4 extends page3 {

    //}

}