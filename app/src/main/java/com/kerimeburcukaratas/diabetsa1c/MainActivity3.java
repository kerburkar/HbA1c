package com.kerimeburcukaratas.diabetsa1c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView sonuc1,sonuc2,yapilacaklar2,yapilacaklar;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        float input = Float.parseFloat(data.toString());
        sonuc1 = findViewById(R.id.sonuc1);
        sonuc2 = findViewById(R.id.sonuc2);
        yapilacaklar = findViewById(R.id.yapilacaklar);
        yapilacaklar2 = findViewById(R.id.yapilacaklar2);

        DecimalFormat formatter = new DecimalFormat("##.###");
        sonuc2.setText("HbA1c Değeriniz: "+data+"%");
        sonuc1.setText("Kan Şekeri Değeriniz: "+String.format("%.1f",(28.7*input-46.7)));

        if(input>=0 && input <=6){
            yapilacaklar.setText("Çok iyi gidiyorsunuz. Tebrikler!");
            yapilacaklar2.setText("Çok iyi kontrol ediliyor.");
        }
        else if(input>6 && input <=8){
            yapilacaklar.setText("Su tüketimine özen gösterin.\nDiyetinizi ve egzersizlerinizi gözden geçirin.\nBir sorun olduğunu düşünüyorsanız doktorunuz ile görüşün.");
            yapilacaklar2.setText("Dikkat etmeli.");
        }
        else if (input>8){
            yapilacaklar.setText("En kısa sürede doktorunuz ile görüşün!");
            yapilacaklar2.setText("Riskli");
        }
        else
            yapilacaklar.setText("Girdiğiniz veriyi kontrol ediniz.");
    }
}