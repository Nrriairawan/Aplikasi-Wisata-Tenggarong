package com.example.manajemeninformatika.pariwisata1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.OnClick;

public class kategori extends AppCompatActivity {

    @BindView(R.id.btn_sejarah) EditText btn_sejarah;
    @BindView(R.id.btn_peta) EditText btn_peta;
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
    }

    @OnClick(R.id.imageViewmulawarman)
    public void setImageViewmulawarman() {
        Intent intent = new Intent(kategori.this, mulawarman.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewplanetarium)
    public void setImageViewplanetarium() {
        Intent intent = new Intent(kategori.this, planetarium.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewpulaukumala)
    public void setImageViewpulaukumala() {
        Intent intent = new Intent(kategori.this, kumala.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewmuseumkayu)
    public void setImageViewmuseumkayu() {
        Intent intent = new Intent(kategori.this, museumkayu.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewwaduk)
    public void setImageViewwaduk() {
        Intent intent = new Intent(kategori.this, waduk.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageViewladaya)
    public void setImageViewladaya() {
        Intent intent = new Intent(kategori.this, ladayah.class);
        startActivity(intent);
    }
}
