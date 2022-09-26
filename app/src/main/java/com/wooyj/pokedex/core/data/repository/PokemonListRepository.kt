package com.wooyj.pokedex.core.data.repository

import com.wooyj.pokedex.core.common.network.Dispatcher
import com.wooyj.pokedex.core.common.network.PokedexDispatchers
import com.wooyj.pokedex.core.data.network.NetworkPokedexDataSource
import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import com.wooyj.pokedex.core.data.network.retrofit.RetrofitPokedexNetwork
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class PokemonListRepository @Inject constructor(
    private val networkPokedexDataSource: NetworkPokedexDataSource,
    @Dispatcher(PokedexDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    ):PokemonRepository {

    //    suspend fun getPokemonList() : Response<NetworkPokemonList> = networkPokedexDataSource.getPokemonList()
    override suspend fun getPokemonList(): Response<NetworkPokemonList> = networkPokedexDataSource.getPokemonList()

}