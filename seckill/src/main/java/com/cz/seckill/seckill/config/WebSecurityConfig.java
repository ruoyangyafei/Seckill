package com.cz.seckill.seckill.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by changyaqian on 2017/12/15.
 */
@Configuration          // 配置文件
@EnableWebSecurity      // 开启Security
@EnableGlobalMethodSecurity(prePostEnabled = true)  //AOP
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void  configure(HttpSecurity http) throws Exception{
        //路由策略和访问权限的简单配置
        http
                .formLogin()                      //启用默认登录页面
                .failureUrl("/login?error")       //登录失败返回URL：/login?error
                .defaultSuccessUrl("/v1/seckill/test")       //登录成功跳转URL
                .permitAll();                     //登录页面全部权限可访问
        super.configure(http);
    }

    /**
     * 配置内存用户
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("Brave").password("123").roles("USER");
    }
}
