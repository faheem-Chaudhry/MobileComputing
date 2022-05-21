package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        for (int i = 0; i < btn.length; i++)
        {
            btn[i].setOnClickListener(this);
        }

    }
    @Override
    public void onClick(View view) {
        int image = selectImage(view.getId());
      //  Log.d("NumberMain",Integer.toString(image));
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("Image",image);
        startActivity(intent);
    }

    int selectImage(int id) {
        int image = -1;
        switch (id){
            case R.id.A:
                image = R.drawable.a;
                break;
            case R.id.B:
                image = R.drawable.b;
                break;
            case R.id.C:
                image = R.drawable.c;
                break;
            case R.id.D:
                image = R.drawable.d;
                break;
            case R.id.E:
                image = R.drawable.e;
                break;
            case R.id.F:
                image = R.drawable.f;
                break;
            case R.id.G:
                image = R.drawable.g;
                break;
            case R.id.H:
                image = R.drawable.h;
                break;
            case R.id.I:
                image = R.drawable.i;
                break;
            case R.id.J:
                image = R.drawable.j;
                break;
            case R.id.K:
                image = R.drawable.k;
                break;
            case R.id.L:
                image = R.drawable.l;
                break;
            case R.id.M:
                image = R.drawable.m;
                break;
            case R.id.N:
                image = R.drawable.n;
                break;
            case R.id.O:
                image = R.drawable.o;
                break;
            case R.id.P:
                image = R.drawable.p;
                break;
            case R.id.Q:
                image = R.drawable.q;
                break;
            case R.id.R:
                image = R.drawable.r;
                break;
            case R.id.S:
                image = R.drawable.s;
                break;
            case R.id.T:
                image = R.drawable.t;
                break;
            case R.id.U:
                image = R.drawable.u;
                break;
            case R.id.V:
                image = R.drawable.v;
                break;
            case R.id.W:
                image = R.drawable.w;
                break;
            case R.id.X:
                image = R.drawable.x;
                break;
            case R.id.Y:
                image = R.drawable.y;
                break;
            case R.id.Z:
                image = R.drawable.z;
                break;
            default:
                break;
        }
        return image;
    }

}


