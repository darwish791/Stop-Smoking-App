package com.darwishashraf.flashchatnewfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class KenaliTandaKemurunganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenali_tanda_kemurungan);

        setSupportActionBar((Toolbar)findViewById(R.id.kenali_tanda_kemurungan_toolbar));
        setTitle("Kenali Tanda Kemurungan");
    }
}
