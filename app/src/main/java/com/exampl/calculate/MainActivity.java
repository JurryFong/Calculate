package com.exampl.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String UserString;
    String PassString;
    EditText Username;
    EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //用户名
        Username = findViewById(R.id.UserName);
        //密码
        Password = findViewById(R.id.Password);

        //登录界面
        Button Login = findViewById(R.id.Login_Btn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获取用户名输入框的输入的内容
                UserString = Username.getText().toString();
                //获取密码输入框的驶入内容
                PassString = Password.getText().toString();

                //判断用户和密码不能为空
                if(TextUtils.isEmpty(UserString)){
                    Toast.makeText(MainActivity.this,"请输入用户名",Toast.LENGTH_LONG).show();


                }else if (TextUtils.isEmpty(PassString)) {
                    Toast.makeText(MainActivity.this,"请输入密码",Toast.LENGTH_LONG).show();

                }else if (!UserString.equals("admin")){
                    Toast.makeText(MainActivity.this,"用户名错误",Toast.LENGTH_LONG).show();
                }else if (!PassString.equals("123")){
                    Toast.makeText(MainActivity.this,"密码错误",Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(new Intent(MainActivity.this,HomeActivity.class));
                }
            }
        });













    }
 //   public void  Login(View Login){
 //       startActivity(new Intent(this,HomeActivity.class));
 //   }
}
