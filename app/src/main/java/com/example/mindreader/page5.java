package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.mindreader.page1.p1;

public class page5 extends AppCompatActivity implements View.OnClickListener {
Button B9;
Button B10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        B9=(Button)findViewById(R.id.button11);
        B10=(Button)findViewById(R.id.button12);
        B9.setOnClickListener(this);
        B10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==B9){
            p1=p1+2;
            Intent i11 = new Intent(this, page6.class);
            startActivity(i11);
        }
        if (v==B10){
            p1=p1+0;
            Intent i12 = new Intent(this, page6.class);
            startActivity(i12);
        }

    }

    //public class input5 extends page4 {

    //}
}