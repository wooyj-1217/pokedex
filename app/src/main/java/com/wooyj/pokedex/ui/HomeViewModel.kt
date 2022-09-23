package com.wooyj.pokedex.ui

import com.wooyj.pokedex.core.network.NetworkPokedexDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
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
    private val networkPokedexDataSource: NetworkPokedexDataSource
) {





}