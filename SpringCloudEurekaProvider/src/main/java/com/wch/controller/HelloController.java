package com.wch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年5月7日: 上午11:07:38
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,wangchenghong";
    }
    
}
