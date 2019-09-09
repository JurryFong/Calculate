package com.exampl.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText frist_et;
    EditText second_et;
    TextView result_tv;
    Button jia_bt;
    Button jian_bt;
    Button chen_bt;
    Button chu_bt;

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //一个数字框
        frist_et = findViewById(R.id.frist);
        //二个数字框
        second_et = findViewById(R.id.second);
        //结果数字框
        result_tv = findViewById(R.id.result);
        //加数字框
        jia_bt = findViewById(R.id.jia);
        jia_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一个数字
                String frist = frist_et.getText().toString();
                //第二个数字
                String second = second_et.getText().toString();
                if (TextUtils.isEmpty(frist)) {
                    Toast.makeText(HomeActivity.this, "请输入第一个数字", Toast.LENGTH_LONG).show();
                } else if (TextUtils.isEmpty(second)) {
                    Toast.makeText(HomeActivity.this, "请输入第二个数字", Toast.LENGTH_LONG).show();
                } else {
                    /**
                     * 第一个数字框里的字符串转化为整形
                     */
                    Double fristint = Double.parseDouble(frist);
                    /**
                     * 第二数字框里的字符串转化为整形
                     */
                    Double secondint = Double.parseDouble(second);

                    /**
                     * 计算结果
                     */
                    Double result = fristint + secondint;
                    result_tv.setText("计算结果：" + result);


                }
            }
        });
        //减数字框
        jian_bt = findViewById(R.id.jian);
        jian_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一个数字
                String frist = frist_et.getText().toString();
                //第二个数字
                String second = second_et.getText().toString();
                if (TextUtils.isEmpty(frist)) {
                    Toast.makeText(HomeActivity.this, "请输入第一个数字", Toast.LENGTH_LONG).show();
                } else if (TextUtils.isEmpty(second)) {
                    Toast.makeText(HomeActivity.this, "请输入第二个数字", Toast.LENGTH_LONG).show();
                } else {
                    /**
                     * 第一个数字框里的字符串转化为整形
                     */
                    Double fristint = Double.parseDouble(frist);
                    /**
                     * 第二数字框里的字符串转化为整形
                     */
                    Double secondint = Double.parseDouble(second);

                    /**
                     * 计算结果
                     */
                    Double result = fristint - secondint;
                    result_tv.setText("计算结果：" + result);
                }

            }
        });
        //乘数字框
        chen_bt = findViewById(R.id.chen);
        chen_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一个数字
                String frist = frist_et.getText().toString();
                //第二个数字
                String second = second_et.getText().toString();
                if (TextUtils.isEmpty(frist)) {
                    Toast.makeText(HomeActivity.this, "请输入第一个数字", Toast.LENGTH_LONG).show();
                } else if (TextUtils.isEmpty(second)) {
                    Toast.makeText(HomeActivity.this, "请输入第二个数字", Toast.LENGTH_LONG).show();
                } else {
                    /**
                     * 第一个数字框里的字符串转化为整形
                     */
                    Double fristint = Double.parseDouble(frist);
                    /**
                     * 第二数字框里的字符串转化为整形
                     */
                    Double secondint = Double.parseDouble(second);

                    /**
                     * 计算结果
                     */
                    Double result = fristint * secondint;
                    result_tv.setText("计算结果：" + result);
                }

            }
        });
        //除数字框
        chu_bt = findViewById(R.id.chu);
        chu_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一个数字
                String frist = frist_et.getText().toString();
                //第二个数字
                String second = second_et.getText().toString();
                if (TextUtils.isEmpty(frist)) {
                    Toast.makeText(HomeActivity.this, "请输入第一个数字", Toast.LENGTH_LONG).show();
                } else if (TextUtils.isEmpty(second)) {
                    Toast.makeText(HomeActivity.this, "请输入第二个数字", Toast.LENGTH_LONG).show();
                } else {
                    /**
                     * 第一个数字框里的字符串转化为整形
                     */
                    Double fristint = Double.parseDouble(frist);
                    /**
                     * 第二数字框里的字符串转化为整形
                     */
                    Double secondint = Double.parseDouble(second);

                    /**
                     * 计算结果
                     */
                    Double result = fristint / secondint;
                    result_tv.setText("计算结果：" + result);
                }

            }
        });
    };
};