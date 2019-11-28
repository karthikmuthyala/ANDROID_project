package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button BTN;
    private TextView tit;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.univ1);
        TextView tv1 = (TextView) findViewById(R.id.univ2);
        tv2 = findViewById(R.id.textView8);
        tv3 = findViewById(R.id.textView10);
        tv4 = findViewById(R.id.textView11);
        BTN = (Button) findViewById(R.id.BTNnext);
        TextView tit = (TextView)findViewById(R.id.titleUniv);


        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(ini);

            }

        });


        tv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,fourthActivity.class);
                startActivity(ini);

            }

        });



        tv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,FifthUniversity.class);
                startActivity(ini);

            }

        });

        tv3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,SixthUniversity.class);
                startActivity(ini);

            }

        });

        tv4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,SeventhActivity.class);
                startActivity(ini);

            }

        });





        BTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this, feedback.class);
                startActivity(ini);


            }
        });
    }
    }
