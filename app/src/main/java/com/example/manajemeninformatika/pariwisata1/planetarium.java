package com.example.manajemeninformatika.pariwisata1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class planetarium extends AppCompatActivity {
    @BindView(R.id.btn_wisata) Button btn_wisata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetarium);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btn_wisata)
    public void btn_wisata(){
        Intent intent = new Intent(planetarium.this, kategori.class);
        startActivity(intent);
    }
}
