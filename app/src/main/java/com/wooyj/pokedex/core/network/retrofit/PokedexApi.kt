package com.wooyj.pokedex.core.network.retrofit

import com.wooyj.pokedex.core.network.model.NetworkPokemonList
import retrofit2.http.GET

interface PokedexApi {

    @GET(value = "pokemon?limit=151&offset=0")
    suspend fun getPokemonList() : NetworkPokemonList

}