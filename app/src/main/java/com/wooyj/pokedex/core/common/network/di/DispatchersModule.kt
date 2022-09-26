package com.wooyj.pokedex.core.common.network.di

import com.wooyj.pokedex.core.common.network.Dispatcher
import com.wooyj.pokedex.core.common.network.PokedexDispatchers
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers


@Module
@InstallIn(SingletonComponent::class)
class DispatchersModule {

    @Provides
    @Dispatcher(PokedexDispatchers.IO)
    fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO

}