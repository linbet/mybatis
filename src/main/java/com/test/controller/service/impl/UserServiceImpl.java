package com.test.controller.service.impl;

import com.test.controller.service.UserService;
import com.test.entity.User;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> list() {
        return mapper.list();
    }
}
