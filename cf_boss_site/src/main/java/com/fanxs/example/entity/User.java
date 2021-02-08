package com.fanxs.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fanxs
 * @date 2021/2/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
