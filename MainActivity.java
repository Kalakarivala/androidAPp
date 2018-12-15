package com.prince.wifiexample;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button on=findViewById(R.id.on);
        Button off=findViewById(R.id.off);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wifiManager(true);
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wifiManager(false);
            }
        });
    }
    public void wifiManager(Boolean mode){
        WifiManager wifiManager= (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(mode);
        Toast.makeText(this,"WiFi "+mode,Toast.LENGTH_LONG).show();
    }
}
