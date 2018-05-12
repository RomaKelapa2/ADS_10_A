package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class katalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
    }
    public void Makanalat(View view) {
        Intent intent = new Intent(katalog.this, detailalatmusik.class);
        startActivity(intent);
    }
    public void icon1(View view) {
    }
}
