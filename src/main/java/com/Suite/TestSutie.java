package com.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestSutie {
    @BeforeSuite
    public void  beforeSuite(){

        System.out.println("beforeSuite运行");
    }
    @AfterSuite
    public void afterSuite(){

        System.out.println("afterSuite运行");
    }
}
