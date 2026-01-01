package com.whitefury.tap

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class CommandReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "whitefury.tap") {
            val x = intent.getIntExtra("x", 0)
            val y = intent.getIntExtra("y", 0)
            WhiteFuryServiceHolder.service?.tap(x, y)
        }
    }
}
