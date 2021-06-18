package com.nda.onthivao10_dethi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class advanced_setting extends AppCompatActivity {
    Button btnAdBlock_1M,btnAdBlock_3M,btnAdBlock_7M;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_setting);
        back();
        DetailPurchaseAdBlock();
    }



    private void dialogMenuAdblock() {
        Dialog dialog_adblock = new Dialog(advanced_setting.this);
        dialog_adblock.setContentView(R.layout.custom_premium);
        dialog_adblock.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btnAdBlock_1M = (Button) dialog_adblock.findViewById(R.id.btn_purchase_adBlock_1_month);
        btnAdBlock_3M = (Button) dialog_adblock.findViewById(R.id.btn_purchase_adBlock_3_month);
        btnAdBlock_7M = (Button) dialog_adblock.findViewById(R.id.btn_purchase_adBlock_7_month);

        dialog_adblock.show();

    }

    private void DetailPurchaseAdBlock() {
        Button btnAdBlock_detail   = (Button) findViewById(R.id.btn_Detail_purchase_adBlock);
        btnAdBlock_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogMenuAdblock();
            }
        });
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