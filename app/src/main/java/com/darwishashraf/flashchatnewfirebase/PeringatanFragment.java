package com.darwishashraf.flashchatnewfirebase;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class PeringatanFragment extends Fragment {

    private Button komunitiBtn;
    private Button audioBtn;
    private Button dapatkanBantuanBtn;
    private Button diariBtn;
    private Button motivasiBtn;
    private Button peringatanBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_peringatan, container, false);

        komunitiBtn = (Button) view.findViewById(R.id.menu_komuniti_btn);
        audioBtn = (Button) view.findViewById(R.id.menu_audio_btn);
        dapatkanBantuanBtn = (Button) view.findViewById(R.id.menu_dapatkan_bantuan_btn);
        diariBtn = (Button) view.findViewById(R.id.menu_diari_henti_rokok_btn);
        motivasiBtn = (Button) view.findViewById(R.id.motivasi_btn);
        peringatanBtn = (Button) view.findViewById(R.id.peringatan_btn);

        komunitiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komunitiIntent = new Intent(getActivity(), LoginActivity.class);
                startActivity(komunitiIntent);
            }
        });

        audioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent audioIntent = new Intent(getActivity(), MusicActivity.class);
                startActivity(audioIntent);
            }
        });

        dapatkanBantuanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dapatkanBantuanIntent = new Intent(getActivity(), DapatkanBantuanActivity.class);
                startActivity(dapatkanBantuanIntent);
            }
        });

        diariBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diariIntent = new Intent(getActivity(), NotesListActivity.class);
                startActivity(diariIntent);
            }
        });

        motivasiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent motivasiIntent = new Intent(getActivity(), MotivasiActivity.class);
                startActivity(motivasiIntent);
            }
        });

        peringatanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent peringatanIntent = new Intent(getActivity(), PeringatanActivity.class);
                startActivity(peringatanIntent);
            }
        });

        return view;
    }

}
