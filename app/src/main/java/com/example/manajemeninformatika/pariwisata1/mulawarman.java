package com.example.manajemeninformatika.pariwisata1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class mulawarman extends AppCompatActivity {
    @BindView(R.id.btn_wisata)
    EditText btn_wisata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumala);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btn_wisata)
    public void btn_wisata(){
        Intent intent = new Intent(mulawarman.this, kategori.class);
        startActivity(intent);
    }
}
