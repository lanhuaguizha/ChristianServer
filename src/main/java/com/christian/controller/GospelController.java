package com.christian.controller;

import com.christian.bean.Gospel;
import com.christian.mapper.GospelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author：Administrator on 2017/6/28 06:19
 * email：lanhuaguizha@gmail.com
 */
@RestController
public class GospelController {
    @Autowired
    private GospelMapper gospelMapper;

    @RequestMapping("/gospel")
    public List<Gospel> getGospel() {
        return gospelMapper.getAll();
    }
}
