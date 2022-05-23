package com.example.activitypractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz_5 extends AppCompatActivity {
    Button correct_btn, incorrect_btn1,incorrect_btn2, btn_back;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        correct_btn=findViewById(R.id.bH);
        btn_back=findViewById(R.id.btn_back);
        text=findViewById(R.id.textView2);

        incorrect_btn1=findViewById(R.id.bD);
        incorrect_btn2=findViewById(R.id.bA);

        //alert dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setMessage("Wrong Answer! Please try again!");


        //correct answer
        correct_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setVisibility(View.VISIBLE);
                btn_back.setVisibility(View.VISIBLE);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Quiz_5.this,MainActivity.class);
                startActivity(intent);
                btn_back.setVisibility(View.INVISIBLE);
            }
        });


        //wrong answers
        incorrect_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        incorrect_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });


    }
}