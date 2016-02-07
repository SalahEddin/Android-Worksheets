package com.example.salah.simplelistviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, WeatherInfo.DummyWeatherInfo[position].getName() + " was selected", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, WeatherInfoActivity.class);
                // pass over the selected item as payload in the intent
//                intent.putExtra("selected-item",
//                        WeatherInfo.DummyWeatherInfo[position]);

                startActivity(intent);
            }
        });

    }
}
