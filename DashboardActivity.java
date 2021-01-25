package com.example.healthcareservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
public Button Apotek, Rumahsakit, Obat, Alatmedis, Penyakit, Konsultasi;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Apotek = (Button)findViewById(R.id.apotek);
        Rumahsakit= (Button)findViewById(R.id.rumahsakit);
        Obat = (Button)findViewById(R.id.obat);
        Alatmedis = (Button)findViewById(R.id.alatmedis);
        Penyakit = (Button)findViewById(R.id.penyakit);
        Konsultasi = (Button)findViewById(R.id.konsultasi);

        Apotek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apotek = new Intent(DashboardActivity.this, ApotekActivity.class);
                startActivity(apotek);
            }
        });

      Rumahsakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rumahsakit = new Intent(DashboardActivity.this, RumahsakitActivity.class);
                startActivity(rumahsakit);
            }
        });

      Obat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obat = new Intent(DashboardActivity.this, ObatActivity.class);
                startActivity(obat);
            }
        });

      Penyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent penyakit = new Intent(DashboardActivity.this, PenyakitActivity.class);
                startActivity(penyakit);
            }
        });
      Konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent konsultasi = new Intent(DashboardActivity.this,  KonsultasiActivity.class);
                startActivity(konsultasi);
            }
        });
    }
}