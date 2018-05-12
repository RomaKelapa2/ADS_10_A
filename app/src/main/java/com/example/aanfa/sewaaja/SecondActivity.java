package com.example.aanfa.sewaaja;



import android.content.Intent;
import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }

    public void Pelanggan(View view) {
        Intent intent = new Intent(SecondActivity.this, nav_penyewa.class);
                startActivity(intent);
    }

    public void Pemilik_alat(View view) {
        Intent intent = new Intent(SecondActivity.this, nav_pemilik.class);
        startActivity(intent);
    }



}