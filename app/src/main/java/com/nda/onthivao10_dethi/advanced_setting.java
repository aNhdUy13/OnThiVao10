package com.nda.onthivao10_dethi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class advanced_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_setting);
        back();
        purchaseAdBlock();
    }

    private void purchaseAdBlock() {
        CardView adblock    = (CardView) findViewById(R.id.adblock);
        Button btnAdBlock   = (Button) findViewById(R.id.btn_purchase_adBlock);
    }

    private void back() {
        ImageView imgBack = (ImageView) findViewById(R.id.img_back);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}