package com.test.hellow.controller;

import com.test.hellow.pojo.MyAdd;
import com.test.hellow.service.impl.MyTestServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private MyTestServiceImpl myTestServiceImpl;

    @PostMapping("/add")
    public Integer myAdd(@RequestBody MyAdd add){
        add.setC(add.getA()+add.getB());
        myTestServiceImpl.add(add);
        return add.getC();
    }


}
