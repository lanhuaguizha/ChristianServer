package com.christian.service

import com.christian.bean.Home
import reactor.core.publisher.Flux

interface HomeService {
    fun getHomes(count: Int): Flux<Home>
}