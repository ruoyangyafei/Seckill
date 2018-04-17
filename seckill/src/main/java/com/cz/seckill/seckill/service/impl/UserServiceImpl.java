package com.cz.seckill.seckill.service.impl;

import com.cz.seckill.seckill.database.model.MmallUser;
import com.cz.seckill.seckill.mapper.MmallUserMapper;
import com.cz.seckill.seckill.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by changyaqian on 2018/4/15.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private MmallUserMapper userMapper;
    @Override
    public Object login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if (resultCount ==0){
            return "用户名不存在！";
        }
        // todo 密码登陆MD5
        MmallUser user = userMapper.selectLogin(username,password);
        if (user == null){
            return "密码错误！";
        }
        //用户名密码正确时返回用户信息要将密码置空，此处采用apache的方法
        user.setPassword(StringUtils.EMPTY);
        return user;
    }
}
