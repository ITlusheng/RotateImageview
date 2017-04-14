package com.example.edwin.rotateimageview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ffffffffffff
        //测试结果
        initUI();

        initData();

        Handler handler = new Handler();
    }

    private void initData() {
    }

    private void initUI() {

        Toast.makeText(this,"123",Toast.LENGTH_SHORT).show();
    }
}
