package com.practioce.a210717followhongdroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt2=findViewById(R.id.bt2);

        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(bt2)){
            setContentView(R.layout.activity_edit_text);
        }
    }
}