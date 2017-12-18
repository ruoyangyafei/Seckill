package com.cz.seckill.seckill.service;

import com.cz.seckill.seckill.database.model.Permission;
import com.cz.seckill.seckill.database.model.SysUser;
import com.cz.seckill.seckill.mapper.PermissionMapper;
import com.cz.seckill.seckill.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by changyaqian on 2017/12/18.
 */
public class CustomUserService implements UserDetailsService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userMapper.findByUserName(username);
        if (user!=null){
            List<Permission> permissions = permissionMapper.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (Permission permission:permissions){
                if (permission!=null&&permission.getName()!=null){
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                    //此处将权限信息添加到GrantedAuthority对象中，在后面进行全权限验证时会使用GrantedAuthority对象
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            return new User(user.getUserName(),user.getPassWord(),grantedAuthorities);
        }else {
            throw new UsernameNotFoundException("admin "+username+" do not exist!");
        }
    }
}
