package com.christian.controller

import com.christian.service.HomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Autowired
    lateinit var homeService: HomeService

    @RequestMapping(value = ["/home/{count}"], method = [RequestMethod.GET])
    fun getHomes(@PathVariable count: Int) = homeService.getHomes(count)

}