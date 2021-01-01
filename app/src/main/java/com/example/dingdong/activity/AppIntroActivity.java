package com.example.dingdong.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.dingdong.R;
import com.example.dingdong.fragment.MyAppIntroFragment;
import com.github.appintro.AppIntro2;

public class AppIntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(MyAppIntroFragment.newInstance(R.drawable.create1));
        addSlide(MyAppIntroFragment.newInstance(R.drawable.create2));
        addSlide(MyAppIntroFragment.newInstance(R.drawable.create3));
        addSlide(MyAppIntroFragment.newInstance(R.drawable.create4));
        addSlide(MyAppIntroFragment.newInstance(R.drawable.create5));

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
