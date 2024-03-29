package com.example.startupideas_tutorialsroadmapsmorenoads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class InjectStringsActivity extends AppCompatActivity {
    String bH, wN, sTP, bTP, httptbs;
    char iN;
    TextView bhTV, wnTV, stpTV, btpTV, inTV, httptbsTV, name2, txtOnline;
    ImageView iv;
    WebView webView;
    Button btn;
    ProgressBar progress;  //InterstitialAd interstitialStaticAd;
    boolean tf;


    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject_strings);

        getSupportActionBar().hide();
        Bundle extras = getIntent().getExtras();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }


        if(extras!=null){
            bH = extras.getString("boldHeadline");
            wN = extras.getString("writerName");
            sTP =  extras.getString("sTextPlain");
            bTP =  extras.getString("bTextPlain");
            iN =  extras.getChar("imageNumber");
            httptbs =  extras.getString("httpTBS");
        }

        back=findViewById(R.id.backInject);
        bhTV =findViewById(R.id.tvb1header);
        wnTV = findViewById(R.id.tvn1);
        stpTV = findViewById(R.id.tvstp2);
        btpTV = findViewById(R.id.tvbis3);
        iv=findViewById(R.id.ivP);
        name2 = findViewById(R.id.tvn2);
        webView = findViewById(R.id.wvwebcommon_id);
        btn=findViewById(R.id.btn);
        progress=findViewById(R.id.iCPB);
        txtOnline = findViewById(R.id.txtOnline);



        progress.setVisibility(View.GONE);
        txtOnline.setVisibility(View.GONE);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InjectStringsActivity.this, activity_navigation_drawer.class);
                startActivity(intent);
            }
        });
        //1
        if(iN=='a'){
            iv.setImageResource(R.drawable.amanda_richardson);
        }
        //2
        if(iN=='b'){
            iv.setImageResource(R.drawable.john_jantsch);
        }
        //3
        if(iN=='c'){
            iv.setImageResource(R.drawable.patrick_campbell);
        }
        //4
        if(iN=='d'){
            iv.setImageResource(R.drawable.maggie_leung);
        }
        //5
        if(iN=='e'){
            iv.setImageResource(R.drawable.joanna_wiebe);
        }
        //6
        if(iN=='f'){
            iv.setImageResource(R.drawable.jason_fried);
        }
        //7
        if(iN=='g'){
            iv.setImageResource(R.drawable.chris_von_wilpert);
        }
        //8
        if(iN=='h'){
            iv.setImageResource(R.drawable.matthew_barby);
        }
        //9
        if(iN=='i'){
            iv.setImageResource(R.drawable.janet_choi);
        }

        bhTV.setText(bH);
        wnTV.setText(wN);
        stpTV.setText(sTP);
        btpTV.setText(bTP);
        name2.setText(wN);






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//if connection unavailable
                boolean haveConnectedWifi = false;
                boolean haveConnectedMobile = false;

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo[] netInfo = cm.getAllNetworkInfo();
                for (NetworkInfo ni : netInfo) {
                    if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                        if (ni.isConnected())
                            haveConnectedWifi = true;
                    if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                        if (ni.isConnected())
                            haveConnectedMobile = true;
                }
                tf= haveConnectedWifi || haveConnectedMobile;

                if(tf==false) {
                    Snackbar.make(view, "Please Check Your Internet Connection!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else {


                        //if connection established
                        Toast.makeText(getApplicationContext(), "Loading Content", Toast.LENGTH_SHORT).show();
                        webView.getSettings().setJavaScriptEnabled(true); // enable javascript
                        webView.getSettings().setLoadWithOverviewMode(true);
                        webView.getSettings().setUseWideViewPort(true);

                        webView.setWebViewClient(new WebViewClient() {

                            @Override
                            public void onPageStarted(WebView view, String url, Bitmap facIcon) {
                                //showProgressBar();
                                progress.setVisibility(View.VISIBLE);
                                txtOnline.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onPageFinished(WebView view, String url) {
                                // hideProgressBar();
                                super.onPageFinished(view, url);
                                progress.setVisibility(View.GONE);
                                txtOnline.setVisibility(View.GONE);

                                Toast.makeText(getApplicationContext(), "Articles ready!!\nScroll down", Toast.LENGTH_SHORT).show();

                            }
                        });
                        //if connection established
                        webView.loadUrl(httptbs);


                    }



            }
        });



    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onBackPressed() {



            Intent intent = new Intent(InjectStringsActivity.this, activity_navigation_drawer.class);
            startActivity(intent);

    }


}