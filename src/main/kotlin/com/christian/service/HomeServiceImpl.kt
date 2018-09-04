package com.christian.service

import com.christian.repository.HomeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HomeServiceImpl : HomeService {

    @Autowired
    lateinit var homeRepository: HomeRepository

    override fun getHomes(count: Int) = homeRepository.findByCount(count)
}