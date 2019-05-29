package com.song.erp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.song.erp.bean.DongErpUser;
import com.song.erp.service.DongErpUserService;

@RestController
public class LoginController {

    @Autowired
    private DongErpUserService dongErpUserService;

    @RequestMapping(value="/login")
    public ModelAndView login(HttpServletRequest request){
        return new ModelAndView("login");
    }

    @RequestMapping(value="/login.do")
    public DongErpUser loginDo(HttpServletRequest request){
        return dongErpUserService.selectByPrimaryKey(1l);
    }

    @RequestMapping(value="/login.error")
    public ModelAndView loginError(HttpServletRequest request){
        return new ModelAndView("login-error");
    }

    @RequestMapping(value="/test")
    public ModelAndView test(HttpServletRequest request){
        return new ModelAndView("index");
    }

}
