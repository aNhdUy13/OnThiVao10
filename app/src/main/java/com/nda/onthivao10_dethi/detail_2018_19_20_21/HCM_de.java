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
import com.startapp.sdk.adsbase.StartAppAd;

public class HCM_de extends AppCompatActivity {
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
                StartAppAd.showAd(getApplicationContext());

            }
        });
        in_2018 = getIntent();
        extras_2018 = in_2018.getExtras();
        if (extras_2018.containsKey("HCM_math_detail_2018")) {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2018\n - HCM -");
            from2018();

        }

        in_2019 = getIntent();
        extras_2019 = in_2019.getExtras();
        if (extras_2019.containsKey("HCM_math_detail_2019")) {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2019\n - HCM -");
            from2019();

        }

        in_2020 = getIntent();
        extras_2020 = in_2020.getExtras();
        if (extras_2020.containsKey("HCM_math_detail_2020")) {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2020\n - HCM -");
            from2020();

        }

        in_2021 = getIntent();
        extras_2021 = in_2021.getExtras();
        if (extras_2021.containsKey("HCM_math_detail_2021")) {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2021\n - HCM -");
            //from2021(); Chưa Có Đề

        }

        /* ================= English =================== */
        english_in_2018 = getIntent();
        english_extras_2018 = english_in_2018.getExtras();
        if (english_extras_2018.containsKey("hcm_english_2018_topic")) {
            txtMain_title.setText("Đề Thi Tiếng Anh Vào 10 Năm 2018\n - HCM -");
            english_from2018();

        }

        english_in_2019 = getIntent();
        english_extras_2019 = english_in_2019.getExtras();
        if (english_extras_2019.containsKey("hcm_english_2019_topic")) {
            txtMain_title.setText("Đề Thi Tiếng Anh Vào 10 Năm 2019\n - HCM -");
            english_from2019();

        }

        english_in_2020 = getIntent();
        english_extras_2020 = english_in_2020.getExtras();
        if (english_extras_2020.containsKey("hcm_english_2020_topic")) {
            txtMain_title.setText("Đề Thi Tiếng Anh Vào 10 Năm 2020\n - HCM -");
            english_from2020();

        }

        english_in_2021 = getIntent();
        english_extras_2021 = english_in_2021.getExtras();
        if (english_extras_2021.containsKey("hcm_english_2021_topic")) {
            txtMain_title.setText("Đề Thi Tiếng Anh Vào 10 Năm 2021\n - HCM -");
            english_from2021();

        }
        /* ================= English =================== */


        /* ================= Literature =================== */
        Intent literature_in_2018 = getIntent();
        Bundle literature_extras_2018 = literature_in_2018.getExtras();
        if (literature_extras_2018.containsKey("HCM_literature_detail_2018")) {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2018\n - HCM -");
            literature_from2018();

        }

        Intent literature_in_2019 = getIntent();
        Bundle literature_extras_2019 = literature_in_2019.getExtras();
        if (literature_extras_2019.containsKey("HCM_literature_detail_2019")) {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2019\n - HCM -");
            literature_from2019();

        }

        Intent literature_in_2020 = getIntent();
        Bundle literature_extras_2020 = literature_in_2020.getExtras();
        if (literature_extras_2020.containsKey("HCM_literature_detail_2020")) {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2020\n - HCM -");
            literature_from2020();

        }

        Intent literature_in_2021 = getIntent();
        Bundle literature_extras_2021 = literature_in_2021.getExtras();
        if (literature_extras_2021.containsKey("HCM_literature_detail_2021")) {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2021\n - HCM -");
            //literature_from2021(); Chưa có

        }
        /* ================= Literature =================== */

    }
    private void literature_from2021() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_2020_hcm_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_2020_hcm_tp2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_2020_hcm_tp3);
        img_src_3.setImageBitmap(bitmap3);


        cv4.setVisibility(View.GONE);


        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }

    private void literature_from2020() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_2020_hcm_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_2020_hcm_tp2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_2020_hcm_tp3);
        img_src_3.setImageBitmap(bitmap3);


        cv4.setVisibility(View.GONE);


        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }

    private void literature_from2019() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_hcm_2019_tp1);
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

    private void literature_from2018() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_hcm_2018_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.literature_hcm_2018_tp2);
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

    private void english_from2021()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp3);
        img_src_3.setImageBitmap(bitmap3);

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp4);
        img_src_4.setImageBitmap(bitmap4);

        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp5);
        img_src_5.setImageBitmap(bitmap5);

        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp6);
        img_src_6.setImageBitmap(bitmap6);

        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp7);
        img_src_7.setImageBitmap(bitmap7);

        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2021_tp8);
        img_src_8.setImageBitmap(bitmap8);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }
    private void english_from2020()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2020_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2020_tp2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2020_tp3);
        img_src_3.setImageBitmap(bitmap3);

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_hcm_2020_tp4);
        img_src_4.setImageBitmap(bitmap4);

        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }

    private void english_from2019()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2019_hcm_tprs1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2019_hcm_tprs2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2019_hcm_tprs3);
        img_src_3.setImageBitmap(bitmap3);

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
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2018_hcm_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2018_hcm_tp2);
        img_src_2.setImageBitmap(bitmap2);

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2018_hcm_tp3);
        img_src_3.setImageBitmap(bitmap3);

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_2018_hcm_tp4);
        img_src_4.setImageBitmap(bitmap4);

        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
    }

    /*=======================  Math  =======================*/
//    private void from2021()
//    {
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2021_tp1);
//        img_src_1.setImageBitmap(bitmap);
//
//        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2021_tp2);
//        img_src_2.setImageBitmap(bitmap2);
//
//        cv3.setVisibility(View.GONE);
//        cv4.setVisibility(View.GONE);
//        cv5.setVisibility(View.GONE);
//        cv6.setVisibility(View.GONE);
//        cv7.setVisibility(View.GONE);
//        cv8.setVisibility(View.GONE);
//        cv9.setVisibility(View.GONE);
//        cv10.setVisibility(View.GONE);
//    }
    private void from2020()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2020_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2020_tp2);
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
    private void from2019()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2019_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2019_tp2);
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
    private void from2018()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2018_tp1);
        img_src_1.setImageBitmap(bitmap);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_hcm_2018_tp2);
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
