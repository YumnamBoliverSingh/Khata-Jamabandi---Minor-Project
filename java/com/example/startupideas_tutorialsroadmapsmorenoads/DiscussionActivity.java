package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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

import java.util.Objects;

public class DiscussionActivity extends AppCompatActivity {


    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion);
        getSupportActionBar().hide();
         if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        back=findViewById(R.id.backDiscussion);
        String httpvalue = bundle.getString("D_webViewhttps_token_string");
        WebView myWebView =   findViewById(R.id.webViewD);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl(httpvalue);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscussionActivity.this, activity_navigation_drawer.class);
                startActivity(intent);

            }
        });
        //No Internet !!
        ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cm.getActiveNetworkInfo();
        boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

        if(connected==false){
            Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
        }
        Toast.makeText(getApplicationContext(), "Loading, please Wait!", Toast.LENGTH_LONG).show();



    } @Override
    public void onBackPressed() {


            Intent intent=new Intent(DiscussionActivity.this, activity_navigation_drawer.class);
            startActivity(intent);


    }


}