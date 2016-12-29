package com.salim3dd.change_mine_font;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    public static String Font = "font1.ttf";
    private SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        shared = getSharedPreferences("Setting", Context.MODE_PRIVATE);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Font = shared.getString("Font", "font1.ttf");
    }

    public void btn1(View view) {
        Font = "font1.ttf";
        saveFont();
    }

    public void btn2(View view) {
        Font = "font2.ttf";
        saveFont();
    }

    public void btn3(View view) {
        Font = "font_1.otf";
        saveFont();
    }

    public void btn4(View view) {
        Font = "font_2.otf";
        saveFont();
    }

    public void saveFont() {
        SharedPreferences.Editor editor = shared.edit();
        editor.putString("Font", Font);
        editor.apply();
        onResume();
    }
}
