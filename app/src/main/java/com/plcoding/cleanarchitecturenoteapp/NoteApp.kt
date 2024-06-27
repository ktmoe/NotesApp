package com.plcoding.cleanarchitecturenoteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by ktmmoe on 26, September, 2021
 **/
@HiltAndroidApp
class NoteApp: Application() {
    // Added this line
    // to create conflict
}