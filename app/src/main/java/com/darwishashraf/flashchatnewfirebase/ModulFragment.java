package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gauravbhola.ripplepulsebackground.RipplePulseLayout;

public class ModulFragment extends Fragment {

    RipplePulseLayout mRipplePulseLayout1;
    private Button mengapaPerluBerhentiBtn;

    RipplePulseLayout mRipplePulseLayout2;
    private Button mengapaIaSangatSukarBtn;

    RipplePulseLayout mRipplePulseLayout3;
    private Button persediaanUntukBerhentiBtn;

    RipplePulseLayout mRipplePulseLayout4;
    private Button tidakKembaliMerokokSemulaBtn;

    RipplePulseLayout mRipplePulseLayout5;
    private Button kenaliTandaKemurunganBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_modul, container, false);

        mRipplePulseLayout1 = view.findViewById(R.id.layout_ripplepulse_1);
        mRipplePulseLayout1.startRippleAnimation();
        mengapaPerluBerhentiBtn = (Button) view.findViewById(R.id.mengapa_perlu_berhenti_btn);

        mengapaPerluBerhentiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mengapaPerluBerhentiIntent = new Intent(getActivity(), MengapaPerluBerhentiActivity.class);
                startActivity(mengapaPerluBerhentiIntent);
            }
        });

        mRipplePulseLayout2 = view.findViewById(R.id.layout_ripplepulse_2);
        mRipplePulseLayout2.startRippleAnimation();
        mengapaIaSangatSukarBtn = (Button) view.findViewById(R.id.mengapa_ia_sangat_sukar_btn);

        mengapaIaSangatSukarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mengapaIaSangatSukarIntent = new Intent(getActivity(), MengapaIaSangatSukarActivity.class);
                startActivity(mengapaIaSangatSukarIntent);
            }
        });

        mRipplePulseLayout3 = view.findViewById(R.id.layout_ripplepulse_3);
        mRipplePulseLayout3.startRippleAnimation();
        persediaanUntukBerhentiBtn = (Button) view.findViewById(R.id.persediaan_untuk_berhenti_btn);

        persediaanUntukBerhentiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent persediaanUntukBerhentiIntent = new Intent(getActivity(), PersediaanUntukBerhentiActivity.class);
                startActivity(persediaanUntukBerhentiIntent);
            }
        });

        mRipplePulseLayout4 = view.findViewById(R.id.layout_ripplepulse_4);
        mRipplePulseLayout4.startRippleAnimation();
        tidakKembaliMerokokSemulaBtn = (Button) view.findViewById(R.id.tidak_kembali_merokok_semula_btn);

        tidakKembaliMerokokSemulaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tidakKembaliMerokokSemulaIntent = new Intent(getActivity(), TidakKembaliMerokokSemulaActivity.class);
                startActivity(tidakKembaliMerokokSemulaIntent);
            }
        });

        mRipplePulseLayout5 = view.findViewById(R.id.layout_ripplepulse_5);
        mRipplePulseLayout5.startRippleAnimation();
        kenaliTandaKemurunganBtn = (Button) view.findViewById(R.id.kenali_tanda_kemurungan_btn);

        kenaliTandaKemurunganBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kenaliTandaKemurunganIntent = new Intent(getActivity(), KenaliTandaKemurunganActivity.class);
                startActivity(kenaliTandaKemurunganIntent);
            }
        });





        return view;
    }


}
