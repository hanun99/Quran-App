package com.Hanun.quran.network.di

import android.content.Context
import com.Hanun.quran.local.CalendarPreferences
import com.Hanun.quran.local.LocationPreferences
import com.Hanun.quran.network.ApiConfig
import com.Hanun.quran.network.quran.QuranRepository
import com.Hanun.quran.network.RemoteDataSource
import com.Hanun.quran.network.adzan.AdzanRepository

object Injection {
    private val quranApiService = ApiConfig.getQuranService
    private val adzanApiService = ApiConfig.getAdzanTimeService
    private val remoteDataSource = RemoteDataSource(quranApiService, adzanApiService)
    fun provideQuranRepository(): QuranRepository {
        return QuranRepository(remoteDataSource)
    }

    fun provideAdzanRepository(context: Context): AdzanRepository {
        val locationPreferences = LocationPreferences(context)
        val calendarPrefrences = CalendarPreferences()
        return AdzanRepository(remoteDataSource, locationPreferences, calendarPrefrences)
    }
}