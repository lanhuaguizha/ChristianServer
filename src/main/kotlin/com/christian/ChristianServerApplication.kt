package com.christian

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChristianServerApplication

fun main(args: Array<String>) {
    runApplication<ChristianServerApplication>(*args)
}
