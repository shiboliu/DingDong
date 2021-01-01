package com.example.dingdong;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dingdong.activity.AppIntroActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if (sharedPreferences.getBoolean("flag", false)){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("flag", true);
            editor.apply();
            Intent intent = new Intent(MainActivity.this, AppIntroActivity.class);
            startActivity(intent);
        }




    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}