package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
Button btn;
ImageView[] img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img=new ImageView[26];
        img[0]=findViewById(R.id.img_a);
        img[1]=findViewById(R.id.img_b);
        img[2]=findViewById(R.id.img_c);
        img[3]=findViewById(R.id.img_d);
        img[4]=findViewById(R.id.img_e);
        img[5]=findViewById(R.id.img_f);
        img[6]=findViewById(R.id.img_g);
        img[7]=findViewById(R.id.img_h);
        img[8]=findViewById(R.id.img_i);
        img[9]=findViewById(R.id.img_j);
        img[10]=findViewById(R.id.img_k);
        img[11]=findViewById(R.id.img_l);
        img[12]=findViewById(R.id.img_m);
        img[13]=findViewById(R.id.img_n);
        img[14]=findViewById(R.id.img_o);
        img[15]=findViewById(R.id.img_p);
        img[16]=findViewById(R.id.img_q);
        img[17]=findViewById(R.id.img_r);
        img[18]=findViewById(R.id.img_s);
        img[19]=findViewById(R.id.img_t);
        img[20]=findViewById(R.id.img_u);
        img[21]=findViewById(R.id.img_v);
        img[22]=findViewById(R.id.img_w);
        img[23]=findViewById(R.id.img_x);
        img[24]=findViewById(R.id.img_y);
        img[25]=findViewById(R.id.img_z);
        btn=findViewById(R.id.button);

        int val=getIntent().getIntExtra("Image",-1);

        switch (val) {
            case 1:
                img[0].setVisibility(View.VISIBLE);
                break;
            case 2:
                img[1].setVisibility(View.VISIBLE);
                ;
                break;
            case 3:
                img[2].setVisibility(View.VISIBLE);
                ;
                break;
            case 4:
                img[3].setVisibility(View.VISIBLE);
                ;
                break;
            case 5:
                img[4].setVisibility(View.VISIBLE);
                ;
                break;
            case 6:
                img[5].setVisibility(View.VISIBLE);
                ;
                break;
            case 7:
                img[6].setVisibility(View.VISIBLE);
                ;
                break;
            case 8:
                img[7].setVisibility(View.VISIBLE);
                ;
                break;
            case 9:
                img[8].setVisibility(View.VISIBLE);
                ;
                break;
            case 10:
                img[9].setVisibility(View.VISIBLE);
                ;
                break;
            case 11:
                img[10].setVisibility(View.VISIBLE);
                ;
                break;
            case 12:
                img[11].setVisibility(View.VISIBLE);
                ;
                break;
            case 13:
                img[12].setVisibility(View.VISIBLE);
                ;
                break;
            case 14:
                img[13].setVisibility(View.VISIBLE);
                ;
                break;
            case 15:
                img[14].setVisibility(View.VISIBLE);
                ;
                break;
            case 16:
                img[15].setVisibility(View.VISIBLE);
                ;
                break;
            case 17:
                img[16].setVisibility(View.VISIBLE);
                ;
                break;
            case 18:
                img[17].setVisibility(View.VISIBLE);
                ;
                break;
            case 19:
                img[18].setVisibility(View.VISIBLE);
                ;
                break;
            case 20:
                img[19].setVisibility(View.VISIBLE);
                ;
                break;
            case 21:
                img[20].setVisibility(View.VISIBLE);
                ;
                break;
            case 22:
                img[21].setVisibility(View.VISIBLE);
                ;
                break;
            case 23:
                img[22].setVisibility(View.VISIBLE);
                ;
                break;
            case 24:
                img[23].setVisibility(View.VISIBLE);
                ;
                break;
            case 25:
                img[24].setVisibility(View.VISIBLE);
                ;
                break;
            case 26:
                img[25].setVisibility(View.VISIBLE);
                ;
                break;
            default:
                break;
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                img[val-1].setVisibility(View.INVISIBLE);
            }
        });
    }
}