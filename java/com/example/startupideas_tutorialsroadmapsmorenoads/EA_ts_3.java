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

public class EA_ts_3 extends AppCompatActivity {

    ImageView pBack;
    CardView LI_C1, LI_C2, LI_C3, LI_C4, LI_C5, LI_C6, LI_C7, LI_C8, LI_C9, LI_C10, LI_C11, LI_C12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea_ts3);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
         pBack=findViewById(R.id.back_ea_ts_3);


        pBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int val = preferences.getInt("sp_eats3", 1);


                if(val==1){
                    Intent intent1 = new Intent(EA_ts_3.this, TutorialActivity.class);
                    startActivity(intent1);
                }
                else if(val==2){
                    Intent intent1 = new Intent(EA_ts_3.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }
            }
        });
        LI_C1 = findViewById(R.id.LI_C1);
        LI_C2 = findViewById(R.id.LI_C2);
        LI_C3 = findViewById(R.id.LI_C3);
        LI_C4 = findViewById(R.id.LI_C4);
        LI_C5 = findViewById(R.id.LI_C5);
        LI_C6 = findViewById(R.id.LI_C6);
        LI_C7 = findViewById(R.id.LI_C7);
        LI_C8 = findViewById(R.id.LI_C8);
        LI_C9 = findViewById(R.id.LI_C9);
        LI_C10 = findViewById(R.id.LI_C10);
        LI_C11 = findViewById(R.id.LI_C11);
        LI_C12 = findViewById(R.id.LI_C12);


        LI_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 40);
                intent.putExtra("keyI_RPSA", 999 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 41);
                intent.putExtra("keyI_RPSA",  1111);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 42);
                intent.putExtra("keyI_RPSA", 1111 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 43);
                intent.putExtra("keyI_RPSA", 999 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 44);
                intent.putExtra("keyI_RPSA", 1111 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 45);
                intent.putExtra("keyI_RPSA",  999);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 46);
                intent.putExtra("keyI_RPSA",  3333);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 47);
                intent.putExtra("keyI_RPSA", 2222 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 48);
                intent.putExtra("keyI_RPSA", 3333 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 49);
                intent.putExtra("keyI_RPSA", 2222 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 50);
                intent.putExtra("keyI_RPSA", 3333 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 51);
                intent.putExtra("keyI_RPSA", 2222 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });

    }
    @Override
    public void onBackPressed(){


            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_eats3", 1);


            if(val==1){
                Intent intent1 = new Intent(EA_ts_3.this, TutorialActivity.class);
                startActivity(intent1);
            }
            else if(val==2){
                Intent intent1 = new Intent(EA_ts_3.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }

    }


}