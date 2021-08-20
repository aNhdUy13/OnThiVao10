package com.nda.onthivao10_dethi;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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

public class MainActivity extends AppCompatActivity {
    CardView cvShareApp;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Nullable
    protected AdapterWithNativeAd adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //StartAppSDK.setTestAdsEnabled(true);

        StartAppAd.disableSplash();

        startPractice();
    }



    private void startPractice()
    {
        CardView btnLichSu,btnAnh , btnMath,btnVan, goToTinhDiem,AdvancesSetting;
        btnMath     = (CardView) findViewById(R.id.math);
        btnVan      = (CardView) findViewById(R.id.literature);
        btnAnh      = (CardView) findViewById(R.id.english);
        btnLichSu   = (CardView) findViewById(R.id.history);
        goToTinhDiem= (CardView) findViewById(R.id.TinhDiem);
        cvShareApp  = (CardView) findViewById(R.id.shareFunction);
        //AdvancesSetting = (CardView) findViewById(R.id.advanceFunction);

//        AdvancesSetting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, advanced_setting.class));
//            }
//        });
        cvShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sharing();
            }
        });
        goToTinhDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTinhDiem();
            }
        });
        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_math",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        btnAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_english",true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        btnVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_literature",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        btnLichSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, show_mainPage_t_v_a_ls.class);
                Bundle extras = new Bundle();
                extras.putBoolean("mainPage_history",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
    }
    private void dialogTinhDiem() {
        Dialog dialog = new Dialog((MainActivity.this));
        dialog.setContentView(R.layout.dialog_goto_tinhdiem);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView btn_copyLink             = (ImageView) dialog.findViewById(R.id.copy_Link_text);
        Button btn_searchLink_openApp      = (Button) dialog.findViewById(R.id.searchLink_openapp);
        TextView txtResult_link            = (TextView) dialog.findViewById(R.id.txtLink);
        TextView txtTitle_luyenTap         = (TextView) dialog.findViewById(R.id.title_luyenTap);
        LinearLayout ll_link               = (LinearLayout) dialog.findViewById(R.id.ll_link_luyenNao);

        btn_copyLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("ImgView",txtResult_link.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"Link Copied",Toast.LENGTH_LONG).show();
            }
        });

        String packageName = "com.nda.grade_calculator";
        if (isPackageAvailable(packageName))
        {
            ll_link.setVisibility(View.INVISIBLE);
            txtTitle_luyenTap.setText("Phần Mềm Tính Điểm\n(ĐÃ TẢI)");
            btn_searchLink_openApp.setText("Mở Ứng Dụng");
            btn_searchLink_openApp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentOpen = getPackageManager().getLaunchIntentForPackage(packageName);
                    startActivity(intentOpen);
                }
            });
        }
        else
        {
            btn_searchLink_openApp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentSearch = new Intent(Intent.ACTION_WEB_SEARCH);
                    String term = txtResult_link.getText().toString();
                    intentSearch.putExtra(SearchManager.QUERY, term);
                    startActivity(intentSearch);
                }
            });
        }
        dialog.show();

    }

    private void Sharing() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        String shareBody = "Quyết Tâm Đỗ với \nhttps://play.google.com/store/apps/details?id=com.nda.onthivao10_dethi";
        /*The type of the content is text, obviously.*/
        intent.setType("text/plain");
        /*Applying information Subject and Body.*/
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
        intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        cvShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(Intent.createChooser(intent, getString(R.string.share_using)));

//                    startActivity(sendIntent);
                } catch (Exception e)
                { e.printStackTrace();}

            }
        });
        /* End of Some tool */

    }
    private boolean isPackageAvailable(String packageName)
    {
        boolean available = true;
        try{
            getPackageManager().getPackageInfo(packageName,0);
        }catch(PackageManager.NameNotFoundException e)
        {
            available = false;
        }
        return available;
    }
}