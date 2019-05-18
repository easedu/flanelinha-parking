package br.com.flanelinha.falanelinhaparking.data.local.dao

import android.arch.lifecycle.LiveData


@Dao
interface CarDAO {

    @Insert(onConflict = REPLACE)
    fun save(car: Car)

    @Query("SELECT * FROM car")
    fun loadCars(): LiveData<List<Car>>

    @Update
    fun update(car: Car)

    @Delete
    fun delete(car: Car)

}
