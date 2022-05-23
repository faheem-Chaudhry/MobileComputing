package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button learn, quiz,repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       learn=findViewById(R.id.button2);
       quiz=findViewById(R.id.button3);
       repository=findViewById(R.id.button4);
       learn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this, Learning_1.class);
               startActivity(intent);
           }
       });
       quiz.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Random generator = new Random();
               int number = generator.nextInt(5) + 1;

               Class activity = null;

               // Here, we are checking to see what the output of the random was
               switch(number) {
                   case 1:
                       activity = Quiz_1.class;
                       break;
                   case 2:
                       activity = Quiz_2.class;
                       break;
                   case 3:
                       activity = Quiz_3.class;
                       break;
                   case 4:
                       activity = Quiz_4.class;
                       break;
                   default:
                       activity = Quiz_5.class;
                       break;
               }
               Intent intent = new Intent(MainActivity.this, activity);
               startActivity(intent);

           }
       });
       repository.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Uri webpage = Uri.parse("https://github.com/faheem-Chaudhry/MobileComputing");
               Intent intent = new
                       Intent(Intent.ACTION_VIEW, webpage);
               startActivity(intent);
           }
       });

    }


}


