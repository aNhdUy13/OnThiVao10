package com.nda.onthivao10_dethi.history.setting;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class adapter_fragment_history extends FragmentStatePagerAdapter {

    public adapter_fragment_history(@NonNull  FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new fragment_history_topic();
            case 1:
                return new fragment_history_result();
            default:
                return new fragment_history_topic();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
