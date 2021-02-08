package com.fanxs.example.controller;

import com.fanxs.example.entity.User;
import com.fanxs.example.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author fanxs
 * @date 2021/2/4
 */
@Controller
public class TestController {

    @Resource
    TestService testService;

    @RequestMapping("/test")
    public ModelAndView test() {
        System.out.println("测试控制器TestController");
        User user = new User("1","123");
        testService.insertUser(user);
        ModelAndView mav = new ModelAndView("error/error");
        return mav;
    }
}
