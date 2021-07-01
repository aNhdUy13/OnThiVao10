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
public class math_topic_40 extends AppCompatActivity {
    ImageView imgMathTC_40_from_1_20_src1, imgBack;
    TextView txtNaviTitle;
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
        txtNaviTitle.setText("Bộ 40 Đề Được Bộ Chọn Lọc\n( 1 - 20 )");
        Bitmap bitmap_tc_1 = BitmapFactory.decodeResource(getResources(),R.mipmap.math_tc_1);
        imgMathTC_40_from_1_20_src1.setImageBitmap(bitmap_tc_1);

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
        imgMathTC_40_from_1_20_src1 = (ImageView) findViewById(R.id.math_tc_1);
    }
}
