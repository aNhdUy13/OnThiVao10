package com.nda.onthivao10_dethi.math.outside_dethi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;

public class math_6_result_advance extends AppCompatActivity {
    ImageView img_RS_src1, img_RS_src2, img_RS_src3,img_RS_src4,
            img_RS_src5,img_RS_src6,img_RS_src7,img_RS_src8,
            img_RS_src9,img_RS_src10,img_RS_src11,img_RS_src12,
            img_RS_src13,img_RS_src14,img_RS_src15,img_RS_src16,
            img_RS_src17,img_RS_src18,img_RS_src19,img_RS_src20,
            img_RS_src21,img_RS_src22,img_RS_src23,img_RS_src24,
            img_RS_src25,img_RS_src26,img_RS_src27,img_RS_src28,
            img_RS_src29,img_RS_src30,img_RS_src31,img_RS_src32,
            img_RS_src33,img_RS_src34,img_RS_src35,img_RS_src36,
            img_RS_src37,img_RS_src38,img_RS_src39,img_RS_src40,
            img_RS_src41,img_RS_src42, imgBack;
    TextView txtNaviTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_result_42);
        mapting();
        /* Display result from topic 1 => 21 */
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        txtNaviTitle.setText("(Đáp Án) Bộ 6 Đề Chuyên Của Bộ Giáo Dục");
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_1);
        img_RS_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_2);
        img_RS_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_3);
        img_RS_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_4);
        img_RS_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_5);
        img_RS_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_6);
        img_RS_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_7);
        img_RS_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_8);
        img_RS_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_9);
        img_RS_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_10);
        img_RS_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_11);
        img_RS_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_12);
        img_RS_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_13);
        img_RS_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_14);
        img_RS_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_15);
        img_RS_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_16);
        img_RS_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_17);
        img_RS_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_chuyen_result_18);
        img_RS_src18.setImageBitmap(bitmap_rs_18);

        img_RS_src19.setVisibility(View.GONE);

        img_RS_src20.setVisibility(View.GONE);

        img_RS_src21.setVisibility(View.GONE);

        img_RS_src22.setVisibility(View.GONE);

        img_RS_src23.setVisibility(View.GONE);

        img_RS_src24.setVisibility(View.GONE);

        img_RS_src25.setVisibility(View.GONE);

        img_RS_src26.setVisibility(View.GONE);

        img_RS_src27.setVisibility(View.GONE);

        img_RS_src28.setVisibility(View.GONE);

        img_RS_src29.setVisibility(View.GONE);

        img_RS_src30.setVisibility(View.GONE);

        img_RS_src31.setVisibility(View.GONE);

        img_RS_src32.setVisibility(View.GONE);

        img_RS_src33.setVisibility(View.GONE);

        img_RS_src34.setVisibility(View.GONE);

        img_RS_src35.setVisibility(View.GONE);

        img_RS_src36.setVisibility(View.GONE);

        img_RS_src37.setVisibility(View.GONE);

        img_RS_src38.setVisibility(View.GONE);

        img_RS_src39.setVisibility(View.GONE);

        img_RS_src40.setVisibility(View.GONE);

        img_RS_src41.setVisibility(View.GONE);

        img_RS_src42.setVisibility(View.GONE);
    }
    private void mapting()
    {
        imgBack         = (ImageView) findViewById(R.id.img_back);
        txtNaviTitle    = (TextView) findViewById(R.id.top_navi_title);
        img_RS_src1 = (ImageView) findViewById(R.id.math_rs_1);
        img_RS_src2 = (ImageView) findViewById(R.id.math_rs_2);
        img_RS_src3 = (ImageView) findViewById(R.id.math_rs_3);
        img_RS_src4 = (ImageView) findViewById(R.id.math_rs_4);
        img_RS_src5 = (ImageView) findViewById(R.id.math_rs_5);
        img_RS_src6 = (ImageView) findViewById(R.id.math_rs_6);
        img_RS_src7 = (ImageView) findViewById(R.id.math_rs_7);
        img_RS_src8 = (ImageView) findViewById(R.id.math_rs_8);
        img_RS_src9 = (ImageView) findViewById(R.id.math_rs_9);
        img_RS_src10 = (ImageView) findViewById(R.id.math_rs_10);
        img_RS_src11 = (ImageView) findViewById(R.id.math_rs_11);
        img_RS_src12 = (ImageView) findViewById(R.id.math_rs_12);
        img_RS_src13 = (ImageView) findViewById(R.id.math_rs_13);
        img_RS_src14 = (ImageView) findViewById(R.id.math_rs_14);
        img_RS_src15 = (ImageView) findViewById(R.id.math_rs_15);
        img_RS_src16 = (ImageView) findViewById(R.id.math_rs_16);
        img_RS_src17 = (ImageView) findViewById(R.id.math_rs_17);
        img_RS_src18 = (ImageView) findViewById(R.id.math_rs_18);
        img_RS_src19 = (ImageView) findViewById(R.id.math_rs_19);
        img_RS_src20 = (ImageView) findViewById(R.id.math_rs_20);
        img_RS_src21 = (ImageView) findViewById(R.id.math_rs_21);
        img_RS_src22 = (ImageView) findViewById(R.id.math_rs_22);
        img_RS_src23 = (ImageView) findViewById(R.id.math_rs_23);
        img_RS_src24 = (ImageView) findViewById(R.id.math_rs_24);
        img_RS_src25 = (ImageView) findViewById(R.id.math_rs_25);
        img_RS_src26 = (ImageView) findViewById(R.id.math_rs_26);
        img_RS_src27 = (ImageView) findViewById(R.id.math_rs_27);
        img_RS_src28 = (ImageView) findViewById(R.id.math_rs_28);
        img_RS_src29 = (ImageView) findViewById(R.id.math_rs_29);
        img_RS_src30 = (ImageView) findViewById(R.id.math_rs_30);
        img_RS_src31 = (ImageView) findViewById(R.id.math_rs_31);
        img_RS_src32 = (ImageView) findViewById(R.id.math_rs_32);
        img_RS_src33 = (ImageView) findViewById(R.id.math_rs_33);
        img_RS_src34 = (ImageView) findViewById(R.id.math_rs_34);
        img_RS_src35 = (ImageView) findViewById(R.id.math_rs_35);
        img_RS_src36 = (ImageView) findViewById(R.id.math_rs_36);
        img_RS_src37 = (ImageView) findViewById(R.id.math_rs_37);
        img_RS_src38 = (ImageView) findViewById(R.id.math_rs_38);
        img_RS_src39 = (ImageView) findViewById(R.id.math_rs_39);
        img_RS_src40 = (ImageView) findViewById(R.id.math_rs_40);
        img_RS_src41 = (ImageView) findViewById(R.id.math_rs_41);
        img_RS_src42 = (ImageView) findViewById(R.id.math_rs_42);


    }
}
