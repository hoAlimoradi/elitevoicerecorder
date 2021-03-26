package com.alimoradi.elitevoicerecorder.interfaces

import com.alimoradi.elitevoicerecorder.models.Recording

interface RefreshRecordingsListener {
    fun refreshRecordings()

    fun playRecording(recording: Recording, playOnPrepared: Boolean)
}
