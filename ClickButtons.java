package com.mirea.pashkina.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickButtons extends AppCompatActivity {

    TextView tw;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);
        tw = (TextView) findViewById(R.id.textView);
        btnOk = findViewById(R.id.button);
        btnCancel = findViewById(R.id.button2);

        View.OnClickListener oclBtnOk = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tw.setText("Нажата кнопка ОК");
            }
        };
        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tw.setText("Нажата кнопка Cancel");
            }
        };

        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);
    }

//    public void onMyButtonClick(View view) {
//        Toast.makeText(this, )
//    }
}