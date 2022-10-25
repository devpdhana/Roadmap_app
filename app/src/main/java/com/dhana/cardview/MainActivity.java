package com.dhana.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cardViewC,cardViewPyhton,cardViewBlock,cardViewCPlus,cardViewJava,cardViewCyber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewC = findViewById(R.id.C_Card);
        cardViewPyhton = findViewById(R.id.Card_Python);
        cardViewBlock = findViewById(R.id.Card_block);
        cardViewCPlus = findViewById(R.id.Card_CPlus);
        cardViewJava = findViewById(R.id.Card_Java);
        cardViewCyber = findViewById(R.id.Card_Cybercurity);

        cardViewC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,C_Programing.class);
                startActivity(intent);
            }
        });

        cardViewCPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,C_PlusPlus.class);
                startActivity(intent);
            }
        });

        cardViewJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Java.class);
                startActivity(intent);
            }
        });

        cardViewPyhton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Python.class);
                startActivity(intent);
            }
        });

        cardViewBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Block_Chain.class);
                startActivity(intent);
            }
        });

        cardViewCyber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Cyber_Security.class);
                startActivity(intent);
            }
        });

    }
}