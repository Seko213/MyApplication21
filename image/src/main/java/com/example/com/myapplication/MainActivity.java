package com.example.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView Text1, Text2;
    Switch S1;
    Button B1, B2;
    ImageView Im1;
    RadioGroup Rgroup1;
    RadioButton R1, R2, R3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = (TextView) findViewById(R.id.Text1);
        Text2 = (TextView) findViewById(R.id.Text2);
        S1 = (Switch) findViewById(R.id.S1);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        Im1 = (ImageView) findViewById(R.id.Im1);
        Rgroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        R1 = (RadioButton) findViewById(R.id.R1);
        R2 = (RadioButton) findViewById(R.id.R2);
        R3 = (RadioButton) findViewById(R.id.R3);



        S1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {

                if (S1.isChecked() == true) {
                    Text2.setVisibility(View.VISIBLE);
                    Rgroup1.setVisibility(View.VISIBLE);
                    B1.setVisibility(View.VISIBLE);
                    B2.setVisibility(View.VISIBLE);
                    Im1.setVisibility(View.VISIBLE);
                }
                else {
                    Text2.setVisibility(View.INVISIBLE);
                    Rgroup1.setVisibility(View.INVISIBLE);
                    B1.setVisibility(View.INVISIBLE);
                    B2.setVisibility(View.INVISIBLE);
                    Im1.setVisibility(View.INVISIBLE);
                }
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Text2.setVisibility(View.INVISIBLE);
                Rgroup1.setVisibility(View.INVISIBLE);
                B1.setVisibility(View.INVISIBLE);
                B2.setVisibility(View.INVISIBLE);
                Im1.setVisibility(View.INVISIBLE);
                S1.setChecked(false);
            }
        });

        R1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Im1.setImageResource(R.drawable.a);
            }
        });
        R2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Im1.setImageResource(R.drawable.b);
            }
        });
        R3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Im1.setImageResource(R.drawable.i);
            }
        });
    }
}