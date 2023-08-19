package com.test.hellow.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("myTest")
public class MyAdd {
    public int a;
    public int b;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
