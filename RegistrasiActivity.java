package com.example.healthcareservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrasiActivity extends AppCompatActivity {
private Button createAkun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        createAkun= (Button) findViewById(R.id.btnRegistrasi);
        createAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(register);
            }
        });
    }
}