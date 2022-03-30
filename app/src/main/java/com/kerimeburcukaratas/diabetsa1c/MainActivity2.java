package com.kerimeburcukaratas.diabetsa1c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    TextView result,result2;
    EditText field1,field2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        field1 = findViewById(R.id.field1);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (field1.getText().toString().equals("")) {
                    result.setText("Lütfen tüm alanları doldurunuz.");
                }
                else {
                    float input = Float.parseFloat(field1.getText().toString());
                    String data = String.valueOf(input);
                    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                    intent.putExtra("data",data);
                    startActivity(intent);
                }
            }
        });
        }
}