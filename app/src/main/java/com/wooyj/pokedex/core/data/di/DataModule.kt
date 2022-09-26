package com.wooyj.pokedex.core.data.di

import com.wooyj.pokedex.core.data.network.retrofit.RetrofitPokedexNetwork
import com.wooyj.pokedex.core.data.repository.PokemonListRepository
import com.wooyj.pokedex.core.data.repository.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
//object DataModule {
//
//    @Provides
//    fun providesPokemonListRepository(retrofitPokedexNetwork: RetrofitPokedexNetwork): PokemonListRepository =
//        PokemonListRepository(retrofitPokedexNetwork)
interface DataModule{

    @Binds
    fun bindPokemonListRepository(pokemonListRepository: PokemonListRepository) : PokemonRepository

}