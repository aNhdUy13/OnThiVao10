package com.nda.onthivao10_dethi.english.setting.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.nda.onthivao10_dethi.R;
import com.nda.onthivao10_dethi.english.setting.english_DeThi_2018_19_20_21_;
import com.nda.onthivao10_dethi.english.setting.outside_dethi.english_practice_topic;
import com.nda.onthivao10_dethi.literature.outside_dethi.literature_practice_topic;
import com.nda.onthivao10_dethi.math.math_DeThi_2018_19_20_21;
import com.nda.onthivao10_dethi.math.outside_dethi.math_6_topic_advance;
import com.nda.onthivao10_dethi.math.outside_dethi.math_topic_40;
import com.nda.onthivao10_dethi.math.outside_dethi.math_topic_40_from_20_40;

public class fragment_english_topic extends Fragment {
    TextView txtCard1, txtCard2, txtCard3, txtCard4,txtCard5,txtDeThi2018,
            txtDeThi2019,txtDeThi2020,txtDeThi2021;

    CardView cv10,cv11;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.show_card_topic_result_main, container, false);
        txtCard1   = (TextView) view.findViewById(R.id.txt_topic_1);
        txtCard2   = (TextView) view.findViewById(R.id.txt_topic_2);
        txtCard3       = (TextView) view.findViewById(R.id.txt_topic_3);
        txtCard4       = (TextView) view.findViewById(R.id.txt_topic_4);
        txtCard5   = (TextView) view.findViewById(R.id.txt_topic_5);

        txtDeThi2018   = (TextView) view.findViewById(R.id.txt_topic_main_card_6);
        txtDeThi2019   = (TextView) view.findViewById(R.id.txt_topic_main_card_7);
        txtDeThi2020   = (TextView) view.findViewById(R.id.txt_topic_main_card_8);
        txtDeThi2021   = (TextView) view.findViewById(R.id.txt_topic_main_card_9);

        cv10     = (CardView) view.findViewById(R.id.card_tp_id_10);
        cv11     = (CardView) view.findViewById(R.id.card_tp_id_11);

        txtCard1.setText("Bộ 22 Đề Được Bộ Chọn Lọc \n (1 - 5 )");
        txtCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_practice_Topic_1_5", true);
                in.putExtras(extras);
                startActivity(in);              }
        });

        txtCard2.setText("Bộ 22 Đề Được Bộ Chọn Lọc\n (6 - 10 )");
        txtCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_practice_Topic_6_10", true);
                in.putExtras(extras);
                startActivity(in);              }
        });

        txtCard3.setText("Bộ 22 Đề Được Bộ Chọn Lọc\n (11 - 15 )");
        txtCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_practice_Topic_11_15", true);
                in.putExtras(extras);
                startActivity(in);              }
        });

        txtCard4.setText("Bộ 22 Đề Được Bộ Chọn Lọc\n (16 - 19 )");
        txtCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_practice_Topic_16_19", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtCard5.setText("Bộ 22 Đề Được Bộ Chọn Lọc\n (20 - 22 )");
        txtCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_practice_Topic_20_22", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2018.setText("Bộ Đề Thi Năm 2018 \n(Chính Thức)");
        txtDeThi2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_DeThi_2018_19_20_21_.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_DeThi_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        txtDeThi2019.setText("Bộ Đề Thi Năm 2019 \n(Chính Thức)");
        txtDeThi2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_DeThi_2018_19_20_21_.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_DeThi_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2020.setText("Bộ Đề Thi Năm 2020 \n(Chính Thức)");
        txtDeThi2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_DeThi_2018_19_20_21_.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_DeThi_2020", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2021.setText("Bộ Đề Thi Năm 2021 \n(Chính Thức)");
        txtDeThi2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), english_DeThi_2018_19_20_21_.class);
                Bundle extras = new Bundle();
                extras.putBoolean("english_DeThi_2021", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        cv10.setVisibility(View.GONE);
        cv11.setVisibility(View.GONE);
        return view;
    }

}
