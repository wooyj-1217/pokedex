package com.wooyj.pokedex.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.wooyj.pokedex.core.data.repository.PokemonListRepository
import com.wooyj.pokedex.core.data.network.NetworkPokedexDataSource
import com.wooyj.pokedex.core.data.network.model.NetworkPokemonList
import com.wooyj.pokedex.core.domain.PokemonListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 *
 * Created on 2022/09/23.
 *
 * Description:
 *
 * @author wooyj
 *
 */

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val pokemonListUseCase: PokemonListUseCase,
    application: Application
) :AndroidViewModel(application){

    val pokemonList : LiveData<NetworkPokemonList?>
        get() = _pokemonList
    private val _pokemonList = pokemonListUseCase.execute().asLiveData()



}