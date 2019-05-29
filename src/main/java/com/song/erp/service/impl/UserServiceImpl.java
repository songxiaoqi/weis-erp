package com.song.erp.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.erp.bean.User;
import com.song.erp.mapper.UserMapper;
import com.song.erp.service.UserService;

@Service("dongErpUserService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
