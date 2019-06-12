package com.darwishashraf.flashchatnewfirebase;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import yanzhikai.textpath.AsyncTextPathView;
import yanzhikai.textpath.SyncTextPathView;

public class MusicActivity extends AppCompatActivity implements View.OnClickListener{

    private Button play, pause, stop;
    MediaPlayer mMediaPlayer;
    int pauseCurrentPosition;

    private SyncTextPathView mSyncTextPathView;
    private AsyncTextPathView AsyncTextPathView_1;
    private AsyncTextPathView AsyncTextPathView_2;
    private AsyncTextPathView AsyncTextPathView_3;
    private AsyncTextPathView AsyncTextPathView_4;
    private AsyncTextPathView AsyncTextPathView_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        play = (Button) findViewById(R.id.play_btn);
        pause = (Button) findViewById(R.id.pause_btn);
        stop = (Button) findViewById(R.id.stop_btn);

        mSyncTextPathView = findViewById(R.id.SyncTextPathView);
        AsyncTextPathView_1 = findViewById(R.id.AsyncTextPathView1);
        AsyncTextPathView_2 = findViewById(R.id.AsyncTextPathView2);
        AsyncTextPathView_3 = findViewById(R.id.AsyncTextPathView3);
        AsyncTextPathView_4 = findViewById(R.id.AsyncTextPathView4);
        AsyncTextPathView_5 = findViewById(R.id.AsyncTextPathView5);

        mSyncTextPathView.startAnimation(0,1);
        AsyncTextPathView_1.startAnimation(0,1);
        AsyncTextPathView_2.startAnimation(0,1);
        AsyncTextPathView_3.startAnimation(0,1);
        AsyncTextPathView_4.startAnimation(0,1);
        AsyncTextPathView_5.startAnimation(0,1);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.play_btn:
                if (mMediaPlayer == null) {

                    mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yasin);
                    mMediaPlayer.start();

                } else if (!mMediaPlayer.isPlaying()) {

                    mMediaPlayer.seekTo(pauseCurrentPosition);
                    mMediaPlayer.start();
                }

                break;

            case R.id.pause_btn:
                if (mMediaPlayer != null) {
                    mMediaPlayer.pause();
                    pauseCurrentPosition = mMediaPlayer.getCurrentPosition();
                }
                break;

            case R.id.stop_btn:
                if (mMediaPlayer != null) {
                    mMediaPlayer.stop();
                    mMediaPlayer = null;
                }
                break;
        }

    }
}
