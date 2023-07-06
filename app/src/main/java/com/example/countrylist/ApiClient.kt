package com.example.countrylist

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {

        val Base_Url = "https://restcountries.com/v2/"
        var retrofit : Retrofit? = null

        fun getApiClient() : Retrofit {
            if (retrofit == null) {
               retrofit = Retrofit.Builder()
                   .baseUrl(Base_Url)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build()
            }
            return retrofit!!
        }
    }
}
