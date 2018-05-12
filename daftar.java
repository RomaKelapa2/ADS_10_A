package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class daftar extends AppCompatActivity {
private Spinner spiner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }

    public void loginMasuk(View view) {
        Intent intent = new Intent(daftar.this, MainActivity.class);
        startActivity(intent);
    }

    public void Alreadyaccount(View view) {
        Intent intent = new Intent(daftar.this, MainActivity.class);
        startActivity(intent);
    }
}
