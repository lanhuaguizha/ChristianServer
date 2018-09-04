package com.christian

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.ReactiveMongoOperations
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class DatabaseInitializer {

    companion object {
        const val HOME = "home"
        const val GOSPEL = "gospel"
        const val FELLOWSHIP = "fellowship"
        const val ME = "me"
    }

    private val collectionNames = listOf(HOME, GOSPEL, FELLOWSHIP, ME)

    @Autowired
    lateinit var mongoOperations: ReactiveMongoOperations

    @PostConstruct
    fun initData() {
        // create collections by $collectionNames
        for (name in collectionNames) {
            createCollection(name)
        }
    }

    /**
     * check if the collection exist or not. true, don't create; otherwise, create collection by given name.
     */
    fun createCollection(collectionName: String) {
        mongoOperations.collectionExists(collectionName).subscribe { it ->
            if (it != true) {
                mongoOperations.createCollection(collectionName).subscribe {
                    println("$collectionName collection created")
                }
            } else {
                println("$collectionName collection already exist")
            }
        }
    }
}