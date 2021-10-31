package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity implements View.OnClickListener {
    public static int p1;
    Button B1;
    Button B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        B1=(Button)findViewById(R.id.button3);
        B2=(Button)findViewById(R.id.button4);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==B1){
            p1=32;
            Intent i3 = new Intent(this, page2.class);
            startActivity(i3);
        }
        if (v==B2){
            p1=0;
            Intent i4 = new Intent(this, page2.class);
            startActivity(i4);
        }

    }
}

