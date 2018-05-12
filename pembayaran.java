package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pembayaran extends AppCompatActivity {
    public void konfirmasi3(View view) {
        Intent intent = new Intent(pembayaran.this, detailkonfirmasipembayaran.class);
        startActivity(intent);
    }
    public void konfirmasi1(View view) {
        Intent intent = new Intent(pembayaran.this, detailkonfirmasipembayaran.class);
        startActivity(intent);
    }
    public void konfirmasi2(View view) {
        Intent intent = new Intent(pembayaran.this, detailkonfirmasipembayaran.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);
    }
}
