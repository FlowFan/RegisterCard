package com.example.registercard;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtTXTNumber;
    private EditText edtTXTNickName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife", "调用onCreate()");
        initView();//初始化控件
    }

    private void initView() {
        edtTXTNumber = (EditText) findViewById(R.id.edtTxt_number);
        edtTXTNickName = (EditText) findViewById(R.id.edtTxt_nickName);
    }

    //点击注册按钮
    public void register(View view) {
        //获取手机号码与昵称
        String number = edtTXTNumber.getText().toString().trim();
        String nickName = edtTXTNickName.getText().toString().trim();

        //手机号码和昵称均不可为空
        if (TextUtils.isEmpty(number) || TextUtils.isEmpty(nickName)) {
            Toast.makeText(this, "选项不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        //将数据传递给SecondActivity
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("number", number);
        intent.putExtra("nickName", nickName);
        Log.i("MainActivityLife", "数据传递");
        startActivity(intent);
        Log.i("MainActivityLife", "跳转到SecondActivity");
    }
}
