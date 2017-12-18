package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by changyaqian on 2017/12/18.
 */
public interface UserMapper {
    SysUser findByUserName(@Param("userName") String userName);
}
