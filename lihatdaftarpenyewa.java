package com.example.windows8.sewaaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lihatdaftarpenyewa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatdaftarpenyewa);
    }

    public void image(View view){
        Intent intent = new Intent(lihatdaftarpenyewa.this, detailpenyewa.class);
        startActivity(intent);

    }
}
