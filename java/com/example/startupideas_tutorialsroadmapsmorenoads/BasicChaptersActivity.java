package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class BasicChaptersActivity extends AppCompatActivity {
    TextView tvh, tvb1, tvb2;
     ImageView iv_pic;
    ImageView ivBack;
    String Fhead_string, Fbody_string1, Fbody_string2;
    int key_for_the_activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_chapters);
        getSupportActionBar().hide();



        tvh=findViewById(R.id.tvHead_BC);
        tvb1=findViewById(R.id.tvBody_BC1);
        tvb2=findViewById(R.id.tvBody_BC2);
        iv_pic=findViewById(R.id.ivBC);
        ivBack=findViewById(R.id.BC_backiconreal);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }




        key_for_the_activity = getIntent().getExtras().getInt("keyval_ba");
        if(key_for_the_activity==1){
            tvh.setText(R.string.string_startupBasicsN1);
            tvb1.setText(R.string.string_startupBasics11);
            tvb2.setText(R.string.string_startupBasics12);

            iv_pic.setImageResource(R.drawable.bctiv1);
        }
        if(key_for_the_activity==2){
            tvh.setText(R.string.string_startupBasicsN2);
            tvb1.setText(R.string.string_startupBasics21);
            tvb2.setText(R.string.string_startupBasics22);

            iv_pic.setImageResource(R.drawable.bctiv2);
        }
        if(key_for_the_activity==3){
            tvh.setText(R.string.string_startupBasicsN3);
            tvb1.setText(R.string.string_startupBasics31);
            tvb2.setText(R.string.string_startupBasics32);

            iv_pic.setImageResource(R.drawable.bctiv3);
        }
        if(key_for_the_activity==4){
            tvh.setText(R.string.string_startupBasicsN4);
            tvb1.setText(R.string.string_startupBasics41);
            tvb2.setText(R.string.string_startupBasics42);

            iv_pic.setImageResource(R.drawable.bctiv4);
        }
        if(key_for_the_activity==5){
            tvh.setText(R.string.string_startupBasicsN5);
            tvb1.setText(R.string.string_startupBasics51);
            tvb2.setText(R.string.string_startupBasics52);

            iv_pic.setImageResource(R.drawable.bctiv5);
        }
        if(key_for_the_activity==6){
            tvh.setText(R.string.string_startupBasicsN6);
            tvb1.setText(R.string.string_startupBasics61);
            tvb2.setText(R.string.string_startupBasics62);

            iv_pic.setImageResource(R.drawable.bctiv6);
        }
        if(key_for_the_activity==7){
            tvh.setText(R.string.string_startupBasicsN7);
            tvb1.setText(R.string.string_startupBasics71);
            tvb2.setText(R.string.string_startupBasics72);

            iv_pic.setImageResource(R.drawable.bctiv7);
        }
        if(key_for_the_activity==8){
            tvh.setText(R.string.string_startupBasicsN8);
            tvb1.setText(R.string.string_startupBasics81);
            tvb2.setText(R.string.string_startupBasics82);

            iv_pic.setImageResource(R.drawable.bctiv8);
        }



        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicChaptersActivity.this, LBasicChaptersActivity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(BasicChaptersActivity.this, LBasicChaptersActivity.class);
        startActivity(intent);
    }




}