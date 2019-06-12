package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.hanks.htextview.base.HTextView;

import java.util.ArrayList;

public class KKParitRajaActivity extends AppCompatActivity {

    private Button mButton;


    private HTextView textViewLine;
    int delay = 2000; //milliseconds
    Handler handler;
    ArrayList<String> arrMessages = new ArrayList<>();
    int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kkparit_raja);

        setSupportActionBar((Toolbar)findViewById(R.id.kk_parit_raja_toolbar));
        setTitle("Klinik Kesihatan Parit Raja");

        /* Some Sample Messages for Animation */
        arrMessages.add("Klinik Kesihatan Parit Raja");
        arrMessages.add("Klinik Kesihatan Parit Raja");
        textViewLine = findViewById(R.id.text_view_line);
        textViewLine.animateText(arrMessages.get(position));
        /* Change Messages every 2 Seconds */
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){

                handler.postDelayed(this, delay);
                if(position>=arrMessages.size())
                    position=0;
                textViewLine.animateText(arrMessages.get(position));
                position++;
            }
        }, delay);
        /* Some Sample Messages for Animation */




        mButton = (Button) findViewById(R.id.kk_parit_raja_maps_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testIntent = new Intent(KKParitRajaActivity.this, KKParitRajaMaps.class);
                startActivity(testIntent);
            }
        });
    }
}
