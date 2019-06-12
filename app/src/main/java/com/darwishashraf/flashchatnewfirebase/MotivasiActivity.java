package com.darwishashraf.flashchatnewfirebase;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MotivasiActivity extends AppCompatActivity {

    private String[] imageUrls = new String[]{
            "https://pbs.twimg.com/media/DefIX3ZVAAEKdgK.jpg",
            "http://2.bp.blogspot.com/-Jihi6uRyoVA/VQDgSQA9UiI/AAAAAAAAAHE/I7nVNVW7ZQA/s1600/5289377_20140915013433.jpg",
            "http://www.imedik.org/wp-content/uploads/2017/09/BantahRokokPekCil_Poster3.png",
            "https://i.imgur.com/EGGcyeR.jpg",
            "https://i.imgur.com/7wIHn0H.jpg",
            "https://i.imgur.com/xhgZQGB.jpg",
            "https://i.imgur.com/JiVNmkf.jpg",
            "https://i.imgur.com/Gv5Peou.jpg",
            "https://i.imgur.com/SX0OLpP.jpg",
            "https://i.imgur.com/JkHr2OY.jpg",
            "https://i.imgur.com/2C0ZfpF.jpg",
            "https://i.imgur.com/bWOjCHt.jpg",
            "https://i.imgur.com/MEwUK6e.jpg",
            "https://i.imgur.com/93ohY1G.jpg",
            "https://i.imgur.com/uPtssYn.jpg",
            "https://i.imgur.com/6hPUaYq.jpg",
            "https://i.imgur.com/R5Oo9ZL.jpg",
            "https://i.imgur.com/nTuwF4d.jpg",
            "https://i.redd.it/yzibpo7kha5z.jpg",
            "http://4.bp.blogspot.com/-IGbMQ2v0SLk/VlnKvlo3QYI/AAAAAAAABhI/7GDpJ1F30Pw/s1600/K1O8VWc.jpg",
            "http://4.bp.blogspot.com/-caQia6erZIg/VJz4Qc7o9rI/AAAAAAAABLY/w9An39yDv4w/s1600/Motivation-Picture-Quote-No-Quitting.jpg",
            "https://www.goalcast.com/wp-content/uploads/2017/05/Inspiring-Nelson-Mandela-quotes-I-never-lose-I-either-win-or-learn..jpg",
            "http://1.bp.blogspot.com/-OCUOri3jLHU/Vmuj6moPQlI/AAAAAAAABos/XJVuREi7XwY/s1600/brWzBr6.jpg",
            "https://www.gannett-cdn.com/usatoday/editorial/graphics/2016/06/ALIDAYS1.jpg",
            "https://www.brainyquote.com/photos_tr/en/u/unknown/159550/unknown1-2x.jpg",
            "https://i.pinimg.com/474x/a9/b5/b8/a9b5b8506ccfa106efd2e020d53e5ca7--smoking-quotes-quit-smoking-motivation.jpg",
            "http://saintluciaair.com/wp-content/uploads/2018/11/anti-smoking-quotes-20-motivational-slogans-to-help-you-quit-smoking-and-stop.jpg",
            "https://www.askideas.com/media/83/Congratulations-on-almost-quitting-smoking.jpg",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivasi);

        setSupportActionBar((Toolbar)findViewById(R.id.motivasi_toolbar));
        setTitle("Motivasi");

        ViewPager viewPager = findViewById(R.id.view_pager_motivasi);
        ViewPagerAdapterMotivasi adapter = new ViewPagerAdapterMotivasi(this, imageUrls);
        viewPager.setAdapter(adapter);
    }
}
