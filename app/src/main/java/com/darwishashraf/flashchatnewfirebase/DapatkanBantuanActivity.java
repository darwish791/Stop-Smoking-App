package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.hanks.htextview.base.HTextView;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

import java.util.ArrayList;

public class DapatkanBantuanActivity extends AppCompatActivity {

    //-------textpath view-----------
    private HTextView fallTextView;

    int delay = 2000; //milliseconds
    Handler handler;
    ArrayList<String> arrMessages = new ArrayList<>();
    int position=0;
    //-------textpath view-----------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dapatkan_bantuan);

        setSupportActionBar((Toolbar)findViewById(R.id.dapatkan_bantuan_toolbar));
        setTitle("Dapatkan Bantuan");

        //-------textpath view-----------
        /* Some Sample Messages for Animation */
        arrMessages.add("Hai pejuang-pejuang!");
        arrMessages.add("Untuk berhenti merokok");
        arrMessages.add("Tidak semestinya berseorangan!");
        arrMessages.add("Dapatkan bantuan");
        arrMessages.add("Daripada doktor-doktor pakar");
        arrMessages.add("Pilih intitusi kesihatan");
        arrMessages.add("Hubungi doktor");
        arrMessages.add("Gunakan peta untuk dapatkan lokasi");

        /* Initialize HTextView */
        fallTextView = findViewById(R.id.fall_text_view);


        /* First Message */
        fallTextView.animateText(arrMessages.get(position));

        position++;

        /* Change Messages every 2 Seconds */
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){

                handler.postDelayed(this, delay);
                if(position>=arrMessages.size())
                    position=0;
                fallTextView.animateText(arrMessages.get(position));
                position++;
            }
        }, delay);
        //-------textpath view-----------




        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.ic_hospital_hitam, R.drawable.ic_close_white)
                .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.ic_hospital_putih)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.ic_hospital_putih)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.ic_hospital_putih)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.ic_hospital_putih)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.ic_hospital_putih)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        //Toast.makeText(MainActivity.this, "You selected: " + arrayName[index], Toast.LENGTH_LONG).show();
                        switch (index) {
                            case 0:
                                Toast.makeText(DapatkanBantuanActivity.this, "Anda pilih Klinik Kesihatan Parit Raja", Toast.LENGTH_LONG).show();
                                final Intent KKParitRajaIntent = new Intent(DapatkanBantuanActivity.this, KKParitRajaActivity.class);
                                //startActivity(FirstActivityIntent);

                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                Thread timer_0 = new Thread() {
                                    public void run () {
                                        try {
                                            sleep(400);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        finally {
                                            startActivity(KKParitRajaIntent);

                                        }
                                    }
                                };
                                timer_0.start();
                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                break;


                            case 1:
                                Toast.makeText(DapatkanBantuanActivity.this, "Anda pilih Hospital Batu Pahat", Toast.LENGTH_LONG).show();
                                final Intent HospitalBatuPahatIntent = new Intent(DapatkanBantuanActivity.this, HospitalBatuPahatActivity.class);
                                //startActivity(FirstActivityIntent);

                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                Thread timer_1 = new Thread() {
                                    public void run () {
                                        try {
                                            sleep(400);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        finally {
                                            startActivity(HospitalBatuPahatIntent);

                                        }
                                    }
                                };
                                timer_1.start();
                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                break;


                            case 2:
                                Toast.makeText(DapatkanBantuanActivity.this, "Anda pilih Hospital Alor Setar", Toast.LENGTH_LONG).show();
                                final Intent HospitalAlorSetarIntent = new Intent(DapatkanBantuanActivity.this, HospitalAlorSetarActivity.class);
                                //startActivity(FirstActivityIntent);

                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                Thread timer_2 = new Thread() {
                                    public void run () {
                                        try {
                                            sleep(400);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        finally {
                                            startActivity(HospitalAlorSetarIntent);

                                        }
                                    }
                                };
                                timer_2.start();
                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                break;
                            case 3:
                                Toast.makeText(DapatkanBantuanActivity.this, "Anda pilih Hospital Kuala Lumpur", Toast.LENGTH_LONG).show();
                                final Intent HospitalKualaLumpurIntent = new Intent(DapatkanBantuanActivity.this, HospitalKualaLumpurActivity.class);
                                //startActivity(FirstActivityIntent);

                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                Thread timer_3 = new Thread() {
                                    public void run () {
                                        try {
                                            sleep(400);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        finally {
                                            startActivity(HospitalKualaLumpurIntent);

                                        }
                                    }
                                };
                                timer_3.start();
                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------

                                break;
                            case 4:
                                Toast.makeText(DapatkanBantuanActivity.this, "Anda pilih Klinik Kesihatan Sri Gading", Toast.LENGTH_LONG).show();
                                final Intent KKSriGadingIntent = new Intent(DapatkanBantuanActivity.this, KKSriGadingActivity.class);
                                //startActivity(FirstActivityIntent);

                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                Thread timer_4 = new Thread() {
                                    public void run () {
                                        try {
                                            sleep(400);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        finally {
                                            startActivity(KKSriGadingIntent);

                                        }
                                    }
                                };
                                timer_4.start();
                                //-------Timer to let animation pusing-pusing finish sebelum buat Intent-------------------------
                                break;
                        }


                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {}

            @Override
            public void onMenuClosed() {}

        });
    }
}
