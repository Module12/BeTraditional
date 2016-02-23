package mobiletesting.betraditional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trendsetter extends AppCompatActivity {
    Button button4_sbm;
    Button button6_sbm;
    Button button7_sbm;
    Button button8_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trendsetter);
        onClickListener1();
        onClickListener2();
        onClickListener3();
        onClickListener4();
    }
    public void onClickListener1(){
        button4_sbm = (Button)findViewById(R.id.button8);
        button4_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.betraditional.camera");
                startActivity(intent);
            }
        });

    }
    public void onClickListener2(){
        button6_sbm = (Button)findViewById(R.id.button5);
        button6_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.betraditional.Discover");
                startActivity(intent);
            }
        });

    }
    public void onClickListener3(){
        button7_sbm = (Button)findViewById(R.id.button6);
        button7_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.betraditional.TheBestIn");
                startActivity(intent);
            }
        });

    }
    public void onClickListener4(){
        button8_sbm = (Button)findViewById(R.id.button7);
        button8_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.betraditional.WhatsTrendy");
                startActivity(intent);
            }
        });

    }
}
