package com.christian.controller;

import com.christian.bean.Home;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * author：Administrator on 2017/6/4 00:53
 * email：lanhuaguizha@gmail.com
 */
@RestController
public class HomeController {

//    http://127.0.0.1:8080/hello
    @RequestMapping("/home")
    public List<Home> getHome() {
        return Arrays.asList(
                new Home("God save me", "2017.6.4", "yong"),
                new Home("God save me", "2017.6.4", "yong"),
                new Home("God save me", "2017.6.4", "yong")
        );
    }


}
