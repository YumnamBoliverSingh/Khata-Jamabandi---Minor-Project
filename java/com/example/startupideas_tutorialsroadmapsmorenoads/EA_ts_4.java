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

public class EA_ts_4 extends AppCompatActivity {
     ImageView pBack;
    CardView LI_D1, LI_D2, LI_D3, LI_D4, LI_D5, LI_D6, LI_D7, LI_D8, LI_D9, LI_D10, LI_D11, LI_D12, LI_D13, LI_D14, LI_D15, LI_D16, LI_D17, LI_D18, LI_D19, LI_D20, LI_D21, LI_D22, LI_D23, LI_D24, LI_D25, LI_D26, LI_D27, LI_D28;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea_ts4);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
         pBack=findViewById(R.id.back_ea_ts_4);





        pBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int val = preferences.getInt("sp_eats4", 1);


                if(val==1){
                    Intent intent1 = new Intent(EA_ts_4.this, TutorialActivity.class);
                    startActivity(intent1);
                }
                else  if(val==2){
                    Intent intent1 = new Intent(EA_ts_4.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }

            }
        });
        LI_D1 = findViewById(R.id.LI_D1);
        LI_D2 = findViewById(R.id.LI_D2);
        LI_D3 = findViewById(R.id.LI_D3);
        LI_D4 = findViewById(R.id.LI_D4);
        LI_D6 = findViewById(R.id.LI_D6);
        LI_D7 = findViewById(R.id.LI_D7);
        LI_D8 = findViewById(R.id.LI_D8);
        LI_D9 = findViewById(R.id.LI_D9);
        LI_D10 = findViewById(R.id.LI_D10);
        LI_D11 = findViewById(R.id.LI_D11);
        LI_D12 = findViewById(R.id.LI_D12);
        LI_D13 = findViewById(R.id.LI_D13);
        LI_D14 = findViewById(R.id.LI_D14);
        LI_D17 = findViewById(R.id.LI_D17);
        LI_D18 = findViewById(R.id.LI_D18);
        LI_D19 = findViewById(R.id.LI_D19);
        LI_D20 = findViewById(R.id.LI_D20);
        LI_D21 = findViewById(R.id.LI_D21);
        LI_D22 = findViewById(R.id.LI_D22);
        LI_D23 = findViewById(R.id.LI_D23);
        LI_D24 = findViewById(R.id.LI_D24);
        LI_D25 = findViewById(R.id.LI_D25);
        LI_D26 = findViewById(R.id.LI_D26);
        LI_D27 = findViewById(R.id.LI_D27);
        LI_D28 = findViewById(R.id.LI_D28);


        LI_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 52);
                intent.putExtra("keyI_RPSA",  53);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 53);
                intent.putExtra("keyI_RPSA",  54);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 54);
                intent.putExtra("keyI_RPSA",  56);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 56);
                intent.putExtra("keyI_RPSA",  57);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });

        LI_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 57);
                intent.putExtra("keyI_RPSA",  58);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 58);
                intent.putExtra("keyI_RPSA",  59);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 59);
                intent.putExtra("keyI_RPSA",  60);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 60);
                intent.putExtra("keyI_RPSA",  61);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 61);
                intent.putExtra("keyI_RPSA",  62);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 62);
                intent.putExtra("keyI_RPSA",  63);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 63);
                intent.putExtra("keyI_RPSA",  64);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 64);
                intent.putExtra("keyI_RPSA",  65);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 65);
                intent.putExtra("keyI_RPSA",  67);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });

        LI_D17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 68);
                intent.putExtra("keyI_RPSA",  69);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 69);
                intent.putExtra("keyI_RPSA",  70);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 70);
                intent.putExtra("keyI_RPSA",  71);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 71);
                intent.putExtra("keyI_RPSA",  72);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 72);
                intent.putExtra("keyI_RPSA",  73);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 73);
                intent.putExtra("keyI_RPSA",  74);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 74);
                intent.putExtra("keyI_RPSA",  75);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 75);
                intent.putExtra("keyI_RPSA",  76);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 76);
                intent.putExtra("keyI_RPSA",  77);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 77);
                intent.putExtra("keyI_RPSA",  78);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 78);
                intent.putExtra("keyI_RPSA",  79);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_D28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_4.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 79);
                intent.putExtra("keyI_RPSA",  52);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 4);
                editor.apply();


                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed(){


            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_eats4", 1);


            if(val==1){
                Intent intent1 = new Intent(EA_ts_4.this, TutorialActivity.class);
                startActivity(intent1);
            }
            else  if(val==2){
                Intent intent1 = new Intent(EA_ts_4.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }

    }





}