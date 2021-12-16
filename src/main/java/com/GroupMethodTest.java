package com;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

//组方法测试
public class GroupMethodTest {
    @Test(groups ="groupsserver")
    public void GroupMethodTest1(){

        System.out.println("服务端1");
    }
    @Test(groups = "groupsserver")
    public void GroupMethodTest2(){
        System.out.println("服务端2");
    }
    @Test(groups = "groupsclient")
    public void GroupMethodTest3(){
        System.out.println("客户端1");
    }
    @Test(groups = "groupsclient")
    public void GroupMethodTest4(){
        System.out.println("客户端2");
    }
    @BeforeGroups("groupsclient")
    public void beforeGroupsOnclient(){
        System.out.println("客户端运行之前的方法");
    }
    @AfterGroups("groupsclient")
    public void afterGroupsOnclient(){
        System.out.println("客户端端运行之后的方法"); }
    @BeforeGroups("groupsserver")
    public void beforeGroupsOnserver(){
        System.out.println("服务端运行之前的方法");
    }
    @AfterGroups("groupsserver")
    public void afterGroupsOnserver(){
        System.out.println("服务端运行之后的方法");

    }
}
