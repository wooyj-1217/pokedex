package com.wooyj.pokedex.core.common.network

import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val pokedexDispatcher : PokedexDispatchers)


enum class PokedexDispatchers {
    IO
}