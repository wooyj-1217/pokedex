package com.wooyj.pokedex.core.data.network.retrofit

import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import retrofit2.Response
import retrofit2.http.GET

interface PokedexApi {

    @GET(value = "pokemon?limit=151&offset=0")
    suspend fun getPokemonList() : Response<NetworkPokemonList>

}