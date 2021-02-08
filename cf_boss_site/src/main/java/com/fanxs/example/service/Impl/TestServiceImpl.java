package com.fanxs.example.service.Impl;

import com.fanxs.example.dao.TestMapper;
import com.fanxs.example.entity.User;
import com.fanxs.example.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fanxs
 * @date 2021/2/5
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    TestMapper testMapper;
    public void insertUser(User user) {
        testMapper.insertUser(user);
    }
}
