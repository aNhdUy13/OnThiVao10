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

public class english_practice_result extends AppCompatActivity {
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
        if (extras_1.containsKey("english_practice_Result_1_5")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 1 - 5 )");
            practice_1_5();

        }

        in_practice_2 = getIntent();
        extras_2 = in_practice_2.getExtras();
        if (extras_2.containsKey("english_practice_Result_6_10")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 6 - 10 )");
            practice_6_10();

        }

        in_practice_3 = getIntent();
        extras_3 = in_practice_3.getExtras();
        if (extras_3.containsKey("english_practice_Result_11_15")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 11 - 15 )");
            practice_11_15();

        }


        in_practice_4 = getIntent();
        extras_4 = in_practice_4.getExtras();
        if (extras_4.containsKey("english_practice_Result_16_19")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 16 - 19 )");
            practice_16_19();

        }

        in_practice_5 = getIntent();
        extras_5 = in_practice_5.getExtras();
        if (extras_5.containsKey("english_practice_Result_20_22")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc \n ( 20 - 22 )");
            practice_20_22();

        }



    }
    private void practice_20_22() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_22_rs3);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        img_TC_src2.setVisibility(View.GONE);


        img_TC_src3.setVisibility(View.GONE);


        img_TC_src4.setVisibility(View.GONE);


        img_TC_src5.setVisibility(View.GONE);


        img_TC_src6.setVisibility(View.GONE);

        img_TC_src7.setVisibility(View.GONE);

        img_TC_src8.setVisibility(View.GONE);

        img_TC_src9.setVisibility(View.GONE);

        img_TC_src10.setVisibility(View.GONE);

        img_TC_src11.setVisibility(View.GONE);

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

    private void practice_16_19() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_22_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice16_22_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_22);

        img_TC_src3.setVisibility(View.GONE);


        img_TC_src4.setVisibility(View.GONE);


        img_TC_src5.setVisibility(View.GONE);


        img_TC_src6.setVisibility(View.GONE);

        img_TC_src7.setVisibility(View.GONE);

        img_TC_src8.setVisibility(View.GONE);

        img_TC_src9.setVisibility(View.GONE);

        img_TC_src10.setVisibility(View.GONE);

        img_TC_src11.setVisibility(View.GONE);

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

    private void practice_11_15() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_22);

        Bitmap bitmap_tc_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice11_15_rs3);
        img_TC_src3.setImageBitmap(bitmap_tc_23);

        img_TC_src4.setVisibility(View.GONE);


        img_TC_src5.setVisibility(View.GONE);


        img_TC_src6.setVisibility(View.GONE);

        img_TC_src7.setVisibility(View.GONE);

        img_TC_src8.setVisibility(View.GONE);

        img_TC_src9.setVisibility(View.GONE);

        img_TC_src10.setVisibility(View.GONE);

        img_TC_src11.setVisibility(View.GONE);

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

    private void practice_6_10() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_22);

        Bitmap bitmap_tc_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice6_10_rs3);
        img_TC_src3.setImageBitmap(bitmap_tc_23);

        img_TC_src4.setVisibility(View.GONE);


        img_TC_src5.setVisibility(View.GONE);


        img_TC_src6.setVisibility(View.GONE);

        img_TC_src7.setVisibility(View.GONE);

        img_TC_src8.setVisibility(View.GONE);

        img_TC_src9.setVisibility(View.GONE);

        img_TC_src10.setVisibility(View.GONE);

        img_TC_src11.setVisibility(View.GONE);

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

    private void practice_1_5() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_rs1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_rs2);
        img_TC_src2.setImageBitmap(bitmap_tc_22);

        Bitmap bitmap_tc_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.english_practice1_5_rs3);
        img_TC_src3.setImageBitmap(bitmap_tc_23);

        img_TC_src4.setVisibility(View.GONE);


        img_TC_src5.setVisibility(View.GONE);


        img_TC_src6.setVisibility(View.GONE);

        img_TC_src7.setVisibility(View.GONE);

        img_TC_src8.setVisibility(View.GONE);

        img_TC_src9.setVisibility(View.GONE);

        img_TC_src10.setVisibility(View.GONE);

        img_TC_src11.setVisibility(View.GONE);

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
