package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class CoolsZTOActivity extends AppCompatActivity {
    TextView tvh, tvb1, tvb2, tvb3;
    ImageView iv_pic1, iv_pic2;
    ImageView ivBack;
    int key ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cools_ztoactivity);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }

        tvh=findViewById(R.id.tvHead_ZTO);
        tvb1=findViewById(R.id.tvBody_ZTO1);
        tvb2=findViewById(R.id.tvBody_ZTO2);
        tvb3=findViewById(R.id.tvBody_ZTO3);
        iv_pic1=findViewById(R.id.ivpicZTO1);
        iv_pic2=findViewById(R.id.ivpicZTO2);
        ivBack=findViewById(R.id.ivpicZTO_backiconreal);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoolsZTOActivity.this, LCoolZTOActivity.class);
                startActivity(intent);
            }
        });

        key  = getIntent().getExtras().getInt("keyval_zto");


        if(key==1){
            tvh.setText(R.string.string_lcztoaivN1);
            tvb1.setText(R.string.string_lcztoaiv11);
            tvb2.setText(R.string.string_lcztoaiv12);
            tvb3.setText(R.string.string_lcztoaiv13);
            iv_pic1.setImageResource(R.drawable.lcztoaiv11);
            iv_pic2.setImageResource(R.drawable.lcztoaiv12);
        }
        if(key ==2){
            tvh.setText(R.string.string_lcztoaivN2);
            tvb1.setText(R.string.string_lcztoaiv21);
            tvb2.setText(R.string.string_lcztoaiv22);
            tvb3.setText(R.string.string_lcztoaiv23);
            iv_pic1.setImageResource(R.drawable.lcztoaiv2);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==3){
            tvh.setText(R.string.string_lcztoaivN3);
            tvb1.setText(R.string.string_lcztoaiv31);
            tvb2.setText(R.string.string_lcztoaiv32);
            tvb3.setText(R.string.string_lcztoaiv33);
            iv_pic1.setImageResource(R.drawable.lcztoaiv3);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==4){
            tvh.setText(R.string.string_lcztoaivN4);
            tvb1.setText(R.string.string_lcztoaiv41);
            tvb2.setText(R.string.string_lcztoaiv42);
            tvb3.setText(R.string.string_lcztoaiv43);
            iv_pic1.setImageResource(R.drawable.lcztoaiv4);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==5){
            tvh.setText(R.string.string_lcztoaivN5);
            tvb1.setText(R.string.string_lcztoaiv51);
            tvb2.setText(R.string.string_lcztoaiv52);
            tvb3.setText(R.string.string_lcztoaiv53);
            iv_pic1.setImageResource(R.drawable.lcztoaiv5);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==6){
            tvh.setText(R.string.string_lcztoaivN6);
            tvb1.setText(R.string.string_lcztoaiv61);
            tvb2.setText(R.string.string_lcztoaiv62);
            tvb3.setText(R.string.string_lcztoaiv63);
            iv_pic1.setImageResource(R.drawable.random_pic_backing);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==7){
            tvh.setText(R.string.string_lcztoaivN7);
            tvb1.setText(R.string.string_lcztoaiv71);
            tvb2.setText(R.string.string_lcztoaiv72);
            tvb3.setText(R.string.string_lcztoaiv73);
            iv_pic1.setImageResource(R.drawable.random_pic_backing);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==8){
            tvh.setText(R.string.string_lcztoaivN8);
            tvb1.setText(R.string.string_lcztoaiv81);
            tvb2.setText(R.string.string_lcztoaiv82);
            tvb3.setText(R.string.string_lcztoaiv83);
            iv_pic1.setImageResource(R.drawable.lcztoaiv81);
            iv_pic2.setImageResource(R.drawable.lcztoaiv82);
        }
        if(key ==9){
            tvh.setText(R.string.string_lcztoaivN9);
            tvb1.setText(R.string.string_lcztoaiv91);
            tvb2.setText(R.string.string_lcztoaiv92);
            tvb3.setText(R.string.string_lcztoaiv93);
            iv_pic1.setImageResource(R.drawable.lcztoaiv91);
            iv_pic2.setImageResource(R.drawable.lcztoaiv92);
        }
        if(key ==10){
            tvh.setText(R.string.string_lcztoaivN10);
            tvb1.setText(R.string.string_lcztoaiv101);
            tvb2.setText(R.string.string_lcztoaiv102);
            tvb3.setText(R.string.string_lcztoaiv103);
            iv_pic1.setImageResource(R.drawable.lcztoaiv101);
            iv_pic2.setImageResource(R.drawable.lcztoaiv102);
        }



    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(CoolsZTOActivity.this, LCoolZTOActivity.class);
        startActivity(intent);


    }


}