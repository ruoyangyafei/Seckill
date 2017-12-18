package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by changyaqian on 2017/12/18.
 */
public interface PermissionMapper {
    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(@Param("userId") int userId);
}
