package com.klk.mobilefingerprint.helpers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

public class AlarmHelper {

    private static final String TAG = AlarmHelper.class.getSimpleName();

    public  AlarmHelper(){}

    public void setAlarm(Context mContext, Class javaClass, long interval, Calendar calendar){
        Intent intent = new Intent(mContext, javaClass);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(mContext, 0, intent, 0);
        AlarmManager alarm = (AlarmManager) mContext.getSystemService(Context.ALARM_SERVICE);
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), interval, pendingIntent);
    }
}
