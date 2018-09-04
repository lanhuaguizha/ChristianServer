package com.christian.bean

import com.christian.DatabaseInitializer
import org.springframework.data.mongodb.core.mapping.Document

/**
 * The bean class for the navigation page
 */

@Document(collection = DatabaseInitializer.HOME)
data class Home(val subtitle: String, val title: String, val detail: String, val relation: String, val author: String)

@Document(collection = DatabaseInitializer.GOSPEL)
data class Gospel(val title: String, val detail: String)

@Document(collection = DatabaseInitializer.FELLOWSHIP)
data class Fellowship(val image: String, val title: String, val detail: String)

@Document(collection = DatabaseInitializer.ME)
data class Me(val image: String, val title: String, val detail: String)



