package com.example.aanfa.sewaaja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class Cari extends AppCompatActivity {
    private Spinner sPnamen;
    private String[]german={
            "Justin","Aan","Firda"
    };
    private Spinner sPnamen1;
    private String[]german1={
            "Clurit","Gitar","Bass"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);
    }

}
