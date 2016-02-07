package com.example.salah.simplelistviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WeatherInfoActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView cloudTextView;
    private TextView rainTextView;
    private Button phoneTextView;
    private Button emailTextView;

    private void setSelectedWeatherInfo(WeatherInfo weatherInfo) {
        nameTextView.setText(weatherInfo.getName());
        cloudTextView.setText(weatherInfo.getCloud());
        rainTextView.setText(weatherInfo.getRain());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_info);

        nameTextView = (TextView) findViewById(R.id.information_center_name);
        cloudTextView = (TextView) findViewById(R.id.information_center_address);
        rainTextView = (TextView) findViewById(R.id.information_center_fax);
        phoneTextView = (Button) findViewById(R.id.information_center_phone);
        emailTextView = (Button) findViewById(R.id.information_center_email);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            WeatherInfo weatherInfo
                    = (WeatherInfo) intent.getSerializableExtra("selected-item");
            setSelectedWeatherInfo(weatherInfo);
        }
    }
}
