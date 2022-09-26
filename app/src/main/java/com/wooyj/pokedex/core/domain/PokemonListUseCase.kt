package com.wooyj.pokedex.core.domain

import com.wooyj.pokedex.core.data.repository.PokemonListRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PokemonListUseCase @Inject constructor(private val pokemonListRepository: PokemonListRepository) {

    fun execute() = flow {
        emit(pokemonListRepository.getPokemonList().let {
            if (it.isSuccessful) {
                    it.body()
            }else{
                null
            }
        })
    }.catch { e->
        emit(null)
    }

}