package com.wooyj.pokedex.core.data.network.retrofit

import com.wooyj.pokedex.BuildConfig
import com.wooyj.pokedex.core.data.network.NetworkPokedexDataSource
import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Singleton
class RetrofitPokedexNetwork(/*@Dispatcher(PokedexDispatchers.IO) private val ioDispatcher: CoroutineDispatcher*/) :
    NetworkPokedexDataSource {

    private val CONNECT_TIMEOUT = 20L
    private val WRITE_TIMEOUT = 20L
    private val READ_TIMEOUT = 20L

    private val networkApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(
            OkHttpClient.Builder()
                .connectTimeout(
                    CONNECT_TIMEOUT,
                    TimeUnit.SECONDS
                )                                           // 연결 타임아웃 시간 설정
                .writeTimeout(
                    WRITE_TIMEOUT,
                    TimeUnit.SECONDS
                )                                               // 쓰기 타임아웃 시간 설정
                .readTimeout(
                    READ_TIMEOUT,
                    TimeUnit.SECONDS
                )                                                 // 읽기 타임아웃 시간 설정
                .addNetworkInterceptor(Interceptor { chain ->                                                // Add Header
                    val requestBuilder = chain.request().newBuilder()
                        .addHeader("Accept", "application/json")
                        .header("Content-Type", "application/json")
                    chain.proceed(requestBuilder.build())
                })
                .addInterceptor(
                    HttpLoggingInterceptor { message ->
                        if (message.length < 16 * 1024 * 1024) {
                            Timber.tag("NetworkModule : ").d(message)
                        }
                    }.setLevel(HttpLoggingInterceptor.Level.BODY)
                )                                                            // 로그 찍는 용도
                .build()
        )
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PokedexApi::class.java)

    override suspend fun getPokemonList(): Response<NetworkPokemonList> = networkApi.getPokemonList()


}