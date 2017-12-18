package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.Permission;

import java.util.List;

/**
 * Created by changyaqian on 2017/12/18.
 */
public interface PermissionMapper {
    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);
}
