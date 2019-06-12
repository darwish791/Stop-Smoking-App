package com.darwishashraf.flashchatnewfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TidakKembaliMerokokSemulaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tidak_kembali_merokok_semula);

        setSupportActionBar((Toolbar)findViewById(R.id.tidak_kembali_merokok_semula_toolbar));
        setTitle("Tips Untuk Tidak Kembali Merokok");
    }
}
