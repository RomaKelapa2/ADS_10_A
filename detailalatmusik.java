package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class detailalatmusik extends AppCompatActivity {
    public void Makan(View view) {
        Intent intent = new Intent(detailalatmusik.this, katalog.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailalatmusik);
    }
}
