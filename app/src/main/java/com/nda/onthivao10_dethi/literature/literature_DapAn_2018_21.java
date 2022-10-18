package com.nda.onthivao10_dethi.literature;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nda.onthivao10_dethi.R;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.DaNang_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.DaNang_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HCM_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HCM_de;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HN_dapan;
import com.nda.onthivao10_dethi.detail_2018_19_20_21.HN_de;

public class literature_DapAn_2018_21 extends AppCompatActivity {
    TextView txtMain_title,txt_src1,txt_src2,txt_src3,txt_src4,txt_src5,
            txt_src6,txt_src7,txt_src8,txt_src9,txt_src10;
    ImageView imgBack;
    Intent in_2018, in_2019,in_2020,in_2021 ;
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10;

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
        in_2018= getIntent();
        Bundle extras = in_2018.getExtras();
        if (extras.containsKey("Literature_DapAn_2018"))
        {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2018");

            showCard_2018();
        }

        in_2019 = getIntent();
        Bundle extras_2019 = in_2019.getExtras();
        if (extras_2019.containsKey("Literature_DapAn_2019"))
        {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2019");

            showCard_2019();
        }
        in_2020 = getIntent();
        Bundle extras_2020 = in_2020.getExtras();
        if (extras_2020.containsKey("Literature_DapAn_2020"))
        {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2020");

            showCard_2020();
        }

        in_2021 = getIntent();
        Bundle extras_2021 = in_2021.getExtras();
        if (extras_2021.containsKey("Literature_DapAn_2021"))
        {
            txtMain_title.setText("Đề Thi Văn Vào 10 Năm 2021");

            showCard_2021();
        }

    }

    private void showCard_2021()
    {
        txt_src1.setText("Tp HCM ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_literature_detail_2021", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src2.setText("Tp Hà Nội ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_literature_detail_2021", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src3.setText("Đà Nẵng");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                Bundle extras = new Bundle();

                extras.putBoolean("DaNang_literature_detail_2021", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);

    }
    private void showCard_2020()
    {
        txt_src1.setText("Tp HCM ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_literature_detail_2020", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src2.setText("Tp Hà Nội ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_literature_detail_2020", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src3.setText("Đà Nẵng");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                Bundle extras = new Bundle();

                extras.putBoolean("DaNang_literature_detail_2020", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);

    }
    private void showCard_2019()
    {
        txt_src1.setText("Tp HCM ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_literature_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src2.setText("Tp Hà Nội ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_literature_detail_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src3.setText("Đà Nẵng");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                Bundle extras = new Bundle();

                extras.putBoolean("DaNang_literature_detail_2019", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);

    }
    private void showCard_2018()
    {
        txt_src1.setText("Tp HCM ");
        txt_src1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HCM_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HCM_literature_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });

        txt_src2.setText("Tp Hà Nội ");
        txt_src2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HN_dapan.class);
                Bundle extras = new Bundle();
                extras.putBoolean("HN_literature_detail_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txt_src3.setText("Đà Nẵng");
        txt_src3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DaNang_dapan.class);
                Bundle extras = new Bundle();

                extras.putBoolean("DaNang_literature_detail_2018", true);
                in.putExtras(extras);

                startActivity(in);
            }
        });
        cv4.setVisibility(View.GONE);
        cv5.setVisibility(View.GONE);
        cv6.setVisibility(View.GONE);
        cv7.setVisibility(View.GONE);
        cv8.setVisibility(View.GONE);
        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);

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


        cv1 = (CardView) findViewById(R.id.card_tp_id_1);
        cv2 = (CardView) findViewById(R.id.card_tp_id_2);
        cv3 = (CardView) findViewById(R.id.card_tp_id_3);
        cv4 = (CardView) findViewById(R.id.card_tp_id_4);
        cv5 = (CardView) findViewById(R.id.card_tp_id_5);
        cv6 = (CardView) findViewById(R.id.card_tp_id_6);
        cv7 = (CardView) findViewById(R.id.card_tp_id_7);
        cv8 = (CardView) findViewById(R.id.card_tp_id_8);
        cv9 = (CardView) findViewById(R.id.card_tp_id_9);
        cv10 = (CardView) findViewById(R.id.card_tp_id_10);
    }
}
