package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

public class DuplicateActivity extends AppCompatActivity {
    ImageView pBack;

    CardView LI_B1, LI_B2, LI_B3, LI_B4, LI_B5, LI_B6, LI_B7, LI_B8, LI_B9 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duplicate);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
         pBack=findViewById(R.id.back_ea_ts_2);




        pBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int val = preferences.getInt("sp_eats2", 1);


                if(val==1){
                    Intent intent1 = new Intent(DuplicateActivity.this, TutorialActivity.class);
                    startActivity(intent1);
                }
                else if(val==2) {
                    Intent intent1 = new Intent(DuplicateActivity.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }

            }
        });
//initializes..
        LI_B1 = findViewById(R.id.LI_B1);
        LI_B2 = findViewById(R.id.LI_B2);
        LI_B3 = findViewById(R.id.LI_B3);
        LI_B4 = findViewById(R.id.LI_B4);
        LI_B5 = findViewById(R.id.LI_B5);
        LI_B6 = findViewById(R.id.LI_B6);
        LI_B7 = findViewById(R.id.LI_B7);
        LI_B8 = findViewById(R.id.LI_B8);
        LI_B9 = findViewById(R.id.LI_Zoo);


        LI_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 30);
                intent.putExtra("keyI_RPSA",  555);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 31);
                intent.putExtra("keyI_RPSA",  555);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 32);
                intent.putExtra("keyI_RPSA", 666 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 33);
                intent.putExtra("keyI_RPSA", 777 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 34);
                intent.putExtra("keyI_RPSA", 888 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 35);
                intent.putExtra("keyI_RPSA", 666 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 36);
                intent.putExtra("keyI_RPSA", 777 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 37);
                intent.putExtra("keyI_RPSA",  999);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",37 );
                intent.putExtra("keyI_RPSA", 1111 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });


    }
    @Override
    public void onBackPressed(){

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_eats2", 1);


            if(val==1){
                Intent intent1 = new Intent(DuplicateActivity.this, TutorialActivity.class);
                startActivity(intent1);
            }
            else if(val==2) {
                Intent intent1 = new Intent(DuplicateActivity.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }

        }



}