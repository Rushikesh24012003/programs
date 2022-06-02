package com.example.q7displaypersonalinfoofstudents;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText  a_roll, a_name, a_class, a_div;
    TextView v_roll, v_name, v_class, v_div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit = findViewById(R.id.b1);
        a_roll = findViewById(R.id.roll);
        a_name = findViewById(R.id.name);
        a_class = findViewById(R.id.cl);
        a_div = findViewById(R.id.div);

        v_roll = findViewById(R.id.out1);
        v_name = findViewById(R.id.out2);
        v_class = findViewById(R.id.out3);
        v_div = findViewById(R.id.out4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v_roll.setText("Roll no : "+a_roll.getText());
                v_name.setText("Name : "+a_name.getText());
                v_class.setText("Class : "+a_class.getText());
                v_div.setText("Div : "+a_div.getText());
            }
        });

    }
}