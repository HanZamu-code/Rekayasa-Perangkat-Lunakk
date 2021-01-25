package com.example.healthcareservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewRSakinaActivity extends AppCompatActivity {
    public Button Lokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_r_sakina);

        Lokasi = (Button) findViewById(R.id.lokasi);
        Lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lokasi = new Intent(ViewRSakinaActivity.this, MapsActivity.class);
                startActivity(lokasi);
            }
        });
    }
}