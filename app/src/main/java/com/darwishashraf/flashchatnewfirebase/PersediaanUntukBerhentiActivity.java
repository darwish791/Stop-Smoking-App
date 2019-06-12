package com.darwishashraf.flashchatnewfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class PersediaanUntukBerhentiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persediaan_untuk_berhenti);

        setSupportActionBar((Toolbar)findViewById(R.id.persediaan_untuk_berhenti_toolbar));
        setTitle("Persediaan Untuk Berhenti");
    }
}
