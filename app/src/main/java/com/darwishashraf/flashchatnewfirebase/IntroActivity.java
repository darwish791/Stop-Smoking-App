package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        SliderPage sliderPage_1 = new SliderPage();
        sliderPage_1.setTitle("Info");
        sliderPage_1.setDescription("Info Henti Rokok");
        sliderPage_1.setImageDrawable(R.drawable.ic_class_intro);
        sliderPage_1.setBgColor(ContextCompat.getColor(getApplicationContext(), R.color.color_1));
        addSlide(AppIntroFragment.newInstance(sliderPage_1));
        //setSlideOverAnimation();

        SliderPage sliderPage_2 = new SliderPage();
        sliderPage_2.setTitle("Menu");
        sliderPage_2.setDescription("Motivasi Henti dan Bahaya rokok");
        sliderPage_2.setImageDrawable(R.drawable.ic_peringatan_intro);
        sliderPage_2.setBgColor(ContextCompat.getColor(getApplicationContext(), R.color.color_2));
        addSlide(AppIntroFragment.newInstance(sliderPage_2));

        SliderPage sliderPage_3 = new SliderPage();
        sliderPage_3.setTitle("Komuniti");
        sliderPage_3.setDescription("Kongsi pengalaman dan tips bersama orang lain");
        sliderPage_3.setImageDrawable(R.drawable.ic_komuniti_intro);
        sliderPage_3.setBgColor(ContextCompat.getColor(getApplicationContext(), R.color.color_3));
        addSlide(AppIntroFragment.newInstance(sliderPage_3));

        SliderPage sliderPage_4 = new SliderPage();
        sliderPage_4.setTitle("Audio");
        sliderPage_4.setDescription("Tenangkan diri dengan audio tenang");
        sliderPage_4.setImageDrawable(R.drawable.ic_musik_intro);
        sliderPage_4.setBgColor(ContextCompat.getColor(getApplicationContext(), R.color.color_4));
        addSlide(AppIntroFragment.newInstance(sliderPage_4));

        SliderPage sliderPage_5 = new SliderPage();
        sliderPage_5.setTitle("Bantuan");
        sliderPage_5.setDescription("Dapatkan bantuan dari pakar");
        sliderPage_5.setImageDrawable(R.drawable.ic_location_intro);
        sliderPage_5.setBgColor(ContextCompat.getColor(getApplicationContext(), R.color.color_5));
        addSlide(AppIntroFragment.newInstance(sliderPage_5));

        SliderPage sliderPage_6 = new SliderPage();
        sliderPage_6.setTitle("Diari Henti Rokok");
        sliderPage_6.setDescription("Rekod perjalanan bebas rokok anda menggunakan Diari Henti Rokok");
        sliderPage_6.setImageDrawable(R.drawable.ic_diari_intro);
        sliderPage_6.setBgColor(ContextCompat.getColor(getApplicationContext(), R.color.color_6));
        addSlide(AppIntroFragment.newInstance(sliderPage_6));

        //showSkipButton(false);
        //setProgressButtonEnabled(false);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        Intent MainSidebarActivityIntent = new Intent(IntroActivity.this, com.darwishashraf.flashchatnewfirebase.MainSidebarActivity.class);
        startActivity(MainSidebarActivityIntent);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent MainSidebarActivityIntent = new Intent(IntroActivity.this, com.darwishashraf.flashchatnewfirebase.MainSidebarActivity.class);
        startActivity(MainSidebarActivityIntent);
    }
}
