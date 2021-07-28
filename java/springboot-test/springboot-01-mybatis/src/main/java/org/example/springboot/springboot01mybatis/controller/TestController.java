package org.example.springboot.springboot01mybatis.controller;

import org.example.springboot.springboot01mybatis.pojo.TestService;
import org.example.springboot.springboot01mybatis.pojo.TimeTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/28 12:06 下午
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @GetMapping("list")
    public List<TimeTest> list() {
        return testService.list();
    }

    @ResponseBody
    @PostMapping("insert")
    public List<TimeTest> insert() {
        testService.insert();
        return testService.list();
    }

}
