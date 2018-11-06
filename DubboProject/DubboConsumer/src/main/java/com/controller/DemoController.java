package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Reference
    private DemoService demoService;

    @RequestMapping("/consum")
    @ResponseBody
    public String testDubbo(String name){
        return demoService.sayGood("Bob");
    }
}
