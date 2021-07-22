package com.savelov.filmicpro.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.savelov.filmicpro.data.Entity.Film
import com.savelov.filmicpro.view.notifications.NotificationConstants
import com.savelov.filmicpro.view.notifications.NotificationHelper

class ReminderBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val bundle = intent?.getBundleExtra(NotificationConstants.FILM_BUNDLE_KEY)
        val film: Film = bundle?.get(NotificationConstants.FILM_KEY) as Film

        NotificationHelper.createNotification(context!!, film)
    }
}