package com.example.manajemeninformatika.pariwisata1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class halaman_utama extends AppCompatActivity {

    @BindView(R.id.btn_wisata) Button btn_wisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_wisata)
    public void btn_wisata(){
        Intent intent = new Intent(halaman_utama.this, kategori.class);
        startActivity(intent);
    }
}
