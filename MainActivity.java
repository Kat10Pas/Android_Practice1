package com.mirea.pashkina.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView myTextView = (TextView) findViewById(R.id.textView3);
        Button myButton = findViewById(R.id.button13);
        CheckBox myCheckBox = findViewById(R.id.checkBox);
        myTextView.setText("New text in MIREA");
        myCheckBox.setChecked(true);
    }
}