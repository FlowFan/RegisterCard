package com.example.registercard;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvNickName;
    private TextView tvNumberShow;

    //SecondActivity显示数据
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("MainActivityLife", "调用onCreate()");

        initView();//初始化控件

        //获取MainActivity传递过来的数据
        Intent intent = getIntent();
        Log.i("MainActivityLife", "数据获取");
        String number = intent.getStringExtra("number");
        String nickName = intent.getStringExtra("nickName");

        //将获取到的数据显示到控件上
        tvNickName.setText("昵        称：" + nickName);
        tvNumberShow.setText("电话号码：" + number);
    }

    private void initView() {
        tvNickName = (TextView) findViewById(R.id.tv_nickName);
        tvNumberShow = (TextView) findViewById(R.id.tv_numberShow);
    }

}