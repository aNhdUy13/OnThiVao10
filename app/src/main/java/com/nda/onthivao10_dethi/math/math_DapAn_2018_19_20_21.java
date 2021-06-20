package com.nda.onthivao10_dethi.math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nda.onthivao10_dethi.R;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.AnGiang_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.BacLieu_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.BinhPhuoc_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.DaNang_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HCM_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HN_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HaiDuong_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HaiPhong_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.KienGiang_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.SonLa_dapan;

public class math_DapAn_2018_19_20_21 extends AppCompatActivity {
        TextView txtMain_title,txt_src1,txt_src2,txt_src3,txt_src4,txt_src5,
                txt_src6,txt_src7,txt_src8,txt_src9,txt_src10;
        ImageView imgBack;
        Intent in_2018,in_2019,in_2020,in_2021;
        Bundle extras_2018,extras_2019,extras_2020,extras_2021;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.show_card_topic_rs_de_thi_cac_nam);
            mapting();
            imgBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            in_2018 = getIntent();
            extras_2018 = in_2018.getExtras();
            if(extras_2018.containsKey("DapAn_2018"))
            {
                txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2018");
                from_2018();
            }

            in_2019 = getIntent();
            extras_2019 = in_2018.getExtras();
            if(extras_2018.containsKey("DapAn_2019"))
            {
                txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2019");
                from_2019();
            }

            in_2020 = getIntent();
            extras_2020 = in_2020.getExtras();
            if(extras_2020.containsKey("DapAn_2020"))
            {
                txtMain_title.setText("(Đáp Án) Đề Thi Toán Vào 10 Năm 2020");
                from_2020();
            }

        }

    private void from_2020() {
        txt_src1.setText("Sơn La ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), SonLa_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("sonla_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src2.setText(" Kiên Giang ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), KienGiang_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("kiengiang_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src3.setText("Tp HCM ");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src4.setText("Tp Hà Nôi ");
        txt_src4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src5.setText("Hải Phòng ");
        txt_src5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiPhong_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("haiphong_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src6.setText("Hải Dương");
        txt_src6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiDuong_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("haiduong_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src7.setText("Đà Nẵng");
        txt_src7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("danang_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src8.setText("Bình Phước");
        txt_src8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BinhPhuoc_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("binhphuoc_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src9.setText("Bạc Liêu");
        txt_src9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BacLieu_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("baclieu_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src10.setText("An Giang");
        txt_src10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), AnGiang_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("angiang_RSmath_detail_2020",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
    }


    private void from_2019() {
        txt_src1.setText("Sơn La ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), SonLa_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("sonla_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src2.setText(" Kiên Giang ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), KienGiang_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("kiengiang_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src3.setText("Tp HCM ");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src4.setText("Tp Hà Nôi ");
        txt_src4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src5.setText("Hải Phòng ");
        txt_src5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiPhong_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("haiphong_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src6.setText("Hải Dương");
        txt_src6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HaiDuong_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("haiduong_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src7.setText("Đà Nẵng");
        txt_src7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("danang_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
        txt_src8.setText("Bình Phước");
        txt_src8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BinhPhuoc_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("binhphuoc_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src9.setText("Bạc Liêu");
        txt_src9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), BacLieu_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("baclieu_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });

        txt_src10.setText("An Giang");
        txt_src10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), AnGiang_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("angiang_RSmath_detail_2019",true);
                in.putExtras(extras);
                startActivity(in);

            }
        });
    }

    private void from_2018()
        {
            txt_src1.setText("Sơn La ");
            txt_src1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), SonLa_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("sonla_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);
                }
            });

            txt_src2.setText(" Kiên Giang ");
            txt_src2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), KienGiang_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("kiengiang_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });
            txt_src3.setText("Tp HCM ");
            txt_src3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("HCM_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });

            txt_src4.setText("Tp Hà Nôi ");
            txt_src4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("HN_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });
            txt_src5.setText("Hải Phòng ");
            txt_src5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), HaiPhong_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("haiphong_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });
            txt_src6.setText("Hải Dương");
            txt_src6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), HaiDuong_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("haiduong_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });

            txt_src7.setText("Đà Nẵng");
            txt_src7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("danang_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });
            txt_src8.setText("Bình Phước");
            txt_src8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), BinhPhuoc_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("binhphuoc_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });

            txt_src9.setText("Bạc Liêu");
            txt_src9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), BacLieu_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("baclieu_RSmath_detail_2018",true);
                    in.putExtras(extras);
                    startActivity(in);

                }
            });

            txt_src10.setText("An Giang");
            txt_src10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(), AnGiang_dapan.class);
                    Bundle extras = new Bundle();
                    extras.putBoolean("angiang_RSmath_detail_2018",true);
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
