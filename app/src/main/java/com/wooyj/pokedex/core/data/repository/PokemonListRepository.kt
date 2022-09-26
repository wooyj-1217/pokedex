package com.wooyj.pokedex.core.data.repository

import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import com.wooyj.pokedex.core.data.network.retrofit.RetrofitPokedexNetwork
import retrofit2.Response
import javax.inject.Inject

class PokemonListRepository @Inject constructor(
    private val retrofitPokedexNetwork: RetrofitPokedexNetwork
) {

    suspend fun getPokemonList() : Response<NetworkPokemonList> = retrofitPokedexNetwork.getPokemonList()

}