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

public class HCM_dapan extends AppCompatActivity {
    TextView txtMain_title;
    ImageView imgBack, img_src_1,img_src_2,img_src_3,img_src_4,img_src_5,img_src_6,img_src_7,img_src_8,
            img_src_9,img_src_10;
    CardView cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10;
    Bundle extras_2018,extras_2019,extras_2020,extras_2021,english_extras_2018,english_extras_2019,english_extras_2020,english_extras_2021;
    Intent in_2018,in_2019,in_2020,in_2021,english_in_2018,english_in_2019,english_in_2020,english_in_2021;
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

        in_2018 = getIntent();
        extras_2018 = in_2018.getExtras();
        if (extras_2018.containsKey("HCM_RSmath_detail_2018")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2018\n - HCM -");
            from2018();

        }

        in_2019 = getIntent();
        extras_2019 = in_2019.getExtras();
        if (extras_2019.containsKey("HCM_RSmath_detail_2019")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2019\n - HCM -");
            from2019();

        }

        in_2020 = getIntent();
        extras_2020 = in_2020.getExtras();
        if (extras_2020.containsKey("HCM_RSmath_detail_2020")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2020\n - HCM -");
            from2020();

        }

        in_2021 = getIntent();
        extras_2021 = in_2021.getExtras();
        if (extras_2021.containsKey("HCM_math_detail_2021")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2021\n - HCM -");
            //from2021(); Chưa Có Đáp Án

        }
        /* ================= English =================== */
        english_in_2018 = getIntent();
        english_extras_2018 = english_in_2018.getExtras();
        if (english_extras_2018.containsKey("hcm_english_2018_result")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Tiếng Anh Vào 10 Năm 2018\n - HCM -");
            english_from2018();

        }


        english_in_2020 = getIntent();
        english_extras_2020 = english_in_2020.getExtras();
        if (english_extras_2020.containsKey("hcm_english_2020_result")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Tiếng Anh Vào 10 Năm 2020\n - HCM -");
            english_from2020();

        }

        english_in_2021 = getIntent();
        english_extras_2021 = english_in_2021.getExtras();
        if (english_extras_2021.containsKey("hcm_english_2021_result")) {
            txtMain_title.setText("(Đáp Án) Đề Thi Tiếng Anh Vào 10 Năm 2021\n - HCM -");
            english_from2021();

        }
        /* ================= English =================== */

    }
    private void english_from2021()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_rs1);
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
    private void english_from2020()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2020_rs1);
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

    private void english_from2018()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2018_hcm_rs1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2018_hcm_rs1);
        img_src_2.setImageBitmap(bitmap2);

        cv3.setVisibility(View.GONE);
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }

    private void from2020()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2020_rs1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2020_rs2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2020_rs3);
        img_src_3.setImageBitmap(bitmap3);

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2020_rs4);
        img_src_4.setImageBitmap(bitmap4);


        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }
    private void from2019()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2019_rs1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2019_rs2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2019_rs3);
        img_src_3.setImageBitmap(bitmap3);

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2019_rs4);
        img_src_4.setImageBitmap(bitmap4);


        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }
    private void from2018()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2018_rs1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2018_rs2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2018_rs3);
        img_src_3.setImageBitmap(bitmap3);

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2018_rs4);
        img_src_4.setImageBitmap(bitmap4);


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
