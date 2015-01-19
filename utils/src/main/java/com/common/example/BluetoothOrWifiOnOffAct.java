package com.common.example;
/**
 * @author Y@$!n
 *
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.common.utils.Common;
import com.common.utils.R;

public class BluetoothOrWifiOnOffAct extends Activity {
    Context mContext;
    Button btnBluetoothOnOff, btnWifiOnOff;
    Boolean isBluetooth = true, isWifi = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetooth_on_off);
        mContext = BluetoothOrWifiOnOffAct.this;
        init();

    }

    private void init() {
        // TODO Auto-generated method stub

        btnBluetoothOnOff = (Button) findViewById(R.id.btnBluetoothOnOff);
        btnWifiOnOff = (Button) findViewById(R.id.btnWifiOnOff);
        btnBluetoothOnOff.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (isBluetooth) {
                    Common.onBlueTooth("on");
                    btnBluetoothOnOff.setText("Bluetooth On");
                    isBluetooth = false;
                } else {
                    Common.onBlueTooth("off");
                    isBluetooth = true;
                    btnBluetoothOnOff.setText("Bluetooth Off");
                }
            }
        });

        btnWifiOnOff.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (isWifi) {
                    Common.onWifi(mContext, "on");
                    btnWifiOnOff.setText("Wifi On");
                    isWifi = false;
                } else {
                    Common.onWifi(mContext, "off");
                    btnWifiOnOff.setText("Wifi Off");
                    isWifi = true;
                }

            }
        });

    }
}
