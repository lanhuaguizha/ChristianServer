package com.christian.controller

import com.christian.bean.Detail
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
                Nav("马太福音", "虚心的人有福了", "虚心的人有福了，因为天国是他们的。", "http://127.0.0.1:8080/relation", ""),
                Nav("马太福音", "哀恸的人有福了", "哀恸的人有福了，因为他们必得安慰。", "姊妹", ""),
                Nav("马太福音", "温柔的人有福了", "温柔的人有福了．因为他们必承受地土。", "姊妹", ""),
                Nav("马太福音", "饥渴慕义的人有福了", "饥渴慕义的人有福了．因为他们必得饱足。", "姊妹", ""),
                Nav("马太福音", "怜恤人的人有福了", "http://127.0.0.1:8080/detail", "弟兄", ""),
                Nav("马太福音", "清心的人有福了", "清心的人有福了．因为他们必得见　神。", "弟兄", ""),
                Nav("马太福音", "使人和睦的人有福了", "使人和睦的人有福了．因为他们必称为　神的儿子。", "姊妹", ""),
                Nav("马太福音", "为义受逼迫的人有福了", "为义受逼迫的人有福了．因为天国是他们的。", "弟兄", "")
        )

    //    http://127.0.0.1:8080/relation
    val relations: List<Nav>
        @RequestMapping("/relation")
        get() = Arrays.asList<Nav>(
                Nav("马太福音", "虚心的人有福了", "虚心的人有福了，因为天国是他们的。", "http://127.0.0.1:8080/relation", ""),
                Nav("马太福音", "哀恸的人有福了", "哀恸的人有福了，因为他们必得安慰。", "姊妹", ""),
                Nav("马太福音", "温柔的人有福了", "温柔的人有福了．因为他们必承受地土。", "姊妹", ""),
                Nav("马太福音", "饥渴慕义的人有福了", "饥渴慕义的人有福了．因为他们必得饱足。", "姊妹", ""),
                Nav("马太福音", "怜恤人的人有福了", "http://127.0.0.1:8080/detail", "弟兄", ""),
                Nav("马太福音", "清心的人有福了", "清心的人有福了．因为他们必得见　神。", "弟兄", ""),
                Nav("马太福音", "使人和睦的人有福了", "使人和睦的人有福了．因为他们必称为　神的儿子。", "姊妹", ""),
                Nav("马太福音", "为义受逼迫的人有福了", "为义受逼迫的人有福了．因为天国是他们的。", "弟兄", "")
        )
}