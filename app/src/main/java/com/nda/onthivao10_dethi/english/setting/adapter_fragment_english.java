package com.nda.onthivao10_dethi.english.setting;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class adapter_fragment_english extends FragmentStatePagerAdapter {

    public adapter_fragment_english(@NonNull  FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new fragment_english_topic();
            case 1:
                return new fragment_english_result();
            default:
                return new fragment_english_topic();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}