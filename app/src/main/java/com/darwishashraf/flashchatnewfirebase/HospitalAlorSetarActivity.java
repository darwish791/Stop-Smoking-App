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

public class HospitalAlorSetarActivity extends AppCompatActivity {

    private HTextView textViewLine;
    int delay = 2000; //milliseconds
    Handler handler;
    ArrayList<String> arrMessages = new ArrayList<>();
    int position=0;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_alor_setar);  // Asalnya Hospital Alor Setar

        setSupportActionBar((Toolbar)findViewById(R.id.hospital_alor_setar_toolbar));
        setTitle("Klinik Kesihatan Senggarang");

        /* Some Sample Messages for Animation */
        arrMessages.add("Klinik Kesihatan Senggarang");
        arrMessages.add("Klinik Kesihatan Senggarang");
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


        mButton = (Button) findViewById(R.id.alor_setar_maps_btn);  // Cuma tukar koordinat alor setar kepada Senggarang. Nama aktiviti stay Alor Setar Maps
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testIntent = new Intent(HospitalAlorSetarActivity.this, HospitalAlorSetarMaps.class);
                startActivity(testIntent);
            }
        });
    }
}
