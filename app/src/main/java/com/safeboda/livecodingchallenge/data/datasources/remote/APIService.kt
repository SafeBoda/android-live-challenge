package com.safeboda.livecodingchallenge.data.datasources.remote

import com.safeboda.livecodingchallenge.data.entities.APIResponseWrapper
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.publicapis.org/"

interface APIService {
    @GET("entries")
    suspend fun getPublicAPIs() : APIResponseWrapper

    companion object {
        fun create(): APIService {
            val logger = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(APIService::class.java)
        }
    }
}