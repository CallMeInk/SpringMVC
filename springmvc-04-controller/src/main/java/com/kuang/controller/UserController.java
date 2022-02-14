package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg", name);
        return "test";
    }


    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model){
        model.addAttribute("msg", name);
        return "test";
    }


    //前端接收一个对象，字段名匹配就可以接收到
    @GetMapping("/t3")
    public String test3(User user, Model model){
        model.addAttribute("msg", user.toString());
        return "test";
    }


}
