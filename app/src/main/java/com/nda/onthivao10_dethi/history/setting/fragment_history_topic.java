package com.nda.onthivao10_dethi.history.setting;

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
import com.nda.onthivao10_dethi.history.history_DeThi_2021;
import com.nda.onthivao10_dethi.history.outside_dethi.history_practice_topic;
import com.nda.onthivao10_dethi.math.math_DeThi_2018_19_20_21;

public class fragment_history_topic extends Fragment {
    TextView txtCard1, txtCard2, txtCard3, txtCard4,txtCard5,txtCard6,txtCard7,txtDeThi2018,
            txtDeThi2019,txtDeThi2020,txtDeThi2021;

    CardView cv9,cv10,cv11;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.show_card_topic_result_main, container, false);
        txtCard1   = (TextView) view.findViewById(R.id.txt_topic_1);
        txtCard2   = (TextView) view.findViewById(R.id.txt_topic_2);
        txtCard3       = (TextView) view.findViewById(R.id.txt_topic_3);
        txtCard4       = (TextView) view.findViewById(R.id.txt_topic_4);
        txtCard5       = (TextView) view.findViewById(R.id.txt_topic_5);
        txtCard6   = (TextView) view.findViewById(R.id.txt_topic_main_card_6);
        txtCard7   = (TextView) view.findViewById(R.id.txt_topic_main_card_7);

        txtDeThi2021   = (TextView) view.findViewById(R.id.txt_topic_main_card_8);
        cv9      = (CardView) view.findViewById(R.id.card_tp_id_9);
        cv10     = (CardView) view.findViewById(R.id.card_tp_id_10);
        cv11     = (CardView) view.findViewById(R.id.card_tp_id_11);

        txtCard1.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n (1 - 3 )");
        txtCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_1_3", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtCard2.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (4 - 6 )");
        txtCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_4_6", true);
                in.putExtras(extras);
                startActivity(in);            }
        });

        txtCard3.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (7 - 9 )");
        txtCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_7_9", true);
                in.putExtras(extras);
                startActivity(in);            }
        });

        txtCard4.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (10 - 12 )");
        txtCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_10_12", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtCard5.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (13 - 15 )");
        txtCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_13_15", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        txtCard6.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (16 - 18 )");
        txtCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_16_18", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtCard7.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (19 - 20 )");
        txtCard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_practice_Topic_19_20", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        txtDeThi2021.setText("Bộ Đề Thi Năm 2021 \n(Chính Thức)");
        txtDeThi2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), history_DeThi_2021.class);
                Bundle extras = new Bundle();
                extras.putBoolean("history_dethi_2021", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        cv9.setVisibility(View.GONE);
        cv10.setVisibility(View.GONE);
        cv11.setVisibility(View.GONE);



        return view;
    }

}
