package com.dhana.cardview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class ListViewExample extends AppCompatActivity {

    private ListView listView;
    String[] elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.ListView);
        elements = getResources().getStringArray(R.array.Programing_Languages);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewExample.this,R.layout.items,R.id.txtProgram,elements);
        listView.setAdapter(adapter);

    }
}