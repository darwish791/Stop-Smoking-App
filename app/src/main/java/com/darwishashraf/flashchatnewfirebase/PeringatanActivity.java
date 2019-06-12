package com.darwishashraf.flashchatnewfirebase;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class PeringatanActivity extends AppCompatActivity {

    private String[] imageUrls = new String[]{
            "http://2.bp.blogspot.com/-qseQNrE7COE/T7SNp54VPPI/AAAAAAAAAJQ/j0zCmfzXOco/s1600/Tubuh-Seorg-Perokok.jpg",
            "http://4.bp.blogspot.com/-0atAOBcUkI4/UDiBck70k2I/AAAAAAAADFU/_4xlbpy57u4/s1600/bahaya%20rokok%20penyakit%20mulut.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Healthy_lung-smokers_lung.jpg/220px-Healthy_lung-smokers_lung.jpg",
            "https://media.ohbulan.com/wp-content/uploads/2015/08/muda.jpg",
            "https://1.bp.blogspot.com/-kyhkbb_-KkI/U_f8oQDkzxI/AAAAAAAANXI/XWLO1vnbA_k/s1600/smoking-induced-oral-cancer.jpg"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peringatan);

        setSupportActionBar((Toolbar)findViewById(R.id.peringatan_toolbar));
        setTitle("Peringatan");

        ViewPager viewPager = findViewById(R.id.view_pager_peringatan);
        ViewPagerAdapterPeringatan adapter = new ViewPagerAdapterPeringatan(this, imageUrls);
        viewPager.setAdapter(adapter);
    }
}
