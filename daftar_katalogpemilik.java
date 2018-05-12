package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class daftar_katalogpemilik extends AppCompatActivity {
    public void gitarkatalog(View view) {
        Intent intent = new Intent(daftar_katalogpemilik.this, detailkatalog.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_katalogpemilik);
    }
}
