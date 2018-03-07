package com.christian.controller

import com.christian.bean.Nav
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class NavController {

    //    http://127.0.0.1:8080/nav
    val navs: List<Nav>
        @RequestMapping("/nav")
        get() = Arrays.asList<Nav>(
                Nav("马太福音", "怜恤人的人有福了", "...", "弟兄", ""),
                Nav("马太福音", "贫穷的人有福了", "...", "姊妹", ""),
                Nav("马太福音", "温柔的人有福了", "...", "弟兄", ""),
                Nav("马太福音", "清心的人有福了", "...", "姊妹", "")
        )


}