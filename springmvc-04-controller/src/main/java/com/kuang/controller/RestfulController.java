package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestfulController {

    /**
     * http://localhost:8080/add?a=1&b=3
     * @param a
     * @param b
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String test1(int a, int b, Model model) {
        model.addAttribute("msg", "result is " + (a + b));
        return "test";
    }

    /**
     * http://localhost:8080/add/1/2
     * @param a
     * @param b
     * @param model
     * @return
     */
    @RequestMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("msg", "result is " + (a + b));
        return "test";
    }


    @GetMapping("/add/{a}/{b}/{c}")
    public String test2(@PathVariable int a, @PathVariable int b, @PathVariable int c, Model model) {
        model.addAttribute("msg", "result is " + (a + b + c));
        return "test";
    }

}
