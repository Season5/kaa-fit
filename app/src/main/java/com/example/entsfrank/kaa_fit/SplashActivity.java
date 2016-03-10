package com.example.entsfrank.kaa_fit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by frank on 3/10/16.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent startmain = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(startmain);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        myThread.start();
    }
}

