package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.SysUser;

/**
 * Created by changyaqian on 2017/12/18.
 */
public interface UserMapper {
    SysUser findByUserName(String username);
}
