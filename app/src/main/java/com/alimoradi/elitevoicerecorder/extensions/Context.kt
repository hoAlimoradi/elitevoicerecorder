package com.alimoradi.elitevoicerecorder.extensions

import android.content.Context
import com.alimoradi.elitevoicerecorder.helpers.Config

val Context.config: Config get() = Config.newInstance(applicationContext)
