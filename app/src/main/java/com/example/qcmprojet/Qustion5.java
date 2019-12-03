package com.example.qcmprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Qustion5 extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rg;
    RadioButton rb;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustion5);
        rg = (RadioGroup) findViewById(R.id.radio);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_Suiv:
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                if (rb.getText().toString().equals("Rome")) {
                    score = getIntent().getExtras().getInt("score");
                    score = score + 1;

                }
                else
                {
                    score = getIntent().getExtras().getInt("score");
                }

                Toast.makeText(this,String.valueOf(score),Toast.LENGTH_LONG).show();
        }



    }
}

