package com.callonlines.admin

import android.app.Application
import com.google.android.material.color.DynamicColors

class CallOnLinesAdminApp : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}
