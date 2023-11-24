package com.Hanun.quran.presentation.adzan

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.Hanun.quran.network.Resource
import com.Hanun.quran.network.adzan.AdzanDataResult
import com.Hanun.quran.network.adzan.AdzanRepository

class AdzanViewModel(
    private val adzanRepository: AdzanRepository
) : ViewModel()  {
    fun getDailyAdzanTime():
            LiveData<Resource<AdzanDataResult>> = adzanRepository
                .getResultDailyAdzanTime()
}