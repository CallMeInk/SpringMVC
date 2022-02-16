package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    //过滤器处理乱码
    @PostMapping("/e/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg", name);
        return "test";
    }

}
