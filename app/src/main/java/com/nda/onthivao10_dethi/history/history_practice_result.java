package com.nda.onthivao10_dethi.history;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;

public class history_practice_result extends AppCompatActivity {
    ImageView imgMathResult_40_from_1_42_src1, imgMathResult_40_from_1_42_src2, imgMathResult_40_from_1_42_src3,imgMathResult_40_from_1_42_src4,
            imgMathResult_40_from_1_42_src5,imgMathResult_40_from_1_42_src6,imgMathResult_40_from_1_42_src7,imgMathResult_40_from_1_42_src8,
            imgMathResult_40_from_1_42_src9,imgMathResult_40_from_1_42_src10,imgMathResult_40_from_1_42_src11,imgMathResult_40_from_1_42_src12,
            imgMathResult_40_from_1_42_src13,imgMathResult_40_from_1_42_src14,imgMathResult_40_from_1_42_src15,imgMathResult_40_from_1_42_src16,
            imgMathResult_40_from_1_42_src17,imgMathResult_40_from_1_42_src18,imgMathResult_40_from_1_42_src19,imgMathResult_40_from_1_42_src20,
            imgMathResult_40_from_1_42_src21,imgMathResult_40_from_1_42_src22,imgMathResult_40_from_1_42_src23,imgMathResult_40_from_1_42_src24,
            imgMathResult_40_from_1_42_src25,imgMathResult_40_from_1_42_src26,imgMathResult_40_from_1_42_src27,imgMathResult_40_from_1_42_src28,
            imgMathResult_40_from_1_42_src29,imgMathResult_40_from_1_42_src30,imgMathResult_40_from_1_42_src31,imgMathResult_40_from_1_42_src32,
            imgMathResult_40_from_1_42_src33,imgMathResult_40_from_1_42_src34,imgMathResult_40_from_1_42_src35,imgMathResult_40_from_1_42_src36,
            imgMathResult_40_from_1_42_src37,imgMathResult_40_from_1_42_src38,imgMathResult_40_from_1_42_src39,imgMathResult_40_from_1_42_src40,
            imgMathResult_40_from_1_42_src41,imgMathResult_40_from_1_42_src42, imgBack;
    TextView txtNaviTitle;

    Intent in_practice_1,in_practice_2,in_practice_3,in_practice_4,in_practice_5,in_practice_6,in_practice_7;
    Bundle extras_1,extras_2,extras_3,extras_4,extras_5,extras_6,extras_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_slot_42);
        mapting();
        /* Display result from topic 1 => 21 */
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        in_practice_1 = getIntent();
        extras_1 = in_practice_1.getExtras();
        if (extras_1.containsKey("history_practice_Result_1_3")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 1 - 3 )");
            practice_1_3();

        }
        in_practice_2 = getIntent();
        extras_2 = in_practice_2.getExtras();
        if (extras_2.containsKey("history_practice_Result_4_6")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 4 - 6 )");
            practice_4_6();

        }

        in_practice_3 = getIntent();
        extras_3 = in_practice_3.getExtras();
        if (extras_3.containsKey("history_practice_Result_7_9")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 7 - 9 )");
            practice_7_9();

        }

        in_practice_4 = getIntent();
        extras_4 = in_practice_4.getExtras();
        if (extras_4.containsKey("history_practice_Result_10_12")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 10 - 12 )");
            practice_10_12();

        }

        in_practice_5 = getIntent();
        extras_5 = in_practice_5.getExtras();
        if (extras_5.containsKey("history_practice_Result_13_15")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 13 - 15 )");
            practice_13_15();

        }
        in_practice_6 = getIntent();
        extras_6 = in_practice_6.getExtras();
        if (extras_6.containsKey("history_practice_Result_16_18")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 16 - 18 )");
            practice_13_15();

        }

        in_practice_7 = getIntent();
        extras_7 = in_practice_7.getExtras();
        if (extras_7.containsKey("history_practice_Result_19_20")) {
            txtNaviTitle.setText("( Đáp Án ) Bộ 20 Đề Được Bộ Chọn Lọc\n( 19 - 20 )");
            practice_19_20();

        }
    }
    private void practice_19_20() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_rs1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        imgMathResult_40_from_1_42_src2.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src3.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src4.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src5.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src6.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src7.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src8.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src9.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src10.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src11.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src12.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src13.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src14.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src15.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src16.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src17.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src18.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src19.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src20.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src21.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src22.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src23.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src24.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src25.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src26.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src27.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src28.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src29.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src30.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src31.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src32.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src33.setVisibility(View.GONE);

        imgMathResult_40_from_1_42_src34.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src35.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src36.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src37.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src38.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src39.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src40.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src41.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src42.setVisibility(View.GONE);
    }

    private void practice_13_15() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_rs1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_rs2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        imgMathResult_40_from_1_42_src3.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src4.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src5.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src6.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src7.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src8.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src9.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src10.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src11.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src12.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src13.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src14.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src15.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src16.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src17.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src18.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src19.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src20.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src21.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src22.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src23.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src24.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src25.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src26.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src27.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src28.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src29.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src30.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src31.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src32.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src33.setVisibility(View.GONE);

        imgMathResult_40_from_1_42_src34.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src35.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src36.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src37.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src38.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src39.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src40.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src41.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src42.setVisibility(View.GONE);
    }

    private void practice_10_12() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_rs1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_rs2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        imgMathResult_40_from_1_42_src3.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src4.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src5.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src6.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src7.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src8.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src9.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src10.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src11.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src12.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src13.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src14.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src15.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src16.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src17.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src18.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src19.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src20.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src21.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src22.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src23.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src24.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src25.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src26.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src27.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src28.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src29.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src30.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src31.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src32.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src33.setVisibility(View.GONE);

        imgMathResult_40_from_1_42_src34.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src35.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src36.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src37.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src38.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src39.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src40.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src41.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src42.setVisibility(View.GONE);
    }

    private void practice_7_9() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_rs1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_rs2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        imgMathResult_40_from_1_42_src3.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src4.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src5.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src6.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src7.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src8.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src9.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src10.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src11.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src12.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src13.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src14.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src15.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src16.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src17.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src18.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src19.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src20.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src21.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src22.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src23.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src24.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src25.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src26.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src27.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src28.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src29.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src30.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src31.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src32.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src33.setVisibility(View.GONE);

        imgMathResult_40_from_1_42_src34.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src35.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src36.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src37.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src38.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src39.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src40.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src41.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src42.setVisibility(View.GONE);
    }

    private void practice_4_6() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_rs1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_rs2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        imgMathResult_40_from_1_42_src3.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src4.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src5.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src6.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src7.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src8.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src9.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src10.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src11.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src12.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src13.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src14.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src15.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src16.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src17.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src18.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src19.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src20.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src21.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src22.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src23.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src24.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src25.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src26.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src27.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src28.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src29.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src30.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src31.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src32.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src33.setVisibility(View.GONE);

        imgMathResult_40_from_1_42_src34.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src35.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src36.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src37.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src38.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src39.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src40.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src41.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src42.setVisibility(View.GONE);
    }

    private void practice_1_3() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_rs1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_rs2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        imgMathResult_40_from_1_42_src3.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src4.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src5.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src6.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src7.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src8.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src9.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src10.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src11.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src12.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src13.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src14.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src15.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src16.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src17.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src18.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src19.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src20.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src21.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src22.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src23.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src24.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src25.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src26.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src27.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src28.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src29.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src30.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src31.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src32.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src33.setVisibility(View.GONE);

        imgMathResult_40_from_1_42_src34.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src35.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src36.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src37.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src38.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src39.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src40.setVisibility(View.GONE);
        imgMathResult_40_from_1_42_src41.setVisibility(View.GONE);


        imgMathResult_40_from_1_42_src42.setVisibility(View.GONE);
    }

    private void mapting()
    {
        imgBack         = (ImageView) findViewById(R.id.img_back);
        txtNaviTitle    = (TextView) findViewById(R.id.top_navi_title);
        imgMathResult_40_from_1_42_src1 = (ImageView) findViewById(R.id.math_rs_1);
        imgMathResult_40_from_1_42_src2 = (ImageView) findViewById(R.id.math_rs_2);
        imgMathResult_40_from_1_42_src3 = (ImageView) findViewById(R.id.math_rs_3);
        imgMathResult_40_from_1_42_src4 = (ImageView) findViewById(R.id.math_rs_4);
        imgMathResult_40_from_1_42_src5 = (ImageView) findViewById(R.id.math_rs_5);
        imgMathResult_40_from_1_42_src6 = (ImageView) findViewById(R.id.math_rs_6);
        imgMathResult_40_from_1_42_src7 = (ImageView) findViewById(R.id.math_rs_7);
        imgMathResult_40_from_1_42_src8 = (ImageView) findViewById(R.id.math_rs_8);
        imgMathResult_40_from_1_42_src9 = (ImageView) findViewById(R.id.math_rs_9);
        imgMathResult_40_from_1_42_src10 = (ImageView) findViewById(R.id.math_rs_10);
        imgMathResult_40_from_1_42_src11 = (ImageView) findViewById(R.id.math_rs_11);
        imgMathResult_40_from_1_42_src12 = (ImageView) findViewById(R.id.math_rs_12);
        imgMathResult_40_from_1_42_src13 = (ImageView) findViewById(R.id.math_rs_13);
        imgMathResult_40_from_1_42_src14 = (ImageView) findViewById(R.id.math_rs_14);
        imgMathResult_40_from_1_42_src15 = (ImageView) findViewById(R.id.math_rs_15);
        imgMathResult_40_from_1_42_src16 = (ImageView) findViewById(R.id.math_rs_16);
        imgMathResult_40_from_1_42_src17 = (ImageView) findViewById(R.id.math_rs_17);
        imgMathResult_40_from_1_42_src18 = (ImageView) findViewById(R.id.math_rs_18);
        imgMathResult_40_from_1_42_src19 = (ImageView) findViewById(R.id.math_rs_19);
        imgMathResult_40_from_1_42_src20 = (ImageView) findViewById(R.id.math_rs_20);
        imgMathResult_40_from_1_42_src21 = (ImageView) findViewById(R.id.math_rs_21);
        imgMathResult_40_from_1_42_src22 = (ImageView) findViewById(R.id.math_rs_22);
        imgMathResult_40_from_1_42_src23 = (ImageView) findViewById(R.id.math_rs_23);
        imgMathResult_40_from_1_42_src24 = (ImageView) findViewById(R.id.math_rs_24);
        imgMathResult_40_from_1_42_src25 = (ImageView) findViewById(R.id.math_rs_25);
        imgMathResult_40_from_1_42_src26 = (ImageView) findViewById(R.id.math_rs_26);
        imgMathResult_40_from_1_42_src27 = (ImageView) findViewById(R.id.math_rs_27);
        imgMathResult_40_from_1_42_src28 = (ImageView) findViewById(R.id.math_rs_28);
        imgMathResult_40_from_1_42_src29 = (ImageView) findViewById(R.id.math_rs_29);
        imgMathResult_40_from_1_42_src30 = (ImageView) findViewById(R.id.math_rs_30);
        imgMathResult_40_from_1_42_src31 = (ImageView) findViewById(R.id.math_rs_31);
        imgMathResult_40_from_1_42_src32 = (ImageView) findViewById(R.id.math_rs_32);
        imgMathResult_40_from_1_42_src33 = (ImageView) findViewById(R.id.math_rs_33);
        imgMathResult_40_from_1_42_src34 = (ImageView) findViewById(R.id.math_rs_34);
        imgMathResult_40_from_1_42_src35 = (ImageView) findViewById(R.id.math_rs_35);
        imgMathResult_40_from_1_42_src36 = (ImageView) findViewById(R.id.math_rs_36);
        imgMathResult_40_from_1_42_src37 = (ImageView) findViewById(R.id.math_rs_37);
        imgMathResult_40_from_1_42_src38 = (ImageView) findViewById(R.id.math_rs_38);
        imgMathResult_40_from_1_42_src39 = (ImageView) findViewById(R.id.math_rs_39);
        imgMathResult_40_from_1_42_src40 = (ImageView) findViewById(R.id.math_rs_40);
        imgMathResult_40_from_1_42_src41 = (ImageView) findViewById(R.id.math_rs_41);
        imgMathResult_40_from_1_42_src42 = (ImageView) findViewById(R.id.math_rs_42);


    }
}
