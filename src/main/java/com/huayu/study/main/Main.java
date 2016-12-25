package com.huayu.study.main;

import com.huayu.study.demo.UserService;
import com.huayu.study.mySpring.MySpring;

/**
 * Created by zhaohuayu on 16/12/25.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MySpring.init("ioc.yaml");
        UserService userService = (UserService) MySpring.getBean("userService") ;
        userService.sayUserInfo();
    }
}
