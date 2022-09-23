package com.wooyj.pokedex.core.network

import com.wooyj.pokedex.core.network.model.NetworkPokemonList

interface NetworkPokedexDataSource {

    suspend fun getPokemonList() : NetworkPokemonList

}