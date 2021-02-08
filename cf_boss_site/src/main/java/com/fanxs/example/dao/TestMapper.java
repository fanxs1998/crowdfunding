package com.fanxs.example.dao;

import com.fanxs.example.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author fanxs
 * @date 2021/2/5
 */
@Repository("testMapper")
public interface TestMapper {
    int insertUser(User user);
}
