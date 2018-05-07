package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Cari_alat(View view) {
        Intent intent = new Intent(Main2Activity.this, Cari.class);
        startActivity(intent);
    }

    public void Lihat_katalog(View view) {
    }

    public void Bayar(View view) {
        Intent intent = new Intent(Main2Activity.this, Bayar.class);
        startActivity(intent);
    }

}
