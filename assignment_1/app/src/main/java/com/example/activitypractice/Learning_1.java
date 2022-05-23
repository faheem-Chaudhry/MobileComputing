package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learning_1 extends AppCompatActivity implements View.OnClickListener{
Button[] btn;
Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning1);
        btn = new Button[26];
        btn[0] = findViewById(R.id.A);
        btn[1] = findViewById(R.id.B);
        btn[2] = findViewById(R.id.C);
        btn[3] = findViewById(R.id.D);
        btn[4] = findViewById(R.id.E);
        btn[5] = findViewById(R.id.F);
        btn[6] = findViewById(R.id.G);
        btn[7] = findViewById(R.id.H);
        btn[8] = findViewById(R.id.I);
        btn[9] = findViewById(R.id.J);
        btn[10] = findViewById(R.id.K);
        btn[11] = findViewById(R.id.L);
        btn[12] = findViewById(R.id.M);
        btn[13] = findViewById(R.id.N);
        btn[14] = findViewById(R.id.O);
        btn[15] = findViewById(R.id.P);
        btn[16] = findViewById(R.id.Q);
        btn[17] = findViewById(R.id.R);
        btn[18] = findViewById(R.id.S);
        btn[19] = findViewById(R.id.T);
        btn[20] = findViewById(R.id.U);
        btn[21] = findViewById(R.id.V);
        btn[22] = findViewById(R.id.W);
        btn[23] = findViewById(R.id.X);
        btn[24] = findViewById(R.id.Y);
        btn[25] = findViewById(R.id.Z);
        back=findViewById(R.id.BACK);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Learning_1.this, MainActivity.class);
                startActivity(intent);
            }
        });
        for (int i = 0; i < btn.length; i++)
        {
            btn[i].setOnClickListener(this);
        }


    }
    @Override
    public void onClick(View view) {
        int image = selectImage(view.getId());
        //  Log.d("NumberMain",Integer.toString(image));
        Intent intent = new Intent(Learning_1.this,MainActivity2.class);
        intent.putExtra("Image",image);
        startActivity(intent);
    }

    int selectImage(int id) {
        int image = -1;
        switch (id){
            case R.id.A:
                image = 1;
                break;
            case R.id.B:
                image = 2;
                break;
            case R.id.C:
                image = 3;
                break;
            case R.id.D:
                image = 4;
                break;
            case R.id.E:
                image = 5;
                break;
            case R.id.F:
                image = 6;
                break;
            case R.id.G:
                image = 7;
                break;
            case R.id.H:
                image = 8;
                break;
            case R.id.I:
                image = 9;
                break;
            case R.id.J:
                image = 10;
                break;
            case R.id.K:
                image = 11;
                break;
            case R.id.L:
                image = 12;
                break;
            case R.id.M:
                image = 13;
                break;
            case R.id.N:
                image = 14;
                break;
            case R.id.O:
                image = 15;
                break;
            case R.id.P:
                image = 16;
                break;
            case R.id.Q:
                image = 17;
                break;
            case R.id.R:
                image = 18;
                break;
            case R.id.S:
                image = 19;
                break;
            case R.id.T:
                image = 20;
                break;
            case R.id.U:
                image = 21;
                break;
            case R.id.V:
                image = 22;
                break;
            case R.id.W:
                image = 23;
                break;
            case R.id.X:
                image = 24;
                break;
            case R.id.Y:
                image = 25;
                break;
            case R.id.Z:
                image = 26;
                break;
            default:
                break;
        }
        return image;

    }
}