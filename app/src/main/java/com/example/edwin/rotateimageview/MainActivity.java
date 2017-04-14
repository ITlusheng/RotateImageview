package com.example.edwin.rotateimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ffffffffffff
        //测试结果
        initUI();
    }

    private void initUI() {

        Toast.makeText(this,"123",Toast.LENGTH_SHORT).show();
    }
}
