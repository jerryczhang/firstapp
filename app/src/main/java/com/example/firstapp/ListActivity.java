package com.example.firstapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);

        myListView.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));
    }
}
