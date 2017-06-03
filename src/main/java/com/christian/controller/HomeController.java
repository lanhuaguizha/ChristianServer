package com.christian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author：Administrator on 2017/6/4 00:53
 * email：lanhuaguizha@gmail.com
 */
@RestController
public class HomeController {

//    http://127.0.0.1:8080/hello
    @RequestMapping("/hello")
    public String say() {
        return "Hello !";
    }
}
