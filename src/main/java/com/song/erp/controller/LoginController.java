package com.song.erp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.song.erp.bean.User;
import com.song.erp.service.UserService;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login",method = {RequestMethod.GET})
    public ModelAndView login(HttpServletRequest request){
        User user = userService.selectByPrimaryKey(1l);
        System.out.println(user.toString());
        return new ModelAndView("login");
    }

    @RequestMapping(value="/login.do",method = {RequestMethod.POST})
    @ResponseBody
    public User loginDo(HttpServletRequest request,User user){
        return userService.selectByPrimaryKey(1l);
    }

    @RequestMapping(value="/login.error",method = {RequestMethod.GET})
    public ModelAndView loginError(HttpServletRequest request){
        return new ModelAndView("login-error");
    }

    @RequestMapping(value="/test" ,method = {RequestMethod.GET})
    public ModelAndView test(HttpServletRequest request){
        return new ModelAndView("index");
    }

}
