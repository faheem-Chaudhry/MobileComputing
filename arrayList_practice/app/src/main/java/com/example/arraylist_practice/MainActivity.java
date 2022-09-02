package com.example.arraylist_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("pakistan");
        list.add("pakistan zindabad");
        list.add("bangladesh");
        list.add("srilanka");
        list.add("nepal");
        list.add("bhutan");
        list.add("srilanka");
        list.remove(1);
        list.clear();
        list.add("nepal");
        list.add("bhutan");
        list.add("srilanka");

    }
}