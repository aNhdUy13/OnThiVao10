package com.nda.onthivao10_dethi.history.outside_dethi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;

public class history_practice_topic extends AppCompatActivity {
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
        if (extras_1.containsKey("history_practice_Topic_1_3")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 1 - 3 )");
            practice_1_3();

        }

        in_practice_2 = getIntent();
        extras_2 = in_practice_2.getExtras();
        if (extras_2.containsKey("history_practice_Topic_4_6")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 4 - 6 )");
            practice_4_6();

        }

        in_practice_3 = getIntent();
        extras_3 = in_practice_3.getExtras();
        if (extras_3.containsKey("history_practice_Topic_7_9")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 7 - 9 )");
            practice_7_9();

        }

        in_practice_4 = getIntent();
        extras_4 = in_practice_4.getExtras();
        if (extras_4.containsKey("history_practice_Topic_10_12")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 10 - 12 )");
            practice_10_12();

        }

        in_practice_5 = getIntent();
        extras_5 = in_practice_5.getExtras();
        if (extras_5.containsKey("history_practice_Topic_13_15")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 13 - 15 )");
            practice_13_15();

        }

        in_practice_6 = getIntent();
        extras_6 = in_practice_6.getExtras();
        if (extras_6.containsKey("history_practice_Topic_16_18")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 16 - 18 )");
            practice_16_18();

        }

        in_practice_7 = getIntent();
        extras_7 = in_practice_7.getExtras();
        if (extras_7.containsKey("history_practice_Topic_19_20")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n( 19 - 20 )");
            practice_19_20();

        }

    }
    private void practice_19_20() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice19_20_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

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

    private void practice_16_18() {
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

        Bitmap bitmap_rs_33 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice16_18_tp33);
        imgMathResult_40_from_1_42_src33.setImageBitmap(bitmap_rs_33);

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
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

        Bitmap bitmap_rs_33 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice13_15_tp33);
        imgMathResult_40_from_1_42_src33.setImageBitmap(bitmap_rs_33);

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
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

        Bitmap bitmap_rs_33 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice10_12_tp33);
        imgMathResult_40_from_1_42_src33.setImageBitmap(bitmap_rs_33);

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
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

        Bitmap bitmap_rs_33 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice7_9_tp33);
        imgMathResult_40_from_1_42_src33.setImageBitmap(bitmap_rs_33);

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
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice4_6_tp32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

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
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.history_practice1_3_tp32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

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
