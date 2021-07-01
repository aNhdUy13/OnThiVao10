package com.nda.onthivao10_dethi.literature.outside_dethi;

import android.content.Intent;
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
import com.startapp.sdk.adsbase.StartAppAd;
import com.nda.onthivao10_dethi.AdapterWithNativeAd;
import com.nda.onthivao10_dethi.BuildConfig;
import com.nda.onthivao10_dethi.MainActivity;
import com.nda.onthivao10_dethi.R;
import com.startapp.sdk.adsbase.StartAppAd;
import com.nda.onthivao10_dethi.billing.advanced_setting;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class literature_practice_topic extends AppCompatActivity {
    ImageView img_TC_src1,img_TC_src2,img_TC_src3,img_TC_src4,img_TC_src5,
            img_TC_src6,img_TC_src7,img_TC_src8,img_TC_src9,img_TC_src10,
            img_TC_src11,img_TC_src12,img_TC_src13,img_TC_src14,img_TC_src15,
            img_TC_src16,img_TC_src17,img_TC_src18,img_TC_src19,img_TC_src20, imgBack;
    TextView txtNaviTitle;
    Intent in_practice_1_3,in_practice_4_7,in_practice_8_11,in_practice_12_14,in_practice_15_16,in_practice_17_20;
    Bundle extras_1_3,extras_4_7,extras_8_11,extras_12_14,extras_15_16,extras_17_20;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Nullable
    protected AdapterWithNativeAd adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_slot_20);
        mapting();
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                StartAppAd.showAd(getApplicationContext());

            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter = new AdapterWithNativeAd(this));

        loadData();
        loadNativeAd();

        in_practice_1_3 = getIntent();
        extras_1_3 = in_practice_1_3.getExtras();
        if (extras_1_3.containsKey("literature_practice_Topic_1_3")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 1 - 3 )");
            practice_1_3();

        }

        in_practice_4_7 = getIntent();
        extras_4_7 = in_practice_4_7.getExtras();
        if (extras_4_7.containsKey("literature_practice_Topic_4_7")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 4 - 7 )");
            practice_4_7();

        }

        in_practice_8_11 = getIntent();
        extras_8_11 = in_practice_8_11.getExtras();
        if (extras_8_11.containsKey("literature_practice_Topic_8_11")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 8 - 11 )");
            practice_8_11();

        }


        in_practice_12_14 = getIntent();
        extras_12_14 = in_practice_12_14.getExtras();
        if (extras_12_14.containsKey("literature_practice_Topic_12_14")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 12 - 14 )");
            practice_12_14();

        }

        in_practice_15_16 = getIntent();
        extras_15_16 = in_practice_15_16.getExtras();
        if (extras_15_16.containsKey("literature_practice_Topic_15_16")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 15 - 16 )");
            practice_15_16();

        }

        in_practice_17_20 = getIntent();
        extras_17_20 = in_practice_17_20.getExtras();
        if (extras_17_20.containsKey("literature_practice_Topic_17_20")) {
            txtNaviTitle.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n ( 17 - 20 )");
            practice_17_20();

        }

    }
    private void loadNativeAd() {
        final StartAppNativeAd nativeAd = new StartAppNativeAd(this);

        nativeAd.loadAd(new NativeAdPreferences()
                .setAdsNumber(1)
                .setAutoBitmapDownload(true)
                .setPrimaryImageSize(2), new AdEventListener() {
            @Override
            public void onReceiveAd(Ad ad) {
                if (adapter != null) {
                    adapter.setNativeAd(nativeAd.getNativeAds());
                }
            }

            @Override
            public void onFailedToReceiveAd(Ad ad) {
                if (BuildConfig.DEBUG) {
                    Log.v(LOG_TAG, "onFailedToReceiveAd: " + ad.getErrorMessage());
                }
            }
        });
    }

    // TODO example of loading JSON array, change this code according to your needs
    @UiThread
    private void loadData() {
        if (adapter != null) {
            adapter.setData(Collections.singletonList("Loading..."));
        }

        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
            @Override
            @WorkerThread
            public void run() {
                String url = "https://raw.githubusercontent.com/StartApp-SDK/StartApp_InApp_SDK_Example/master/app/data.json";

                final List<String> data = new ArrayList<>();

                try (InputStream is = new URL(url).openStream()) {
                    if (is != null) {
                        JsonReader reader = new JsonReader(new InputStreamReader(is));
                        reader.beginArray();

                        while (reader.peek() == JsonToken.STRING) {
                            data.add(reader.nextString());
                        }

                        reader.endArray();
                    }
                } catch (RuntimeException | IOException ex) {
                    data.clear();
                    data.add(ex.toString());
                } finally {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (adapter != null) {
                                adapter.setData(data);
                            }
                        }
                    });
                }
            }
        });
    }
    private void practice_17_20() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de17_20_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de17_20_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de17_20_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de17_20_tp4);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de17_20_tp5);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de17_20_tp6);
        img_TC_src6.setImageBitmap(bitmap_tc_6);


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

    private void practice_15_16() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp4);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp5);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp6);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp7);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

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

    private void practice_12_14() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_rs4);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de12_16_tp3);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

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


    private void practice_8_11() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_tp1_2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_tp2);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_tp3);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_tp4);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de_8_11_tp5);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

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


    private void practice_4_7() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_2);

        Bitmap bitmap_tc_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_3);

        Bitmap bitmap_tc_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_tp3_3);
        img_TC_src4.setImageBitmap(bitmap_tc_4);

        Bitmap bitmap_tc_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_tp4);
        img_TC_src5.setImageBitmap(bitmap_tc_5);

        Bitmap bitmap_tc_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de4_7_tp5);
        img_TC_src6.setImageBitmap(bitmap_tc_6);

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

    private void practice_1_3() {
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de1_3_tp1);
        img_TC_src1.setImageBitmap(bitmap_tc_1);

        Bitmap bitmap_tc_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de1_3_tp2);
        img_TC_src2.setImageBitmap(bitmap_tc_22);

        Bitmap bitmap_tc_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de1_3_tp3);
        img_TC_src3.setImageBitmap(bitmap_tc_23);

        Bitmap bitmap_tc_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.van_de1_3_tp4);
        img_TC_src4.setImageBitmap(bitmap_tc_24);

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
