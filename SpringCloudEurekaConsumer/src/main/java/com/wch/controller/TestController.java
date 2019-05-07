package com.wch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年5月7日: 上午11:23:09
 */
@RestController
public class TestController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/hello")
    public String hello(){
        String url = "http://provider-hong/hello";
        return restTemplate.getForObject(url, String.class);
    }
    
}
