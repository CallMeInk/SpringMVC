package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 代表这个类被spring接管
 * 类中所有方法，如果返回值是String，并且有具体页面可以跳转，就会被视图解析器解析
 */
@Controller
public class ControllerTest2 {

    @RequestMapping("t2")
    public String test1(Model model){
        model.addAttribute("msg", "annotation mapping");
        return "test";
    }

}
