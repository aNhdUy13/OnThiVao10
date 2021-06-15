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
import com.nda.onthivao10_dethi.math.math_DeThi_2018_19_20_21;
import com.nda.onthivao10_dethi.math.outside_dethi.math_6_result_advance;
import com.nda.onthivao10_dethi.math.math_DapAn_2018_19_20_21;
import com.nda.onthivao10_dethi.math.outside_dethi.math_result_from_1_42;
import com.nda.onthivao10_dethi.math.outside_dethi.math_result_from_43_78;


public class fragment_math_result extends Fragment {
    TextView txtResult_1_20, txtResult_20_40,txtResult_6_advance, txtResult_dethi_2018,txtResult_dethi_2019,txtResult_dethi_2020,
            txtResult_dethi_2021;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.show_card_topic_result_main, container, false);
        txtResult_1_20 = (TextView) view.findViewById(R.id.txt_topic_1);
        txtResult_20_40 = (TextView) view.findViewById(R.id.txt_topic_2);
        txtResult_6_advance = (TextView) view.findViewById(R.id.txt_topic_3);
        txtResult_dethi_2018 = (TextView) view.findViewById(R.id.txt_topic_4);
        txtResult_dethi_2019 = (TextView) view.findViewById(R.id.txt_topic_5);

        txtResult_1_20.setText("(Đáp Án) Bộ 40 Đề Được Bộ Chọn Lọc\n (1 - 21 )");
        txtResult_1_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), math_result_from_1_42.class));
            }
        });

        txtResult_20_40.setText("(Đáp Án) Bộ 40 Đề Được Bộ Chọn Lọc\n (22 - 40 )");
        txtResult_20_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), math_result_from_43_78.class));
            }
        });

        txtResult_6_advance.setText("(Đáp Án) Bộ 6 Đề Chuyên Của\n Bộ Giáo Dục");
        txtResult_6_advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), math_6_result_advance.class));
            }
        });

        txtResult_dethi_2018.setText("(Đáp Án) Bộ Đề Thi Năm 2018 \n(Chính Thức)");
        txtResult_dethi_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), math_DapAn_2018_19_20_21.class);
                Bundle extras = new Bundle();
                extras.putBoolean("DapAn_2018", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });

        txtResult_dethi_2019.setText("(Đáp Án) Bộ Đề Thi Năm 2019 \n(Chính Thức)");
        txtResult_dethi_2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), math_DapAn_2018_19_20_21.class);
                Bundle extras = new Bundle();
                extras.putBoolean("DapAn_2019", true);
                in.putExtras(extras);
                startActivity(in);
            }
        });
        return view;
    }
}
