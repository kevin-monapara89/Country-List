package com.example.countrylist

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("all")
    fun getcountry():Call<List<CountryModel>>

    @GET("all")
    fun searchname(
        @Query("name") name: String
    ):Call<List<CountryModel>>
}