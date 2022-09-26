package com.wooyj.pokedex.core.data.network

import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import retrofit2.Response

interface NetworkPokedexDataSource {

    suspend fun getPokemonList() : Response<NetworkPokemonList>

}