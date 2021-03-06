package com.testnetdeve.custom.sensor;

import com.testnetdeve.custom.alarmhandle.BuildAlarm;
import com.testnetdeve.custom.client.Client;

public class GasSensor extends Sensor {
    private String name = "GasSensor";
    private SensorEventListener sensorEventListener;


    public GasSensor() {
        this.sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged() {
                //Client.getChannel().writeAndFlush(BuildAlarm.buildReqAlarmMessage("1,2,101,2"));
            }
        };
    }

    @Override
    public void addListener(SensorEventListener listener) {
        this.sensorEventListener = listener;
    }

    @Override
    public void eventHappen(boolean happen) {

        if (happen){
            sensorEventListener.onSensorChanged();
        }
    }
}
