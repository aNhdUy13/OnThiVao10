package com.nda.onthivao10_dethi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nda.onthivao10_dethi.english.setting.setting.adapter_fragment_english;
import com.nda.onthivao10_dethi.history.setting.adapter_fragment_history;
import com.nda.onthivao10_dethi.literature.adapter_fragment_literature;
import com.nda.onthivao10_dethi.math.setting.adapter_fragment_math;

public class show_mainPage_t_v_a_ls extends AppCompatActivity {
    public BottomNavigationView navigationView;
    public ViewPager viewPager;
    TextView txtNaviTitle;
    ImageView imgNaviBack;
    Intent in_math,in_literature, in_english,in_history;
    Bundle extras_math, extras_literature,extras_english,extras_history;
    LinearLayout llTopNavi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);
        txtNaviTitle = (TextView) findViewById(R.id.top_navi_title);
        imgNaviBack  = (ImageView) findViewById(R.id.img_back);

        imgNaviBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

         in_math = getIntent();
        extras_math = in_math.getExtras();

        in_english = getIntent();
        extras_english = in_english.getExtras();

        in_literature = getIntent();
        extras_literature = in_literature.getExtras();

        in_history = getIntent();
        extras_history = in_history.getExtras();
        
        if (extras_math.containsKey("mainPage_math"))
        {
            txtNaviTitle.setText("Ôn Thi Với Toán");
            showTiTle_DeToan();
            setupViewPager_math();
        }


        if(extras_english.containsKey("mainPage_english"))
        {
            txtNaviTitle.setText("Ôn Thi Với Tiếng Anh");

            llTopNavi = (LinearLayout) findViewById(R.id.top_img);
            @SuppressLint("UseCompatLoadingForDrawables")
            Drawable drawable = getResources().getDrawable(R.drawable.top_img_english);
            llTopNavi.setBackground(drawable);
            showTiTle_english();
            setupViewPager_english();
        }
        
        if (extras_literature.containsKey("mainPage_literature"))
        {
            txtNaviTitle.setText("Ôn Thi Với Văn");

            llTopNavi = (LinearLayout) findViewById(R.id.top_img);
            @SuppressLint("UseCompatLoadingForDrawables")
            Drawable drawable = getResources().getDrawable(R.drawable.top_img_van);
            llTopNavi.setBackground(drawable);

            showTiTle_literature();
            setupViewPager_literature();
        }

        if (extras_history.containsKey("mainPage_history"))
        {
            txtNaviTitle.setText("Ôn Thi Với Lịch Sử");
            llTopNavi = (LinearLayout) findViewById(R.id.top_img);
            @SuppressLint("UseCompatLoadingForDrawables")
            Drawable drawable = getResources().getDrawable(R.drawable.top_img_history);
            llTopNavi.setBackground(drawable);

            showTiTle_history();
            setupViewPager_history();
        }

    }

    private void setupViewPager_history() {
        viewPager = (ViewPager) findViewById(R.id.viewPager_content);
        adapter_fragment_history adapter_fragment_history = new adapter_fragment_history(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPager.setAdapter(adapter_fragment_history);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position)
                {
                    case 0:
                        navigationView.getMenu().findItem(R.id.see_topic).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.see_result).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void showTiTle_history() {
        navigationView = (BottomNavigationView) findViewById(R.id.topNavi);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.see_topic:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.see_result:
                        viewPager.setCurrentItem(1);
                        break;

                }
                return true;
            }
        });

    }

    private void setupViewPager_literature() {
        viewPager = (ViewPager) findViewById(R.id.viewPager_content);
        adapter_fragment_literature adapter_fragment_literature = new adapter_fragment_literature(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPager.setAdapter(adapter_fragment_literature);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position)
                {
                    case 0:
                        navigationView.getMenu().findItem(R.id.see_topic).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.see_result).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void showTiTle_literature() {
        navigationView = (BottomNavigationView) findViewById(R.id.topNavi);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.see_topic:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.see_result:
                        viewPager.setCurrentItem(1);
                        break;

                }
                return true;
            }
        });
    }

    private void setupViewPager_english() {
        viewPager = (ViewPager) findViewById(R.id.viewPager_content);
        adapter_fragment_english adapter_fragment_english = new adapter_fragment_english(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPager.setAdapter(adapter_fragment_english);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position)
                {
                    case 0:
                        navigationView.getMenu().findItem(R.id.see_topic).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.see_result).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void showTiTle_english() {
        navigationView = (BottomNavigationView) findViewById(R.id.topNavi);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.see_topic:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.see_result:
                        viewPager.setCurrentItem(1);
                        break;

                }
                return true;
            }
        });
    }


    private void showTiTle_DeToan()
    {
        navigationView = (BottomNavigationView) findViewById(R.id.topNavi);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.see_topic:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.see_result:
                        viewPager.setCurrentItem(1);
                        break;

                }
                return true;
            }
        });
    }

    private void setupViewPager_math()
    {
        viewPager = (ViewPager) findViewById(R.id.viewPager_content);
        adapter_fragment_math adapter_fragment_math = new adapter_fragment_math(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPager.setAdapter(adapter_fragment_math);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position)
                {
                    case 0:
                        navigationView.getMenu().findItem(R.id.see_topic).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.see_result).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}