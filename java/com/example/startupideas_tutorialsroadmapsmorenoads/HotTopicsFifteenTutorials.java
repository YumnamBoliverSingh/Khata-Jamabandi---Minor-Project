package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;




import com.google.android.material.snackbar.Snackbar;

import java.lang.annotation.Native;
import java.util.Objects;

public class HotTopicsFifteenTutorials extends AppCompatActivity {
    ImageView back;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_topics_fifteen_tutorials);
         getSupportActionBar().hide();
        back=findViewById(R.id.iv4T);
        webView=findViewById(R.id.webView4T);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String httpvalue = bundle.getString("val_articleNumber");


        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(httpvalue);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotTopicsFifteenTutorials.this, TutorialActivity.class);
                startActivity(intent);
            }
        });
        Toast.makeText(getApplicationContext(), "Loading, please wait!", Toast.LENGTH_LONG).show();



    }
    @Override
    public void onBackPressed(){


            Intent intent = new Intent(HotTopicsFifteenTutorials.this, TutorialActivity.class);
            startActivity(intent);
        }


}