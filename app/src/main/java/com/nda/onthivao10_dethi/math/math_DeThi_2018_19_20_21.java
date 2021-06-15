package com.nda.onthivao10_dethi.math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.AnGiang_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.BacLieu_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.BinhPhuoc_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.DaNang_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HCM_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HN_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HaiDuong_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HaiPhong_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.KienGiang_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.SonLa_de;

public class math_DeThi_2018_19_20_21 extends AppCompatActivity {
    TextView txtMain_title,txt_src1,txt_src2,txt_src3,txt_src4,txt_src5,
            txt_src6,txt_src7,txt_src8,txt_src9,txt_src10;
    ImageView imgBack;
    Intent in_2018, in_2019,in2020,in_2021 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_card_topic_rs_de_thi_cac_nam);
        mapting();

        in_2018= getIntent();
        Bundle extras = in_2018.getExtras();
        if (extras.containsKey("DeThi_2018"))
        {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2018");
            imgBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            showCard_2018();
        }

        in_2019 = getIntent();
        Bundle extras_2019 = in_2019.getExtras();
        if (extras_2019.containsKey("DeThi_2019"))
        {
            txtMain_title.setText("Đề Thi Toán Vào 10 Năm 2019");
            imgBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            showCard_2019();
        }



    }
    private void showCard_2019()
    {
        txt_src1.setText("Sơn La ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), SonLa_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("sonla_math_detail_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src2.setText(" Kiên Giang ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), KienGiang_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("kiengiang_math_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src3.setText("Tp HCM ");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_math_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src4.setText("Tp Hà Nội ");
        txt_src4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_math_detail_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        txt_src5.setText("Hải Phòng ");
        txt_src5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiPhong_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HaiPhong_math_detail_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src6.setText("Hải Dương");
        txt_src6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiDuong_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HaiDuong_math_detail_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });


        txt_src7.setText("Đà Nẵng");
        txt_src7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("DaNang_math_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src8.setText("Bình Phước");
        txt_src8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BinhPhuoc_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("BinhPhuoc_math_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src9.setText("Bạc Liêu");
        txt_src9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BacLieu_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("BacLieu_math_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
        txt_src10.setText("An Giang");
        txt_src10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), AnGiang_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("AnGiang_math_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
    }

    private void showCard_2018()
    {
        txt_src1.setText("Sơn La ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), SonLa_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("sonla_math_detail_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src2.setText(" Kiên Giang ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), KienGiang_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("kiengiang_math_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src3.setText("Tp HCM ");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_math_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src4.setText("Tp Hà Nội ");
        txt_src4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_math_detail_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        txt_src5.setText("Hải Phòng ");
        txt_src5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiPhong_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HaiPhong_math_detail_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src6.setText("Hải Dương");
        txt_src6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiDuong_de.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HaiDuong_math_detail_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });


        txt_src7.setText("Đà Nẵng");
        txt_src7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("DaNang_math_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src8.setText("Bình Phước");
        txt_src8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BinhPhuoc_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("BinhPhuoc_math_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src9.setText("Bạc Liêu");
        txt_src9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BacLieu_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("BacLieu_math_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
        txt_src10.setText("An Giang");
        txt_src10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), AnGiang_de.class);
                Bundle extras = new Bundle();

                extras.putBoolean("AnGiang_math_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
    }

    private void mapting()
    {
        txtMain_title = (TextView) findViewById(R.id.top_navi_title);
        imgBack       = (ImageView) findViewById(R.id.img_back);
        txt_src1 = (TextView) findViewById(R.id.txt_topic_1);
        txt_src2 = (TextView) findViewById(R.id.txt_topic_2);
        txt_src3 = (TextView) findViewById(R.id.txt_topic_3);
        txt_src4 = (TextView) findViewById(R.id.txt_topic_4);
        txt_src5 = (TextView) findViewById(R.id.txt_topic_5);
        txt_src6 = (TextView) findViewById(R.id.txt_topic_6);
        txt_src7 = (TextView) findViewById(R.id.txt_topic_7);
        txt_src8 = (TextView) findViewById(R.id.txt_topic_8);
        txt_src9 = (TextView) findViewById(R.id.txt_topic_9);
        txt_src10 = (TextView) findViewById(R.id.txt_topic_10);

    }
}
