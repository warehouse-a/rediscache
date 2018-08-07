package com.rediscache.controller;

import com.rediscache.bean.TestBean;
import com.rediscache.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwk
 * Date:2018/8/6 12:16
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("test/{id}")
    public TestBean getBeanId(@PathVariable("id") Integer id){
        return testService.getBeanId(id);
    }


    @RequestMapping("test1/{id}")
    public void cacheController(@PathVariable("id") Integer id){
        testService.cacheController(id);
    }

}
