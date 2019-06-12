package com.darwishashraf.flashchatnewfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MengapaPerluBerhentiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengapa_perlu_berhenti);

        setSupportActionBar((Toolbar)findViewById(R.id.mengapa_perlu_berhenti_toolbar));
        setTitle("Mengapa Perlu Berhenti");
    }
}
