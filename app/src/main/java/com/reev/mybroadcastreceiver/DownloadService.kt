@file:Suppress("DEPRECATION")

package com.reev.mybroadcastreceiver

import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class DownloadService : JobIntentService() {

    companion object {
        val TAG: String = DownloadService::class.java.simpleName
    }

    override fun onHandleWork(intent: Intent) {
        Log.d(TAG, "Download Service dijalankan")
        try {
            Thread.sleep(5000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        val notifyFinishIntent = Intent(MainActivity.ACTION_DOWNLOAD_STATUS)
        sendBroadcast(notifyFinishIntent)
    }
}