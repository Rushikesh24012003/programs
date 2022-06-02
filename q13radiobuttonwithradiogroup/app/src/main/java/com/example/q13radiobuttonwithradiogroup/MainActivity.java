package com.example.q13radiobuttonwithradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button show = findViewById(R.id.show);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                RadioButton rb1 = findViewById(R.id.rb1);
                RadioButton rb2 = findViewById(R.id.rb2);
                RadioGroup rg = findViewById(R.id.gender);
                int checkedRadio = rg.getCheckedRadioButtonId();
                RadioButton rb3 = findViewById(checkedRadio);

//                Single Radio Buttons
                if (rb1.isChecked() && rb2.isChecked()){
                    Toast.makeText(MainActivity.this, rb1.getText()+" and "+rb2.getText()+" are Selected in  Radio Buttons", Toast.LENGTH_SHORT).show();
                }else {
                    if (rb1.isChecked()) {
                        Toast.makeText(MainActivity.this, rb1.getText().toString() + " is Selected in  Radio Buttons", Toast.LENGTH_SHORT).show();
                    }
                    if (rb2.isChecked()) {
                        Toast.makeText(MainActivity.this, rb2.getText().toString() + " is Selected in  Radio Buttons", Toast.LENGTH_SHORT).show();
                    }
                }
//                  Radio Button Group
                Toast.makeText(MainActivity.this, rb3.getText().toString()+" is Selected in RadioGroup", Toast.LENGTH_SHORT).show();

            }
        });
    }
}