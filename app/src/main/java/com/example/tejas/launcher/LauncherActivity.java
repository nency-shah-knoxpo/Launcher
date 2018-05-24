package com.example.tejas.launcher;

import android.support.v4.app.Fragment;

public class LauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new LauncherFragment().newInstance();
    }


}
