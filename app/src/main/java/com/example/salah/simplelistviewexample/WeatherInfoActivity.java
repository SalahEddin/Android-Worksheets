package com.example.salah.simplelistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WeatherInfoActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView addressTextView;
    private TextView faxTextView;
    private Button phoneTextView;
    private Button emailTextView;

    private void setSelectedInformationCenter(WeatherInfo weatherInfo) {
        nameTextView.setText(weatherInfo.getName());
        addressTextView.setText(weatherInfo.getCloud());
        faxTextView.setText(weatherInfo.getRain());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_info);

        nameTextView = (TextView) findViewById(R.id.information_center_name);
        addressTextView = (TextView) findViewById(R.id.information_center_address);
        faxTextView = (TextView) findViewById(R.id.information_center_fax);
        phoneTextView = (Button) findViewById(R.id.information_center_phone);
        emailTextView = (Button) findViewById(R.id.information_center_email);
    }
}
