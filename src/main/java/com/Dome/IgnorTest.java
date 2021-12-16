package com.Dome;

import org.testng.annotations.Test;
//忽略测试
public class IgnorTest {
    @Test
    public void Ignore_test(){
        System.out.println("忽略测试");

    }
    @Test(enabled =false)
    public void Ignore_test1(){
        System.out.println("忽略测试1");

    }
}
