package org.example.spring.common.service.impl;

import org.example.spring.common.service.UserService;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:26 下午
 */
public class UserServiceImpl implements UserService {

    private String ss;
    public void test() {
        System.out.println("this is userservice "+ss);
    }

    public void setXx(String sss) {
        System.out.println("this is xx "+sss);
    }
}
