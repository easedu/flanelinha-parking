package br.com.flanelinhaparking.app.parkings.ui.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.Context
import br.com.flanelinhaparking.app.R
import br.com.flanelinhaparking.app.parkings.model.Parking
import br.com.flanelinhaparking.app.common.util.DialogUtil
import br.com.flanelinhaparking.app.data.local.util.DbUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executors

class ParkingViewModel(val context: Context): ViewModel() {

    private val dbUtil = DbUtil(context)
    private val executor = Executors.newSingleThreadExecutor()
    private var dispose: Disposable? = null

    var parkings: MutableLiveData<List<Parking>> =  MutableLiveData()

    fun loadParkings() {
        dbUtil.loadParkings()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    this.parkings.setValue(it)
                })
    }

    fun insertParkings(parking: Parking){
        executor.execute {
            dbUtil.insertParking(parking)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({
                        if(it){
                            DialogUtil.showMessageDialog(context, context.resources.getString(R.string.message_success_register))
                            loadParkings()
                        }
                    })
        }
    }

    fun updateParking(parking: Parking){
        executor.execute {
            dbUtil.updateParking(parking)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({
                        if(it){
                            DialogUtil.showMessageDialog(context, context.resources.getString(R.string.message_success_update))
                            loadParkings()
                        }
                    })
        }
    }

    fun deleteParking(parking: Parking?){
        executor.execute {
            parking?.let {
                dbUtil.deleteParking(it)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe({
                            if(it){
                                DialogUtil.showMessageDialog(context, context.resources.getString(R.string.message_success_delete))
                                loadParkings()
                            }
                        })
            }
        }
    }

    fun dispose(){
        dispose?.dispose()
    }
}
