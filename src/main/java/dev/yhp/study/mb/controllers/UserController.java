package dev.yhp.study.mb.controllers;

import dev.yhp.study.mb.model.UserVo;
import dev.yhp.study.mb.services.UserService;
import dev.yhp.study.mb.services.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "test")
    public ModelAndView list() throws Exception{
        List<UserVo> list = userService.list();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userlist");
        mav.addObject("list",list);
        return mav;
    }
}