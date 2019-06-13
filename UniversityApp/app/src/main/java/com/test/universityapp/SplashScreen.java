package com.test.universityapp;

import android.app.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.splashID);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();

            }
        }).start();

    }

    private  void doWork(){
        for (int progress = 0; progress<100; progress+=10){
            try {
                Thread.sleep(100);
                progressBar.setProgress(progress);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private  void startApp(){
        Intent intent = new Intent(SplashScreen.this, ListViewItemClickEventExample.class);
        startActivity(intent);
    }

}