package com.shumeng.ucenter.manager;

import com.shumeng.entity.User;
import com.shumeng.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserManager {

    @Resource
    private UserMapper userMapper;

    public User getUserByUserId(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
