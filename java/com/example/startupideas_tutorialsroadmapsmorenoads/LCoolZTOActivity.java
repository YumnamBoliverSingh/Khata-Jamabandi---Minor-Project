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

public class LCoolZTOActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcool_ztoactivity);

        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }



//SharedPre
        tv1=findViewById(R.id.tvZTO1);
        tv2=findViewById(R.id.tvZTO2);
        tv3=findViewById(R.id.tvZTO3);
        tv4=findViewById(R.id.tvZTO4);
        tv5=findViewById(R.id.tvZTO5);
        tv6=findViewById(R.id.tvZTO6);
        tv7=findViewById(R.id.tvZTO7);
        tv8=findViewById(R.id.tvZTO8);
        tv9=findViewById(R.id.tvZTO9);
        tv10=findViewById(R.id.tvZTO10);

        back=findViewById(R.id.ZTO_backicon);







        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int vaz = preferences.getInt("sp_coolsZto", 2);

                if(vaz==1){
                    Intent intent = new Intent(LCoolZTOActivity.this, activity_navigation_drawer.class);
                    startActivity(intent);
                }
                else if(vaz==2) {
                    Intent intent = new Intent(LCoolZTOActivity.this, TutorialActivity.class);
                    startActivity(intent);
                }

            }
        });


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 1);
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 2);
                startActivity(intent);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 3);
                startActivity(intent);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 4);
                startActivity(intent);
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 5);
                startActivity(intent);
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 6);
                startActivity(intent);
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 7);
                startActivity(intent);
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 8);
                startActivity(intent);
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 9);
                startActivity(intent);
            }
        });
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LCoolZTOActivity.this, CoolsZTOActivity.class);
                intent.putExtra("keyval_zto", 10);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_coolsZto", 2);

            if(val==1){
                Intent intent = new Intent(LCoolZTOActivity.this, activity_navigation_drawer.class);
                startActivity(intent);
            }else if(val==2) {
                Intent intent = new Intent(LCoolZTOActivity.this, TutorialActivity.class);
                startActivity(intent);
            }


    }

}