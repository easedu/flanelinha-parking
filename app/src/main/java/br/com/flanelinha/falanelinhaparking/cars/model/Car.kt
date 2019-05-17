package br.com.flanelinha.falanelinhaparking.cars.model

@Entity
data class Car(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,
        val plate: String,
        val model: String
)