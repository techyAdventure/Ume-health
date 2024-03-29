package com.example.mhealthapp;

import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

class AlarmReceiver {

    public void onReceive(Context context, Intent intent) {

        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());
    }
}
