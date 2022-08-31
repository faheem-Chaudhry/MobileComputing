package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import com.hafiz.classquiz.QDH;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QDH q = new QDH();

        ListView listView = findViewById(R.id.listView);
        List<String> surahNames = q.GetSurahNames();
        List<String> l = new ArrayList<>();
        l.add("Hamza");
        l.add("ali");
        l.add("razaa");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, l);
        listView.setAdapter(arrayAdapter);

    }
}