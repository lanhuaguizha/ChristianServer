package com.christian.bean

/**
 * The bean class for the navigation detail page
 */

data class HomeDetail(val audio: String, val content: String, val image: String)

data class GospelDetail(val subtitle: String, val title: String, val detail: String, val relation: String, val author: String)

data class FellowshipDetail(val title: String)

data class MeDetail(val title: String)