package com.dhana.cardview;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewExample extends AppCompatActivity {
    String[] programing;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.GridviewGrid);
        programing = getResources().getStringArray(R.array.Programing_Languages);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.grid_images,R.id.gridImage,programing);
        gridView.setAdapter(adapter);
    }
}