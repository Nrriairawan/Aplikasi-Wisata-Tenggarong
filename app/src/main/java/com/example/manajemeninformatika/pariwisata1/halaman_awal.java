package com.example.manajemeninformatika.pariwisata1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class halaman_awal extends AppCompatActivity {

    @BindView(R.id.btn_join) Button btn_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_join)
    public void btn_join(){
        Intent intent = new Intent(halaman_awal.this, halaman_utama.class);
        startActivity(intent);
    }
}
