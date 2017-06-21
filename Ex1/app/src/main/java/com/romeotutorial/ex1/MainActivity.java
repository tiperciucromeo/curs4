package com.romeotutorial.ex1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar bara;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bara = (ProgressBar) findViewById(R.id.bar);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(i < 100){
                    i++;
                    bara.setProgress(i);
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}