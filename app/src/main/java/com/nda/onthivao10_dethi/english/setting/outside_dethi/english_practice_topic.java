package com.nda.onthivao10_dethi.english.setting.outside_dethi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;

public class english_practice_topic extends AppCompatActivity {
    ImageView img_TC_src1,img_TC_src2,img_TC_src3,img_TC_src4,img_TC_src5,
            img_TC_src6,img_TC_src7,img_TC_src8,img_TC_src9,img_TC_src10,
            img_TC_src11,img_TC_src12,img_TC_src13,img_TC_src14,img_TC_src15,
            img_TC_src16,img_TC_src17,img_TC_src18,img_TC_src19,img_TC_src20, imgBack;
    TextView txtNaviTitle;
    Intent in_practice_1,in_practice_2,in_practice_3,in_practice_4,in_practice_5;
    Bundle extras_1,extras_2,extras_3,extras_4,extras_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_slot_20);
        mapting();
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        in_practice_1 = getIntent();
        extras_1 = in_practice_1.getExtras();
        if (extras_1.containsKey("english_practice_Topic_1_5")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 1 - 5 )");
            practice_1_5();

        }

        in_practice_2 = getIntent();
        extras_2 = in_practice_2.getExtras();
        if (extras_2.containsKey("english_practice_Topic_6_10")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 6 - 10 )");
            practice_6_10();

        }

        in_practice_3 = getIntent();
        extras_3 = in_practice_3.getExtras();
        if (extras_3.containsKey("english_practice_Topic_11_15")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 11 - 15 )");
            practice_11_15();

        }


        in_practice_4 = getIntent();
        extras_4 = in_practice_4.getExtras();
        if (extras_4.containsKey("english_practice_Topic_16_19")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 16 - 19 )");
            practice_16_19();

        }

        in_practice_5 = getIntent();
        extras_5 = in_practice_5.getExtras();
        if (extras_5.containsKey("english_practice_Topic_20_22")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 20 - 22 )");
            practice_20_22();

        }



    }
    private void practice_20_22() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp15);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp16);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp17);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp18);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp19);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp20);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp21);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp22);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp23);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp24);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp25);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp26);
        img_TC_src12.setImageBitmap(bitmap_tc_12);

        img_TC_src13.setVisibility(View.GONE);
        img_TC_src14.setVisibility(View.GONE);


        img_TC_src15.setVisibility(View.GONE);
        img_TC_src16.setVisibility(View.GONE);
        img_TC_src17.setVisibility(View.GONE);
        img_TC_src18.setVisibility(View.GONE);
        img_TC_src19.setVisibility(View.GONE);


        img_TC_src20.setVisibility(View.GONE);

    }

    private void practice_16_19() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp9);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp12);
        img_TC_src12.setImageBitmap(bitmap_tc_12);

        Bitmap bitmap_tc_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp13);
        img_TC_src13.setImageBitmap(bitmap_tc_13);

        Bitmap bitmap_tc_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_20_tp14);
        img_TC_src14.setImageBitmap(bitmap_tc_14);

        img_TC_src15.setVisibility(View.GONE);
        img_TC_src16.setVisibility(View.GONE);
        img_TC_src17.setVisibility(View.GONE);
        img_TC_src18.setVisibility(View.GONE);
        img_TC_src19.setVisibility(View.GONE);


        img_TC_src20.setVisibility(View.GONE);

    }

    private void practice_11_15() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp9);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp12);
        img_TC_src12.setImageBitmap(bitmap_tc_12);

        Bitmap bitmap_tc_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp13);
        img_TC_src13.setImageBitmap(bitmap_tc_13);

        Bitmap bitmap_tc_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp14);
        img_TC_src14.setImageBitmap(bitmap_tc_14);

        Bitmap bitmap_tc_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp15);
        img_TC_src15.setImageBitmap(bitmap_tc_15);

        Bitmap bitmap_tc_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp16);
        img_TC_src16.setImageBitmap(bitmap_tc_16);

        Bitmap bitmap_tc_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp17);
        img_TC_src17.setImageBitmap(bitmap_tc_17);

        Bitmap bitmap_tc_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp18);
        img_TC_src18.setImageBitmap(bitmap_tc_18);

        Bitmap bitmap_tc_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_tp19);
        img_TC_src19.setImageBitmap(bitmap_tc_19);

        img_TC_src20.setVisibility(View.GONE);

    }

    private void practice_6_10() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp9);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp12);
        img_TC_src12.setImageBitmap(bitmap_tc_12);

        Bitmap bitmap_tc_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp13);
        img_TC_src13.setImageBitmap(bitmap_tc_13);

        Bitmap bitmap_tc_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp14);
        img_TC_src14.setImageBitmap(bitmap_tc_14);

        Bitmap bitmap_tc_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp15);
        img_TC_src15.setImageBitmap(bitmap_tc_15);

        Bitmap bitmap_tc_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp16);
        img_TC_src16.setImageBitmap(bitmap_tc_16);

        Bitmap bitmap_tc_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp17);
        img_TC_src17.setImageBitmap(bitmap_tc_17);

        Bitmap bitmap_tc_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp18);
        img_TC_src18.setImageBitmap(bitmap_tc_18);

        Bitmap bitmap_tc_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_tp19);
        img_TC_src19.setImageBitmap(bitmap_tc_19);

        img_TC_src20.setVisibility(View.GONE);

    }

    private void practice_1_5() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp9);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp12);
        img_TC_src12.setImageBitmap(bitmap_tc_12);

        Bitmap bitmap_tc_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp13);
        img_TC_src13.setImageBitmap(bitmap_tc_13);

        Bitmap bitmap_tc_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp14);
        img_TC_src14.setImageBitmap(bitmap_tc_14);

        Bitmap bitmap_tc_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp15);
        img_TC_src15.setImageBitmap(bitmap_tc_15);

        Bitmap bitmap_tc_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp16);
        img_TC_src16.setImageBitmap(bitmap_tc_16);

        Bitmap bitmap_tc_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp17);
        img_TC_src17.setImageBitmap(bitmap_tc_17);

        Bitmap bitmap_tc_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp18);
        img_TC_src18.setImageBitmap(bitmap_tc_18);

        Bitmap bitmap_tc_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_tp19);
        img_TC_src19.setImageBitmap(bitmap_tc_19);

        img_TC_src20.setVisibility(View.GONE);

    }

    private void mapting()
    {
        imgBack         = (ImageView) findViewById(R.id.img_back);
        txtNaviTitle    = (TextView) findViewById(R.id.top_navi_title);

        img_TC_src1 = (ImageView) findViewById(R.id.math_tc_1);

        img_TC_src2 = (ImageView) findViewById(R.id.math_tc_2);

        img_TC_src3 = (ImageView) findViewById(R.id.math_tc_3);
        img_TC_src4 = (ImageView) findViewById(R.id.math_tc_4);
        img_TC_src5 = (ImageView) findViewById(R.id.math_tc_5);
        img_TC_src6 = (ImageView) findViewById(R.id.math_tc_6);
        img_TC_src7 = (ImageView) findViewById(R.id.math_tc_7);
        img_TC_src8 = (ImageView) findViewById(R.id.math_tc_8);
        img_TC_src9 = (ImageView) findViewById(R.id.math_tc_9);
        img_TC_src10 = (ImageView) findViewById(R.id.math_tc_10);
        img_TC_src11 = (ImageView) findViewById(R.id.math_tc_11);
        img_TC_src12 = (ImageView) findViewById(R.id.math_tc_12);
        img_TC_src13 = (ImageView) findViewById(R.id.math_tc_13);
        img_TC_src14 = (ImageView) findViewById(R.id.math_tc_14);
        img_TC_src15 = (ImageView) findViewById(R.id.math_tc_15);
        img_TC_src16 = (ImageView) findViewById(R.id.math_tc_16);
        img_TC_src17 = (ImageView) findViewById(R.id.math_tc_17);
        img_TC_src18 = (ImageView) findViewById(R.id.math_tc_18);
        img_TC_src19 = (ImageView) findViewById(R.id.math_tc_19);
        img_TC_src20 = (ImageView) findViewById(R.id.math_tc_20);


    }
}
