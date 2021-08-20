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
public class math_topic_40_from_20_40 extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Nullable
    protected AdapterWithNativeAd adapter;
        ImageView imgMathTC_40_from_20_40_src1,imgMathTC_40_from_20_40_src2,imgMathTC_40_from_20_40_src3,imgMathTC_40_from_20_40_src4,imgMathTC_40_from_20_40_src5,
    imgMathTC_40_from_20_40_src6,imgMathTC_40_from_20_40_src7,imgMathTC_40_from_20_40_src8,imgMathTC_40_from_20_40_src9,imgMathTC_40_from_20_40_src10,
            imgMathTC_40_from_20_40_src11,imgMathTC_40_from_20_40_src12,imgMathTC_40_from_20_40_src13,imgMathTC_40_from_20_40_src14,imgMathTC_40_from_20_40_src15,
    imgMathTC_40_from_20_40_src16,imgMathTC_40_from_20_40_src17,imgMathTC_40_from_20_40_src18,imgMathTC_40_from_20_40_src19,imgMathTC_40_from_20_40_src20,
    imgBack;
        TextView txtNaviTitle;
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
            BoDe();
            
            RecyclerView recyclerView = findViewById(R.id.recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView.setAdapter(adapter = new AdapterWithNativeAd(this));

            loadData();
            loadNativeAd();

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

    private void BoDe() {
        txtNaviTitle.setText("Bộ 40 Đề Được Bộ Chọn Lọc\n( 21 - 40 )");
        Bitmap bitmap_tc_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_21);
        imgMathTC_40_from_20_40_src1.setImageBitmap(bitmap_tc_21);

        Bitmap bitmap_tc_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_22);
        imgMathTC_40_from_20_40_src2.setImageBitmap(bitmap_tc_22);

        Bitmap bitmap_tc_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_23);
        imgMathTC_40_from_20_40_src3.setImageBitmap(bitmap_tc_23);

        Bitmap bitmap_tc_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_24);
        imgMathTC_40_from_20_40_src4.setImageBitmap(bitmap_tc_24);

        Bitmap bitmap_tc_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_25);
        imgMathTC_40_from_20_40_src5.setImageBitmap(bitmap_tc_25);

        Bitmap bitmap_tc_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_26);
        imgMathTC_40_from_20_40_src6.setImageBitmap(bitmap_tc_26);

        Bitmap bitmap_tc_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_27);
        imgMathTC_40_from_20_40_src7.setImageBitmap(bitmap_tc_27);

        Bitmap bitmap_tc_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_28);
        imgMathTC_40_from_20_40_src8.setImageBitmap(bitmap_tc_28);

        Bitmap bitmap_tc_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_29);
        imgMathTC_40_from_20_40_src9.setImageBitmap(bitmap_tc_29);

        Bitmap bitmap_tc_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_30);
        imgMathTC_40_from_20_40_src10.setImageBitmap(bitmap_tc_30);

        Bitmap bitmap_tc_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_31);
        imgMathTC_40_from_20_40_src11.setImageBitmap(bitmap_tc_31);

        Bitmap bitmap_tc_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_32);
        imgMathTC_40_from_20_40_src12.setImageBitmap(bitmap_tc_32);

        Bitmap bitmap_tc_33 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_33);
        imgMathTC_40_from_20_40_src13.setImageBitmap(bitmap_tc_33);

        Bitmap bitmap_tc_34 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_34);
        imgMathTC_40_from_20_40_src14.setImageBitmap(bitmap_tc_34);

        Bitmap bitmap_tc_35 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_35);
        imgMathTC_40_from_20_40_src15.setImageBitmap(bitmap_tc_35);

        Bitmap bitmap_tc_36 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_36);
        imgMathTC_40_from_20_40_src16.setImageBitmap(bitmap_tc_36);

        Bitmap bitmap_tc_37 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_37);
        imgMathTC_40_from_20_40_src17.setImageBitmap(bitmap_tc_37);

        Bitmap bitmap_tc_38 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_38);
        imgMathTC_40_from_20_40_src18.setImageBitmap(bitmap_tc_38);

        Bitmap bitmap_tc_39 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_39);
        imgMathTC_40_from_20_40_src19.setImageBitmap(bitmap_tc_39);

        Bitmap bitmap_tc_40 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_40);
        imgMathTC_40_from_20_40_src20.setImageBitmap(bitmap_tc_40);
    }

    private void mapting()
        {
            imgBack         = (ImageView) findViewById(R.id.img_back);
            txtNaviTitle    = (TextView) findViewById(R.id.top_navi_title);

            imgMathTC_40_from_20_40_src1 = (ImageView) findViewById(R.id.math_tc_1);

            imgMathTC_40_from_20_40_src2 = (ImageView) findViewById(R.id.math_tc_2);

            imgMathTC_40_from_20_40_src3 = (ImageView) findViewById(R.id.math_tc_3);
            imgMathTC_40_from_20_40_src4 = (ImageView) findViewById(R.id.math_tc_4);
            imgMathTC_40_from_20_40_src5 = (ImageView) findViewById(R.id.math_tc_5);
            imgMathTC_40_from_20_40_src6 = (ImageView) findViewById(R.id.math_tc_6);
            imgMathTC_40_from_20_40_src7 = (ImageView) findViewById(R.id.math_tc_7);
            imgMathTC_40_from_20_40_src8 = (ImageView) findViewById(R.id.math_tc_8);
            imgMathTC_40_from_20_40_src9 = (ImageView) findViewById(R.id.math_tc_9);
            imgMathTC_40_from_20_40_src10 = (ImageView) findViewById(R.id.math_tc_10);
            imgMathTC_40_from_20_40_src11 = (ImageView) findViewById(R.id.math_tc_11);
            imgMathTC_40_from_20_40_src12 = (ImageView) findViewById(R.id.math_tc_12);
            imgMathTC_40_from_20_40_src13 = (ImageView) findViewById(R.id.math_tc_13);
            imgMathTC_40_from_20_40_src14 = (ImageView) findViewById(R.id.math_tc_14);
            imgMathTC_40_from_20_40_src15 = (ImageView) findViewById(R.id.math_tc_15);
            imgMathTC_40_from_20_40_src16 = (ImageView) findViewById(R.id.math_tc_16);
            imgMathTC_40_from_20_40_src17 = (ImageView) findViewById(R.id.math_tc_17);
            imgMathTC_40_from_20_40_src18 = (ImageView) findViewById(R.id.math_tc_18);
            imgMathTC_40_from_20_40_src19 = (ImageView) findViewById(R.id.math_tc_19);
            imgMathTC_40_from_20_40_src20 = (ImageView) findViewById(R.id.math_tc_20);


        }
}
