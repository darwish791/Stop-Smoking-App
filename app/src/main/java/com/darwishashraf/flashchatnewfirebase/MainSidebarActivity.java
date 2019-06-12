package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import eu.long1.spacetablayout.SpaceTabLayout;

public class MainSidebarActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    SpaceTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sidebar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        if (savedInstanceState == null) {
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    //new ModulFragment()).commit();
            //navigationView.setCheckedItem(R.id.info_about_app);
        }



        //--------------------------

        //add the fragments you want to display in a List
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new ModulFragment());
        fragmentList.add(new UtamaFragment());
        fragmentList.add(new PeringatanFragment());


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SpaceTabLayout) findViewById(R.id.spaceTabLayout);

        //we need the savedInstanceState to get the position
        tabLayout.initialize(viewPager, getSupportFragmentManager(),
                fragmentList, savedInstanceState);

        //--------------------------
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
//            case R.id.info_about_app:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                        new ModulFragment()).commit();
//                break;



                case R.id.komuniti:
                    Intent loginIntent = new Intent(MainSidebarActivity.this, LoginActivity.class);
                    startActivity(loginIntent);
                break;



            case R.id.music:
                Intent MusicIntent = new Intent(MainSidebarActivity.this, MusicActivity.class);
                startActivity(MusicIntent);
                break;

            case R.id.dapatkan_bantuan:
                Intent DapatkanBantuanIntent = new Intent(MainSidebarActivity.this, DapatkanBantuanActivity.class);
                startActivity(DapatkanBantuanIntent);
                break;

            case R.id.diari:   // Note coding with mitch
                Intent Diari2Intent = new Intent(MainSidebarActivity.this, NotesListActivity.class);
                startActivity(Diari2Intent);
                break;

            case R.id.motivasi:
                Intent motivasiIntent = new Intent(MainSidebarActivity.this, MotivasiActivity.class);
                startActivity(motivasiIntent);
                break;

            case R.id.peringatan:
                Intent peringatanIntent = new Intent(MainSidebarActivity.this, PeringatanActivity.class);
                startActivity(peringatanIntent);
                break;
                /*

            case R.id.camera_ar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ArCameraFragment()).commit();
                break;

                */


        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen (GravityCompat.START)) {
            mDrawerLayout.closeDrawer (GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    //we need the outState to save the position
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        tabLayout.saveState(outState);
        super.onSaveInstanceState(outState);
    }
}
