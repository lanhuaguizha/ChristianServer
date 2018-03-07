package com.christian.controller

import com.christian.bean.Detail
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class DetailController {

    //    http://127.0.0.1:8080/detail
    val details: List<Detail>
        @RequestMapping("/detail")
        get() = Arrays.asList<Detail>(
                Detail("http://v.youku.com/v_show/id_XNTYxMzM0MTQ0.mp3", "怜恤人的人有福了，", "http://v.youku.com/v_show/id_XNTYxMzM0MTQ0.mp3"),
                Detail("", "因为他们必蒙怜恤。", "")
        )
}