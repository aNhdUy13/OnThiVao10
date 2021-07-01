package com.nda.onthivao10_dethi.math.outside_dethi;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
public class math_result_from_1_42 extends AppCompatActivity {
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
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Nullable
    protected AdapterWithNativeAd adapter;
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
                StartAppAd.showAd(getApplicationContext());
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter = new AdapterWithNativeAd(this));

        loadData();
        loadNativeAd();
        txtNaviTitle.setText("(Đáp Án) Bộ 40 Đề Được Bộ Chọn Lọc\n( 1 - 21 )");
        Bitmap bitmap_rs_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_1);
        imgMathResult_40_from_1_42_src1.setImageBitmap(bitmap_rs_1);

        Bitmap bitmap_rs_2 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_2);
        imgMathResult_40_from_1_42_src2.setImageBitmap(bitmap_rs_2);

        Bitmap bitmap_rs_3 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_3);
        imgMathResult_40_from_1_42_src3.setImageBitmap(bitmap_rs_3);

        Bitmap bitmap_rs_4 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_4);
        imgMathResult_40_from_1_42_src4.setImageBitmap(bitmap_rs_4);

        Bitmap bitmap_rs_5 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_5);
        imgMathResult_40_from_1_42_src5.setImageBitmap(bitmap_rs_5);

        Bitmap bitmap_rs_6 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_6);
        imgMathResult_40_from_1_42_src6.setImageBitmap(bitmap_rs_6);

        Bitmap bitmap_rs_7 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_7);
        imgMathResult_40_from_1_42_src7.setImageBitmap(bitmap_rs_7);

        Bitmap bitmap_rs_8 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_8);
        imgMathResult_40_from_1_42_src8.setImageBitmap(bitmap_rs_8);

        Bitmap bitmap_rs_9 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_9);
        imgMathResult_40_from_1_42_src9.setImageBitmap(bitmap_rs_9);

        Bitmap bitmap_rs_10 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_10);
        imgMathResult_40_from_1_42_src10.setImageBitmap(bitmap_rs_10);

        Bitmap bitmap_rs_11 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_11);
        imgMathResult_40_from_1_42_src11.setImageBitmap(bitmap_rs_11);

        Bitmap bitmap_rs_12 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_12);
        imgMathResult_40_from_1_42_src12.setImageBitmap(bitmap_rs_12);

        Bitmap bitmap_rs_13 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_13);
        imgMathResult_40_from_1_42_src13.setImageBitmap(bitmap_rs_13);

        Bitmap bitmap_rs_14 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_14);
        imgMathResult_40_from_1_42_src14.setImageBitmap(bitmap_rs_14);

        Bitmap bitmap_rs_15 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_15);
        imgMathResult_40_from_1_42_src15.setImageBitmap(bitmap_rs_15);

        Bitmap bitmap_rs_16 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_16);
        imgMathResult_40_from_1_42_src16.setImageBitmap(bitmap_rs_16);

        Bitmap bitmap_rs_17 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_17);
        imgMathResult_40_from_1_42_src17.setImageBitmap(bitmap_rs_17);

        Bitmap bitmap_rs_18 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_18);
        imgMathResult_40_from_1_42_src18.setImageBitmap(bitmap_rs_18);

        Bitmap bitmap_rs_19 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_19);
        imgMathResult_40_from_1_42_src19.setImageBitmap(bitmap_rs_19);

        Bitmap bitmap_rs_20 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_20);
        imgMathResult_40_from_1_42_src20.setImageBitmap(bitmap_rs_20);

        Bitmap bitmap_rs_21 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_21);
        imgMathResult_40_from_1_42_src21.setImageBitmap(bitmap_rs_21);

        Bitmap bitmap_rs_22 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_22);
        imgMathResult_40_from_1_42_src22.setImageBitmap(bitmap_rs_22);

        Bitmap bitmap_rs_23 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_23);
        imgMathResult_40_from_1_42_src23.setImageBitmap(bitmap_rs_23);

        Bitmap bitmap_rs_24 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_24);
        imgMathResult_40_from_1_42_src24.setImageBitmap(bitmap_rs_24);

        Bitmap bitmap_rs_25 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_25);
        imgMathResult_40_from_1_42_src25.setImageBitmap(bitmap_rs_25);

        Bitmap bitmap_rs_26 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_26);
        imgMathResult_40_from_1_42_src26.setImageBitmap(bitmap_rs_26);

        Bitmap bitmap_rs_27 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_27);
        imgMathResult_40_from_1_42_src27.setImageBitmap(bitmap_rs_27);

        Bitmap bitmap_rs_28 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_28);
        imgMathResult_40_from_1_42_src28.setImageBitmap(bitmap_rs_28);

        Bitmap bitmap_rs_29 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_29);
        imgMathResult_40_from_1_42_src29.setImageBitmap(bitmap_rs_29);

        Bitmap bitmap_rs_30 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_30);
        imgMathResult_40_from_1_42_src30.setImageBitmap(bitmap_rs_30);

        Bitmap bitmap_rs_31 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_31);
        imgMathResult_40_from_1_42_src31.setImageBitmap(bitmap_rs_31);

        Bitmap bitmap_rs_32 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_32);
        imgMathResult_40_from_1_42_src32.setImageBitmap(bitmap_rs_32);

        Bitmap bitmap_rs_33 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_33);
        imgMathResult_40_from_1_42_src33.setImageBitmap(bitmap_rs_33);

        Bitmap bitmap_rs_34 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_34);
        imgMathResult_40_from_1_42_src34.setImageBitmap(bitmap_rs_34);

        Bitmap bitmap_rs_35 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_35);
        imgMathResult_40_from_1_42_src35.setImageBitmap(bitmap_rs_35);

        Bitmap bitmap_rs_36 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_36);
        imgMathResult_40_from_1_42_src36.setImageBitmap(bitmap_rs_36);

        Bitmap bitmap_rs_37 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_37);
        imgMathResult_40_from_1_42_src37.setImageBitmap(bitmap_rs_37);

        Bitmap bitmap_rs_38 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_38);
        imgMathResult_40_from_1_42_src38.setImageBitmap(bitmap_rs_38);

        Bitmap bitmap_rs_39 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_39);
        imgMathResult_40_from_1_42_src39.setImageBitmap(bitmap_rs_39);

        Bitmap bitmap_rs_40 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_40);
        imgMathResult_40_from_1_42_src40.setImageBitmap(bitmap_rs_40);

        Bitmap bitmap_rs_41 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_41);
        imgMathResult_40_from_1_42_src41.setImageBitmap(bitmap_rs_41);

        Bitmap bitmap_rs_42 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_result_42);
        imgMathResult_40_from_1_42_src42.setImageBitmap(bitmap_rs_42);
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