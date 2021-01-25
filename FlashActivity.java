package com.example.healthcareservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlashActivity extends AppCompatActivity {
private Button gett;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        gett= (Button)findViewById(R.id.get);
        gett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten= new Intent(FlashActivity.this, DashboardActivity.class);
                startActivity(inten);
            }
        });
    }
}