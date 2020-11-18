package com.app.base.mainapp.modules

import com.app.base.mainapp.BuildConfig
import com.app.base.mainapp.data.source.remote.ApiErrorHandle
import com.app.base.mainapp.data.source.remote.ApiInterface
import com.app.base.mainapp.utils.preferences.PreferencesDataSource
import com.app.base.mainapp.utils.preferences.PreferencesDataSource.Keys.MSIDN
import com.app.base.mainapp.utils.preferences.PreferencesDataSource.Keys.USER_TOKEN
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val NetworkModule = module {

    single { createService(get()) }

    single { createRetrofit(get(), BuildConfig.BASE_URL) }

    single { createOkHttpClient(get()) }


}

fun createOkHttpClient(sharedPrefDataSource: PreferencesDataSource): OkHttpClient {
    val interceptor = HttpLoggingInterceptor()
    if (BuildConfig.IS_DEBUG) {
        interceptor.level = HttpLoggingInterceptor.Level.BODY
    }
    return OkHttpClient.Builder()
        .readTimeout(60, TimeUnit.SECONDS)
        .connectTimeout(60, TimeUnit.SECONDS)
        .addInterceptor { chain ->
            val requestBuilder = chain.request().newBuilder()
            sharedPrefDataSource.getString(USER_TOKEN)?.let {
                val token = "${sharedPrefDataSource.getString(USER_TOKEN)}"
                requestBuilder.addHeader("_csrftoken", token)
            }
            sharedPrefDataSource.getString(MSIDN)?.let {
                val msisdn = "${sharedPrefDataSource.getString(MSIDN)}"
                requestBuilder.addHeader("msisdn", msisdn)
            }
            requestBuilder.addHeader("Content-Type", "application/json")
            requestBuilder.addHeader("Accept", "application/json")
            requestBuilder.addHeader("custom_header", "pre_prod")
            chain.proceed(requestBuilder.build())
        }
        .addInterceptor(interceptor)
//            .certificatePinner(certificatePinner)
        .build()
}

fun createRetrofit(okHttpClient: OkHttpClient, url: String): Retrofit {
    return Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun createService(retrofit: Retrofit): ApiInterface {
    return retrofit.create(ApiInterface::class.java)
}

fun createApiErrorHandle(): ApiErrorHandle {
    return ApiErrorHandle()
}