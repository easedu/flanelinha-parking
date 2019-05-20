package br.com.flanelinhaparking.app.parkings.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Parking(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,
        var name: String,
        var address: String
)