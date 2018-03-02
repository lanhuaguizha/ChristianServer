package com.christian.controller

import com.christian.bean.Nav
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

//@RequestMapping("/home")
//fun getHome(): List<Home> {
//    return Arrays.asList<T>(
//            Home("God save me", "2017.6.4", "yong"),
//            Home("God save me", "2017.6.4", "yong"),
//            Home("God save me", "2017.6.4", "yong")
//    )
//}


@RestController
class NavController {

    //    http://127.0.0.1:8080/hello
    val home: List<Nav>
        @RequestMapping("/home")
        get() = Arrays.asList<Nav>(
                Nav("马太福音", "怜恤人的人有福了"),
                Nav("马太福音", "贫穷的人有福了"),
                Nav("马太福音", "温柔的人有福了")
        )


}