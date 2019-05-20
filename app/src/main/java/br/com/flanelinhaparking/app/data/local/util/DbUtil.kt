package br.com.flanelinhaparking.app.data.local.util

import android.content.Context
import br.com.flanelinhaparking.app.parkings.model.Parking
import br.com.flanelinhaparking.app.data.local.MyDatabase
import io.reactivex.Observable

class DbUtil(context: Context) {

    private val database: MyDatabase = MyDatabase
            .getInstance(context.applicationContext)!!
    private val parkingDao = database.parkingDao()

    fun insertParking(parking: Parking): Observable<Boolean> {
        return Observable.fromCallable({
            parkingDao.insert(parking)
            true
        })
    }

    fun deleteParking(parking: Parking): Observable<Boolean> {
        return Observable.fromCallable({
            parkingDao.delete(parking)
            true
        })
    }

    fun updateParking(parking: Parking): Observable<Boolean> {
        return Observable.fromCallable({
            parkingDao.update(parking)
            true
        })
    }

    fun loadParkings(): Observable<List<Parking>> {
        return Observable.fromCallable({
            parkingDao.loadParkings()
        })
    }

}