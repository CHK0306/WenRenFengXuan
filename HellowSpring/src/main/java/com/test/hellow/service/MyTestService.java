package com.test.hellow.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.test.hellow.pojo.MyAdd;

public interface MyTestService extends IService<MyAdd> {

    void add(MyAdd add);
}
