package com.wooyj.pokedex.core.data.repository

import com.wooyj.pokedex.core.network.NetworkPokedexDataSource
import com.wooyj.pokedex.core.network.retrofit.RetrofitPokedexNetwork
import javax.inject.Inject

class PokemonListRepository @Inject constructor(
    private val networkPokedexDataSource: NetworkPokedexDataSource
) {

}