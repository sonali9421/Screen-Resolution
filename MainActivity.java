package com.example.mysqlconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView lst_main;
    ArrayList<String> arrays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst_main = (GridView)findViewById(R.id.lst_main);
        arrays = new ArrayList<>();
        arrays.add("Computer Science");
        arrays.add("Electronic");
        arrays.add("Animation");
        arrays.add("Mechanic");

        CourseListAdapter adapter = new SubjectListAdapter(MainActivity.this,arrays);
        lst_main.setAdapter(adapter);
    }
}
