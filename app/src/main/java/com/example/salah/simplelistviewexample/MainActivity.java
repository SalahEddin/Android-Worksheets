package com.example.salah.simplelistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.my_list_view);


        ArrayAdapter arrayAdapter = new
                ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                WeatherInfo.DummyWeatherInfo);

        listView.setAdapter(arrayAdapter);

    }
}
