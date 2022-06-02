package com.example.q2displaystudentnameclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button submit;
    EditText a_name, a_marks;
    TextView v_name, v_marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.b1);
        a_name = findViewById(R.id.name);
        a_marks = findViewById(R.id.cl);



        v_name = findViewById(R.id.out2);
        v_marks = findViewById(R.id.out3);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v_name.setText("Name : " + a_name.getText());
                v_marks.setText("Marks : " + a_marks.getText());
            }
        });
    }
}