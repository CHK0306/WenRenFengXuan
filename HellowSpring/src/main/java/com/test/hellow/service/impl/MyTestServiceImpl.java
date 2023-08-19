package com.test.hellow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.hellow.mapper.MyTestMapper;
import com.test.hellow.pojo.MyAdd;
import com.test.hellow.service.MyTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MyTestServiceImpl extends ServiceImpl<MyTestMapper, MyAdd>
    implements MyTestService {

    @Resource
    public MyTestMapper myTestMapper;

    @Override
    public void add(MyAdd add) {
        myTestMapper.insert(add);
    }
}




