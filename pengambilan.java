package com.example.aanfa.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pengambilan extends AppCompatActivity {
    public void kembali1(View view) {
        Intent intent = new Intent(pengambilan.this, detailkonfirmasipengambilan.class);
        startActivity(intent);
    }
    public void kembali2(View view) {
        Intent intent = new Intent(pengambilan.this, detailkonfirmasipengambilan.class);
        startActivity(intent);
    }
    public void kembali3(View view) {
        Intent intent = new Intent(pengambilan.this, detailkonfirmasipengambilan.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengambilan);
    }
}
