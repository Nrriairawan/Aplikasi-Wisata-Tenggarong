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

<<<<<<< HEAD
    @BindView(R.id.btn_sejarah) EditText btn_sejarah;
    @BindView(R.id.btn_peta) EditText btn_peta;
    @BindView(R.id.btn_wisata) EditText btn_wisata;
=======
    @BindView(R.id.btn_sejarah) Button btn_sejarah;
    @BindView(R.id.btn_wisata) Button btn_wisata;
    @BindView(R.id.btn_peta) Button btn_peta;
>>>>>>> 5a0eca395692c7ce558bdec72969ed3ce1a12f78
    @BindView(R.id.imageViewmulawarman) ImageView imageViewmulawarman;
    @BindView(R.id.imageViewplanetarium) ImageView imageViewplanetarium;
    @BindView(R.id.imageViewpulaukumala) ImageView imageViewpulaukumala;
    @BindView(R.id.imageViewmuseumkayu) ImageView imageViewmuseumkayu;
    @BindView(R.id.imageViewwaduk) ImageView imageViewwaduk;
    @BindView(R.id.imageViewladaya) ImageView imageViewladaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.imageViewmulawarman)
    public void ImageViewmulawarman() {
        Intent intent = new Intent(kategori.this, mulawarman.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewplanetarium)
    public void ImageViewplanetarium() {
        Intent intent = new Intent(kategori.this, planetarium.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewpulaukumala)
    public void ImageViewpulaukumala() {
        Intent intent = new Intent(kategori.this, kumala.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewmuseumkayu)
    public void ImageViewmuseumkayu() {
        Intent intent = new Intent(kategori.this, museumkayu.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewwaduk)
    public void ImageViewwaduk() {
        Intent intent = new Intent(kategori.this, waduk.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewladaya)
    public void ImageViewladaya() {
        Intent intent = new Intent(kategori.this, ladayah.class);
        startActivity(intent);
    }
}
