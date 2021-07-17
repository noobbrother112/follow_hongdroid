package com.practioce.a210717followhongdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editText extends AppCompatActivity {
    EditText et_id;
    Button bt_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        et_id=findViewById(R.id.et_id);
        bt_bt=findViewById(R.id.bt_bt);

        bt_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_id.setText("아이디 못 넣지롱");
            }
        });
    }
}