package com.nda.onthivao10_dethi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapting();
    }
    private void mapting()
    {
        Button btnMath, btnVan, btnAnh , btnLichSu;
        btnMath     = (Button) findViewById(R.id.math);
        btnVan      = (Button) findViewById(R.id.literature);
        btnAnh      = (Button) findViewById(R.id.english);
        btnLichSu   = (Button) findViewById(R.id.history);
        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_math",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        btnAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_english",true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        btnVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_literature",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        btnLichSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_history",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
    }
}