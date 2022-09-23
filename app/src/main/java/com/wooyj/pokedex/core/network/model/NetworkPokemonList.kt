package com.wooyj.pokedex.core.network.model

/**
 *
 * Created on 2022/09/23.
 *
 * @author wooyj
 *
 */
data class NetworkPokemonList(
    var count: Int = 0,
    var next: Int = 0,
    var previous: Int = 0,
    var results : List<NetworkBase>
)