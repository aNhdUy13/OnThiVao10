package com.nda.onthivao10_dethi.literature;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nda.onthivao10_dethi.R;
import com.nda.onthivao10_dethi.literature.outside_dethi.literature_practice_topic;

public class fragment_literature_topic extends Fragment {
    TextView txtCard1, txtCard2, txtCard3, txtCard4,txtCard5,txtDeThi2018,
            txtDeThi2019,txtDeThi2020,txtDeThi2021;
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

        txtDeThi2018   = (TextView) view.findViewById(R.id.txt_topic_main_card_6);
        txtDeThi2019   = (TextView) view.findViewById(R.id.txt_topic_main_card_7);
        txtDeThi2020   = (TextView) view.findViewById(R.id.txt_topic_main_card_8);
        txtDeThi2021   = (TextView) view.findViewById(R.id.txt_topic_main_card_9);

        txtCard1.setText("Bộ 20 Đề Được Bộ Chọn Lọc \n (1 - 3 )");
        txtCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_practice_Topic_1_3", true);
                in.putExtras(extras);
                startActivity(in);            }
        });

        txtCard2.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (4 - 7 )");
        txtCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_practice_Topic_4_7", true);
                in.putExtras(extras);
                startActivity(in);              }
        });

        txtCard3.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (8 - 11 )");
        txtCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_practice_Topic_8_11", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtCard4.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (12 - 16 )");
        txtCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_practice_Topic_12_16", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtCard5.setText("Bộ 20 Đề Được Bộ Chọn Lọc\n (17 - 20 )");
        txtCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_practice_Topic_17_20", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2018.setText("Bộ Đề Thi Năm 2018 \n(Chính Thức)");
        txtDeThi2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_DeThi_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2019.setText("Bộ Đề Thi Năm 2019 \n(Chính Thức)");
        txtDeThi2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_DeThi_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2020.setText("Bộ Đề Thi Năm 2020 \n(Chính Thức)");
        txtDeThi2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_DeThi_2020", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtDeThi2021.setText("Bộ Đề Thi Năm 2021 \n(Chính Thức)");
        txtDeThi2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), literature_practice_topic.class);
                Bundle extras = new Bundle();
                extras.putBoolean("literature_DeThi_2021", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        return view;
    }

}
