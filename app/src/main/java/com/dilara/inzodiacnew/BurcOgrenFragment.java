package com.dilara.inzodiacnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class BurcOgrenFragment extends Fragment {
    private Button button_hesapla;
    private EditText editTextAy;
    private EditText editTextGun;
    private EditText editTextYil;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.burc_ogren_fragment, viewGroup, false);
        button_hesapla = inflate.findViewById(R.id.button_hesapla);
        editTextGun =  inflate.findViewById(R.id.editTextGun);
        editTextAy =  inflate.findViewById(R.id.editTextAy);
        editTextYil =  inflate.findViewById(R.id.editTextYil);
        button_hesapla.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                int gun = Integer.parseInt(editTextGun.getText().toString());
                int ay = Integer.parseInt(editTextAy.getText().toString());
                String burc ="" ;

                if ((ay == 3 && gun > 20) || (ay == 4 && gun < 20)) {
                    burc = "Koç";
                } else if ((ay == 4 && gun > 19) || (ay == 5 && gun < 21)) {
                    burc = "Boğa";
                } else if ((ay == 5 && gun > 20) || (ay == 6 && gun < 22)) {
                    burc = "İkizler";
                } else if ((ay == 6 && gun > 21) || (ay == 7 && gun < 23)) {
                    burc = "Yengeç";
                } else if ((ay == 7 && gun > 22) || (ay == 8 && gun < 23)) {
                    burc = "Aslan";
                } else if ((ay == 8 && gun > 22) || (ay == 9 && gun < 23)) {
                    burc = "Başak";
                } else if ((ay == 9 && gun > 22) || (ay == 10 && gun < 23)) {
                    burc = "Terazi";
                } else if ((ay == 10 && gun > 22) || (ay == 11 && gun < 22)) {
                    burc = "Akrep";
                } else if ((ay == 11 && gun > 21) || (ay == 12 && gun < 22)) {
                    burc = "Yay";
                } else if ((ay == 12 && gun > 21) || (ay == 1 && gun < 20)) {
                    burc = "Oğlak";
                } else if ((ay == 1 && gun > 19) || (ay == 2 && gun < 19)) {
                    burc = "Kova";
                } else if ((ay == 2 || gun < 18) && (ay == 3 || gun > 21)) {
                    burc = "Balık";
                } else {
                    Toast.makeText(getActivity(), "Alanları doğru doldurun ki burcunuzu öğrenebilesiniz...", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getActivity(), "" + burc + " burcusun!", Toast.LENGTH_LONG).show();
            }
        });
        return inflate;
    }
}
