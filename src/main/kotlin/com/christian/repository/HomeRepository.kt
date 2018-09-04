package com.christian.repository

import com.christian.bean.Home
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.findById
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono
import javax.annotation.PostConstruct


@Repository
class HomeRepository(private val template: ReactiveMongoTemplate) {

    companion object {
        val initialHomes = listOf(
                Home("1", "1", "1", "1", "1"),
                Home("2", "2", "2", "2", "2")
        )
    }

    @PostConstruct
    fun initializeRepository() = initialHomes.map(Home::toMono).map(this::create).map(Mono<Home>::subscribe)

    fun create(home: Mono<Home>) = template.save(home)

    fun findById(id: Int) = template.findById<Home>(id)

    fun findByCount(count: Int) = template.findAll(Home::class.java)
}