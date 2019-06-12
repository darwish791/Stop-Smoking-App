package com.darwishashraf.flashchatnewfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MengapaIaSangatSukarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengapa_ia_sangat_sukar);

        setSupportActionBar((Toolbar)findViewById(R.id.mengapa_ia_sangat_sukar_toolbar));
        setTitle("Mengapa Ia Sangat Sukar");
    }
}
