package com.Hanun.quran.network.adzan

import com.Hanun.quran.network.Resource

data class AdzanDataResult(
    val listLocation: List<String>,
    val dailyAdzan: Resource<DailyAdzan>,
    val listCalendar: List<String>
)
