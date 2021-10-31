package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mindreader.page1.p1;

public class pagelast extends AppCompatActivity implements View.OnClickListener {
TextView res;
Button B13;
Button B14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagelast);
        res =(TextView)findViewById(R.id.res);
        B13=(Button)findViewById(R.id.button15);
        B14=(Button)findViewById(R.id.button16);
        B13.setOnClickListener(this);
        B14.setOnClickListener(this);
        if (p1<=60){
            res.setText(" "+p1);
        }
        else {
            res.setText("Try Again!");
        }

    }


    public void show() {
        //p1 = p1+0;
        //Toast.makeText(this,"Your number is $p1", Toast.LENGTH_LONG).show();
        res.setText(" "+p1);
    }

    @Override
    public void onClick(View v) {
        if (v==B13){
            p1=0;
            Intent i14 = new Intent(this, Home.class);
            startActivity(i14);
        }
        if (v==B14){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }

    //public class input6 extends page5{

    //}
}