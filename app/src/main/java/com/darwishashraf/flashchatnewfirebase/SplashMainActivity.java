package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.hanks.htextview.base.HTextView;

import java.util.ArrayList;

public class SplashMainActivity extends AppCompatActivity {

    private ImageView mImageView;

    private HTextView textViewRainBow;
    int delay = 2000; //milliseconds
    Handler handler;
    ArrayList<String> arrMessages = new ArrayList<>();
    int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main);

        mImageView = (ImageView) findViewById(R.id.app_logo);
//        mTextView = (TextView) findViewById(R.id.appTitle);
        Animation myanimation = AnimationUtils.loadAnimation(this, R.anim.my_trans);
        mImageView.startAnimation(myanimation);


        /* Some Sample Messages for Animation */
        arrMessages.add("Aplikasi Henti Rokok");
        arrMessages.add("Aplikasi Henti Rokok");
        textViewRainBow = findViewById(R.id.text_view_rainBow);
        textViewRainBow.animateText(arrMessages.get(position)); // Animation rainbow start
        textViewRainBow.startAnimation(myanimation); // Animation splash, fade in
        /* Change Messages every 2 Seconds */
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){

                handler.postDelayed(this, delay);
                if(position>=arrMessages.size())
                    position=0;
                textViewRainBow.animateText(arrMessages.get(position));
                position++;
            }
        }, delay);
        /* Some Sample Messages for Animation */




        Thread timer = new Thread() {
            public void run () {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    final Intent i = new Intent (SplashMainActivity.this, MainIntroActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();


    }
}
