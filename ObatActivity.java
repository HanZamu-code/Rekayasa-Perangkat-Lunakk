package com.example.healthcareservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ObatActivity extends AppCompatActivity {
    public Button obat;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat);

       obat = (Button)findViewById(R.id.antangin);
        obat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obat = new Intent(ObatActivity.this, ViewObatActivity.class);
                startActivity(obat);
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
                Intent toLogin = new Intent(ObatActivity.this, LoginActivity.class);
                startActivity(toLogin);
            case R.id.about:
                startActivity(new Intent(ObatActivity.this, AboutActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}