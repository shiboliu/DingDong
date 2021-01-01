package com.example.dingdong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dingdong.R;

public class MyAppIntroFragment extends Fragment {

    private View view;
    private ImageView img;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        view = inflater.inflate(R.layout.fragment_app_intro,container, false);
        img = view.findViewById(R.id.img);
        img.setImageDrawable(getResources().getDrawable(args.getInt("imgId")));
        return view;
    }

    public static Fragment newInstance(int imgId){
        MyAppIntroFragment myAppIntroFragment = new MyAppIntroFragment();
        Bundle args = new Bundle();
        args.putInt("imgId", imgId);
        myAppIntroFragment.setArguments(args);
        return myAppIntroFragment;
    }

}
