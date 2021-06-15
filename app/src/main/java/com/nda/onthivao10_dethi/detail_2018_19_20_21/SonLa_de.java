package com.nda.onthivao10_dethi.detail_2018_19_20_21;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nda.onthivao10_dethi.R;


public class SonLa_de extends AppCompatActivity {
    TextView txtMain_title;
    ImageView imgBack, img_src_1,img_src_2,img_src_3,img_src_4,img_src_5,img_src_6,img_src_7,img_src_8,
    img_src_9,img_src_10;
    CardView cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10;
    Intent in_1,in_2,in_3,in_4,in_5,in_6,in_7,in_8,in_9,in_10;
    Bundle extras1,extras2,extras3,extras4,extras5,extras6,extras7,extras8,extras9,extras10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_de_dapan_detail_10);
        mapting();
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        in_1 = getIntent();
        extras1 = in_1.getExtras();
        if (extras1.containsKey("sonla_math_detail_2018")) {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2018\n - Sơn La -");
            from_2018();
        }

        in_2 = getIntent();
        extras2 = in_2.getExtras();
        if (extras2.containsKey("sonla_math_detail_2019")) {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2019\n - Sơn La -");

            from_2019();
        }


    }

    private void from_2019() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_sonla_2019_tp1);
        img_src_1.setImageBitmap(bitmap);

        cv2.setVisibility(View.GONE);
        cv3.setVisibility(View.GONE);
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }

    private void from_2018()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_sonla_2018_tp1);
        img_src_1.setImageBitmap(bitmap);

        cv2.setVisibility(View.GONE);
        cv3.setVisibility(View.GONE);
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);

    }


    private void mapting()
    {
        txtMain_title = (TextView) findViewById(R.id.top_navi_title);
        imgBack       = (ImageView) findViewById(R.id.img_back);
        img_src_1     = (ImageView) findViewById(R.id.show_de_1);
        img_src_2     = (ImageView) findViewById(R.id.show_de_2);
        img_src_3     = (ImageView) findViewById(R.id.show_de_3);
        img_src_4     = (ImageView) findViewById(R.id.show_de_4);
        img_src_5     = (ImageView) findViewById(R.id.show_de_5);
        img_src_6     = (ImageView) findViewById(R.id.show_de_6);
        img_src_7     = (ImageView) findViewById(R.id.show_de_7);
        img_src_8     = (ImageView) findViewById(R.id.show_de_8);
        img_src_9     = (ImageView) findViewById(R.id.show_de_9);
        img_src_10     = (ImageView) findViewById(R.id.show_de_10);

        cv2           = (CardView) findViewById(R.id.card_2);
        cv3           = (CardView) findViewById(R.id.card_3);
        cv4           = (CardView) findViewById(R.id.card_4);
        cv5           = (CardView) findViewById(R.id.card_5);
        cv6           = (CardView) findViewById(R.id.card_6);
        cv7           = (CardView) findViewById(R.id.card_7);
        cv8           = (CardView) findViewById(R.id.card_8);
        cv9           = (CardView) findViewById(R.id.card_9);
        cv10           = (CardView) findViewById(R.id.card_10);



    }
}
