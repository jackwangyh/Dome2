package com.Dome;

import org.testng.annotations.*;

public class Dometest {
    //只运行一次
    @BeforeClass
    public void beforeClass (){

        System.out.println("beforeClass类运行之前");
    }
//    //每一个测试方法都运行
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("beforeMethod测试之前运行");
    }
    @Test
    public void TestCase1(){
      System.out.println("这是测试用例1");
    }
    //每一个测试方法都运行
    @AfterMethod
    public void after(){

        System.out.println("AfterMethod测试之后");
    }
    //只运行一次
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass类运行之后2");

    }
    @Test
    public void Testcase2(){

        System.out.println("这是测试用例2");
    }
    //套件
    @BeforeSuite
    public void  beforeSuite(){

        System.out.println("beforeSuite套件");
    }
    @AfterSuite
    public void a(){
        System.out.println("AfterSuite套件");

    }





}
