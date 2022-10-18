package com.nda.onthivao10_dethi.math.outside_dethi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nda.onthivao10_dethi.R;
import com.nda.onthivao10_dethi.MainActivity;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class math_topic_40 extends AppCompatActivity {
    ImageView imgMathTC_40_from_1_20_src1, imgBack;
    TextView txtNaviTitle;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

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


        txtNaviTitle.setText("Bộ 40 Đề Được Bộ Chọn Lọc\n( 1 - 20 )");
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_1);
        imgMathTC_40_from_1_20_src1.setImageBitmap(bitmap_tc_1);

    }

    private void mapting()
    {
        imgBack         = (ImageView) findViewById(R.id.img_back);
        txtNaviTitle    = (TextView) findViewById(R.id.top_navi_title);
        imgMathTC_40_from_1_20_src1 = (ImageView) findViewById(R.id.math_tc_1);
    }
}
