package com.example.manajemeninformatika.pariwisata1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class kategori extends AppCompatActivity {


    @BindView(R.id.btn_sejarah) Button btn_sejarah;
    @BindView(R.id.btn_peta) Button btn_peta;
    @BindView(R.id.btn_wisata) Button btn_wisata;
    @BindView(R.id.btn_mulawarman) Button btn_mulawarman;
    @BindView(R.id.btn_planetarium) Button btn_planetarium;
    @BindView(R.id.btn_ladaya) Button btn_ladaya;
    @BindView(R.id.btn_kayu) Button btn_kayu;
    @BindView(R.id.btn_waduk) Button btn_waduk;
    @BindView(R.id.btn_kumala) Button btn_kumala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_sejarah)
    public void btn_sejarah(){
        Intent intent = new Intent(kategori.this, halaman_utama.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_mulawarman)
    public void btn_mulawarman(){
        Intent intent = new Intent(kategori.this, mulawarman.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_planetarium)
    public void btn_planetarium(){
        Intent intent = new Intent(kategori.this, planetarium.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_ladaya)
    public void btn_ladaya(){
        Intent intent = new Intent(kategori.this, ladayah.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_kayu)
    public void btn_kayu(){
        Intent intent = new Intent(kategori.this, museumkayu.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_waduk)
    public void btn_waduk(){
        Intent intent = new Intent(kategori.this, waduk.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_kumala)
    public void btn_kumala(){
        Intent intent = new Intent(kategori.this, kumala.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_peta)
    public void btn_peta(){
        Intent intent = new Intent(kategori.this,MapsActivity2.class);
        startActivity(intent);
    }
}
