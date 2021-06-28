package com.nda.onthivao10_dethi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nda.onthivao10_dethi.billing.advanced_setting;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartAppSDK.setTestAdsEnabled(true);

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
        AdvancesSetting = (CardView) findViewById(R.id.advanceFunction);

        AdvancesSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, advanced_setting.class));
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