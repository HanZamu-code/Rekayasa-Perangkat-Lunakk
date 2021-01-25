package com.example.healthcareservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RumahsakitActivity extends AppCompatActivity {
public Button rumahsakit;
    Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahsakit);

        rumahsakit=(Button)findViewById(R.id.RSakina);
        rumahsakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apotek = new Intent(RumahsakitActivity.this, ViewRSakinaActivity.class);
                startActivity(apotek);
            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.option, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch(item.getItemId()){
                case R.id.logout:
                    Intent toLogin = new Intent(RumahsakitActivity.this, LoginActivity.class);
                    startActivity(toLogin);
                case R.id.about:
                    startActivity(new Intent(RumahsakitActivity.this, AboutActivity.class));
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
    }