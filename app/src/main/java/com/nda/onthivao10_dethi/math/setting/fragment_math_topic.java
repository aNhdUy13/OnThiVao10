package com.nda.onthivao10_dethi.math.setting;

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
import com.nda.onthivao10_dethi.math.outside_dethi.math_6_topic_advance;
import com.nda.onthivao10_dethi.math.math_DeThi_2018_19_20_21;
import com.nda.onthivao10_dethi.math.outside_dethi.math_topic_40;
import com.nda.onthivao10_dethi.math.outside_dethi.math_topic_40_from_20_40;

public class fragment_math_topic extends Fragment {
    TextView txt40MathTopic, txt40MathTopic_From_21_40, txt6TopicAdvance, txtDeThi2018,txtDeThi2019,
            txtDeThi2020,txtDeThi2021;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.show_card_topic_result_main, container, false);
        txt40MathTopic              = (TextView) view.findViewById(R.id.txt_topic_1);
        txt40MathTopic_From_21_40   = (TextView) view.findViewById(R.id.txt_topic_2);
        txt6TopicAdvance            = (TextView) view.findViewById(R.id.txt_topic_3);
        txtDeThi2018                = (TextView) view.findViewById(R.id.txt_topic_4);
        txtDeThi2019                = (TextView) view.findViewById(R.id.txt_topic_5);
        txtDeThi2020                = (TextView) view.findViewById(R.id.txt_topic_6);

        txt40MathTopic.setText("Bộ 40 Đề Được Bộ Chọn Lọc \n (1 - 20 )");
        txt40MathTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext() , math_topic_40.class));
            }
        });

        txt40MathTopic_From_21_40.setText("Bộ 40 Đề Được Bộ Chọn Lọc\n (21 - 40 )");
        txt40MathTopic_From_21_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), math_topic_40_from_20_40.class));
            }
        });

        txt6TopicAdvance.setText("Bộ 6 Đề Chuyên Của\n Bộ Giáo Dục");
        txt6TopicAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), math_6_topic_advance.class));
            }
        });

        txtDeThi2018.setText("Bộ Đề Thi Năm 2018 \n(Chính Thức)");
        txtDeThi2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), math_DeThi_2018_19_20_21.class);
                Bundle extras = new Bundle();
                extras.putBoolean("DeThi_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        txtDeThi2019.setText("Bộ Đề Thi Năm 2019 \n(Chính Thức)");
        txtDeThi2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), math_DeThi_2018_19_20_21.class);
                Bundle extras = new Bundle();
                extras.putBoolean("DeThi_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        
        txtDeThi2020.setText("Bộ Đề Thi Năm 2020 \n(Chính Thức)");
        txtDeThi2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), math_DeThi_2018_19_20_21.class);
                Bundle extras = new Bundle();
                extras.putBoolean("DeThi_2020", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        return view;
    }



}
