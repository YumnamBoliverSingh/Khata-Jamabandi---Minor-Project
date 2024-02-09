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

public class EA_ts_1 extends AppCompatActivity {
     ImageView pBack;
    CardView LI_A1, LI_A2, LI_A3, LI_A4, LI_A5, LI_A6, LI_A7, LI_A8, LI_A9, LI_A10, LI_A11, LI_A12, LI_A13, LI_A14, LI_A15, LI_A16, LI_A17, LI_A18, LI_A19, LI_A20, LI_A21, LI_A22, LI_A23, LI_A24, LI_A25, LI_A26, LI_A27, LI_A28, LI_A29;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea_ts1);

        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
         pBack=findViewById(R.id.back_ea_ts_1);





        pBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int val = preferences.getInt("sp_eats1", 1);


                if(val==1){
                    Intent intent1 = new Intent(EA_ts_1.this, TutorialActivity.class);
                    startActivity(intent1);
                }
                else if(val==2){
                    Intent intent1 = new Intent(EA_ts_1.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }

            }
        });


        LI_A1 = findViewById(R.id.LI_A1);
        LI_A2 = findViewById(R.id.LI_A2);
        LI_A3 = findViewById(R.id.LI_A3);
        LI_A4 = findViewById(R.id.LI_A4);
        LI_A5 = findViewById(R.id.LI_A5);
        LI_A6 = findViewById(R.id.LI_A6);
        LI_A7 = findViewById(R.id.LI_A7);
        LI_A8 = findViewById(R.id.LI_A8);
        LI_A9 = findViewById(R.id.LI_A9);
        LI_A10 = findViewById(R.id.LI_A10);
        LI_A11 = findViewById(R.id.LI_A11);
        LI_A12 = findViewById(R.id.LI_A12);
        LI_A13 = findViewById(R.id.LI_A13);
        LI_A14 = findViewById(R.id.LI_A14);
        LI_A15 = findViewById(R.id.LI_A15);
        LI_A16 = findViewById(R.id.LI_A16);
        LI_A17 = findViewById(R.id.LI_A17);
        LI_A18 = findViewById(R.id.LI_A18);
        LI_A19 = findViewById(R.id.LI_A19);
        LI_A20 = findViewById(R.id.LI_A20);
        LI_A21 = findViewById(R.id.LI_A21);
        LI_A22 = findViewById(R.id.LI_A22);
        LI_A23 = findViewById(R.id.LI_A23);
        LI_A24 = findViewById(R.id.LI_A24);
        LI_A25 = findViewById(R.id.LI_A25);
        LI_A26 = findViewById(R.id.LI_A26);
        LI_A27 = findViewById(R.id.LI_A27);
        LI_A28 = findViewById(R.id.LI_A28);
        LI_A29 = findViewById(R.id.LI_A29);


        LI_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 1);
                intent.putExtra("keyI_RPSA", 101);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",2 );
                intent.putExtra("keyI_RPSA",111 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 3);
                intent.putExtra("keyI_RPSA",111 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 4);
                intent.putExtra("keyI_RPSA", 101);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",5 );
                intent.putExtra("keyI_RPSA", 111);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",6 );
                intent.putExtra("keyI_RPSA", 101);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 7);
                intent.putExtra("keyI_RPSA",111 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 8);
                intent.putExtra("keyI_RPSA", 222);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 9);
                intent.putExtra("keyI_RPSA", 222);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 10);
                intent.putExtra("keyI_RPSA",101 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 11);
                intent.putExtra("keyI_RPSA",101 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 12);
                intent.putExtra("keyI_RPSA", 222);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 13);
                intent.putExtra("keyI_RPSA", 333);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 14);
                intent.putExtra("keyI_RPSA",444 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 15);
                intent.putExtra("keyI_RPSA",222 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 16);
                intent.putExtra("keyI_RPSA", 333);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 17);
                intent.putExtra("keyI_RPSA", 444);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 18);
                intent.putExtra("keyI_RPSA", 444);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 19);
                intent.putExtra("keyI_RPSA", 333);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 20);
                intent.putExtra("keyI_RPSA",333 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 21);
                intent.putExtra("keyI_RPSA", 444);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 22);
                intent.putExtra("keyI_RPSA",555 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 23);
                intent.putExtra("keyI_RPSA", 666);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 24);
                intent.putExtra("keyI_RPSA", 777);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",25 );
                intent.putExtra("keyI_RPSA", 777);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",26 );
                intent.putExtra("keyI_RPSA",555 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 27);
                intent.putExtra("keyI_RPSA", 666);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 28);
                intent.putExtra("keyI_RPSA", 888);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        LI_A29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_1.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 29);
                intent.putExtra("keyI_RPSA", 888);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 1);
                editor.apply();
                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed(){

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_eats1", 1);


            if(val==1){
                Intent intent1 = new Intent(EA_ts_1.this, TutorialActivity.class);
                startActivity(intent1);
            }
            else if(val==2){
                Intent intent1 = new Intent(EA_ts_1.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }



    }


}


