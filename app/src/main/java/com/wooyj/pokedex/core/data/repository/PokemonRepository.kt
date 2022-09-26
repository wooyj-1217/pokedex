package com.wooyj.pokedex.core.data.repository

import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface PokemonRepository {

    suspend fun getPokemonList() : Response<NetworkPokemonList>

}