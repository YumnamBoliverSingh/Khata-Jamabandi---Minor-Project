package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class LBasicChaptersActivity extends AppCompatActivity {
    TextView li1, li2, li3, li4, li5, li6, li7, li8;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbasic_chapters);
         if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
        getSupportActionBar().hide();
        li1=findViewById(R.id.tvALBC1);
        li2=findViewById(R.id.tvALBC2);
        li3=findViewById(R.id.tvALBC3);
        li4=findViewById(R.id.tvALBC4);
        li5=findViewById(R.id.tvALBC5);
        li6=findViewById(R.id.tvALBC6);
        li7=findViewById(R.id.tvALBC7);
        li8=findViewById(R.id.tvALBC8);

        back=findViewById(R.id.BC_backicon);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int vil = preferences.getInt("sp_basic", 1);

                if(vil == 1){
                    Intent intent1 = new Intent(LBasicChaptersActivity.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }
                else if(vil==2){
                    Intent intent1 = new Intent(LBasicChaptersActivity.this, TutorialActivity.class);
                    startActivity(intent1);
                }

            }
        });

        li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 1);
                startActivity(intent);
            }
        });
        li2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 2);
                startActivity(intent);
            }
        });
        li3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 3);
                startActivity(intent);
            }
        });
        li4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 4);
                startActivity(intent);
            }
        });
        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 5);
                startActivity(intent);
            }
        });
        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 6);
                startActivity(intent);
            }
        });
        li7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 7);
                startActivity(intent);
            }
        });
        li8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 8);
                startActivity(intent);
            }
        });



    }
    @Override
    public void onBackPressed() {

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_basic", 1);

            if(val == 1){
                Intent intent1 = new Intent(LBasicChaptersActivity.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }
            else if(val==2){
                Intent intent1 = new Intent(LBasicChaptersActivity.this, TutorialActivity.class);
                startActivity(intent1);
            }




    }
 }




