package com.example.qcmprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Qustion4 extends AppCompatActivity implements View.OnClickListener {
    Button btn_Suiv;
    RadioGroup rg;
    RadioButton rb;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustion5);
        btn_Suiv = (Button) findViewById(R.id.btn_Suiv);
        rg = (RadioGroup) findViewById(R.id.radio);
        btn_Suiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Suiv:
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                if (rb.getText().toString().equals("Dubai")) {
                    score = getIntent().getExtras().getInt("score");
                    score = score + 1;
                }
                else
                {
                    score = getIntent().getExtras().getInt("score");
                }
                Intent i = new Intent(this, Qustion5.class);
                i.putExtra("score", score);
                startActivity(i);
        }

    }


    }
