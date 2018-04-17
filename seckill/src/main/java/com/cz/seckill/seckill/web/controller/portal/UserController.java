package com.cz.seckill.seckill.web.controller.portal;

import com.cz.seckill.seckill.database.model.MmallUser;
import com.cz.seckill.seckill.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by changyaqian on 2018/4/14.
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("login.do")
    public ResponseEntity login(String username,String password){
        Object object = userService.login(username,password);

        //if ()
        return  null;
    }
}
