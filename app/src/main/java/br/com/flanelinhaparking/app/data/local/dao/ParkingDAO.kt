package br.com.flanelinhaparking.app.data.local.dao

import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import br.com.flanelinhaparking.app.parkings.model.Parking

@Dao
interface ParkingDAO {

    @Insert(onConflict = REPLACE)
    fun insert(parking: Parking)

    @Query("SELECT * FROM parking")
    fun loadParkings(): List<Parking>

    @Update
    fun update(parking: Parking)

    @Delete
    fun delete(parking: Parking)

}
