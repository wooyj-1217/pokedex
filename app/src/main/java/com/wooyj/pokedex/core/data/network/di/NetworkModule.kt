package com.wooyj.pokedex.core.data.network.di

import com.wooyj.pokedex.core.data.network.NetworkPokedexDataSource
import com.wooyj.pokedex.core.data.network.retrofit.RetrofitPokedexNetwork
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    @Binds
    fun bindsNetwork(network: RetrofitPokedexNetwork): NetworkPokedexDataSource
}