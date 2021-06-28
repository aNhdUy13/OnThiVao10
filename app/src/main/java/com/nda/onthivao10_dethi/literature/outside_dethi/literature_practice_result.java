package com.nda.onthivao10_dethi.literature.outside_dethi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;

public class literature_practice_result extends AppCompatActivity {
    ImageView img_TC_src1,img_TC_src2,img_TC_src3,img_TC_src4,img_TC_src5,
            img_TC_src6,img_TC_src7,img_TC_src8,img_TC_src9,img_TC_src10,
            img_TC_src11,img_TC_src12,img_TC_src13,img_TC_src14,img_TC_src15,
            img_TC_src16,img_TC_src17,img_TC_src18,img_TC_src19,img_TC_src20, imgBack;
    TextView txtNaviTitle;
    Intent in_practice_1_3,in_practice_4_7,in_practice_8_11,in_practice_12_16,in_practice_17_20;
    Bundle extras_1_3,extras_4_7,extras_8_11,extras_12_16,extras_17_20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_topic_20);
        mapting();
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        in_practice_1_3 = getIntent();
        extras_1_3 = in_practice_1_3.getExtras();
        if (extras_1_3.containsKey("literature_practice_Result_1_3")) {
            txtNaviTitle.setText("(Đáp Án) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 1 - 3 )");
            practice_1_3();

        }

        in_practice_4_7 = getIntent();
        extras_4_7 = in_practice_4_7.getExtras();
        if (extras_4_7.containsKey("literature_practice_Result_4_7")) {
            txtNaviTitle.setText("(Đáp Án) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 4 - 7 )");
            practice_4_7();

        }

        in_practice_8_11 = getIntent();
        extras_8_11 = in_practice_8_11.getExtras();
        if (extras_8_11.containsKey("literature_practice_Result_8_11")) {
            txtNaviTitle.setText("(Đáp Án) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 8 - 11 )");
            practice_8_11();

        }

    }

    private void practice_8_11() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs9);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs12);
        img_TC_src11.setImageBitmap(bitmap_tc_12);

        Bitmap bitmap_tc_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs13);
        img_TC_src11.setImageBitmap(bitmap_tc_13);

        Bitmap bitmap_tc_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_rs14);
        img_TC_src11.setImageBitmap(bitmap_tc_14);

        img_TC_src15.setVisibility(View.GONE);

        img_TC_src16.setVisibility(View.GONE);

        img_TC_src17.setVisibility(View.GONE);

        img_TC_src18.setVisibility(View.GONE);

        img_TC_src19.setVisibility(View.GONE);

        img_TC_src20.setVisibility(View.GONE);
    }


    private void practice_4_7() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        img_TC_src9.setVisibility(View.GONE);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        Bitmap bitmap_tc_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs12);
        img_TC_src12.setImageBitmap(bitmap_tc_12);

        Bitmap bitmap_tc_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs13);
        img_TC_src13.setImageBitmap(bitmap_tc_13);

        Bitmap bitmap_tc_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs14);
        img_TC_src14.setImageBitmap(bitmap_tc_14);

        Bitmap bitmap_tc_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs15);
        img_TC_src15.setImageBitmap(bitmap_tc_15);

        Bitmap bitmap_tc_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs16);
        img_TC_src16.setImageBitmap(bitmap_tc_16);

        Bitmap bitmap_tc_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_rs17);
        img_TC_src17.setImageBitmap(bitmap_tc_17);

        img_TC_src18.setVisibility(View.GONE);

        img_TC_src19.setVisibility(View.GONE);

        img_TC_src20.setVisibility(View.GONE);
    }


    private void practice_1_3() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

        Bitmap bitmap_tc_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs7);
        img_TC_src7.setImageBitmap(bitmap_tc_7);

        Bitmap bitmap_tc_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs8);
        img_TC_src8.setImageBitmap(bitmap_tc_8);

        Bitmap bitmap_tc_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs9);
        img_TC_src9.setImageBitmap(bitmap_tc_9);

        Bitmap bitmap_tc_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs10);
        img_TC_src10.setImageBitmap(bitmap_tc_10);

        Bitmap bitmap_tc_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_1_3_rs11);
        img_TC_src11.setImageBitmap(bitmap_tc_11);

        img_TC_src12.setVisibility(View.GONE);

        img_TC_src13.setVisibility(View.GONE);

        img_TC_src14.setVisibility(View.GONE);

        img_TC_src15.setVisibility(View.GONE);

        img_TC_src16.setVisibility(View.GONE);

        img_TC_src17.setVisibility(View.GONE);

        img_TC_src18.setVisibility(View.GONE);

        img_TC_src19.setVisibility(View.GONE);

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
