package com.dhana.cardview;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    CardView cardViewC,cardViewPyhton,cardViewBlock,cardViewCPlus,cardViewJava,cardViewCyber;
    TextView textView;
    TabLayout tabLayout;
    LinearLayout RoadMap;
    LinearLayout CourseLay;

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

        tabLayout = findViewById(R.id.Tablayoutmain);

        RoadMap = findViewById(R.id.RoadmapLayoutMain);
        CourseLay = findViewById(R.id.CourseLayout);

        textView = findViewById(R.id.txtCourse);

        tabLayout.addTab(tabLayout.newTab().setText("ROADMAPS"));
        tabLayout.addTab(tabLayout.newTab().setText("COURSES"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        setVisible(RoadMap,CourseLay);
                        break;
                    case 1:
                        setVisible(CourseLay,RoadMap);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



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

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("WELCOME");
            }
        });

    }

    private void setVisible(LinearLayout roadMap, LinearLayout courseLay) {
        roadMap.setVisibility(RoadMap.VISIBLE);
        courseLay.setVisibility(CourseLay.GONE);
    }

    public void Course(){
        Intent intent = new Intent(this,Cyber_Security.class);
        startActivity(intent);
    }
    //
}