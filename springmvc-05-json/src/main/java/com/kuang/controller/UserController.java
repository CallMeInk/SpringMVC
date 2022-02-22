package com.kuang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController 标注后 接口返回字符串而不是视图解析器
@Controller
public class UserController {

    //不走视图解析器，返回字符串
    @ResponseBody
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        User user = new User(1, "ink", 27);
        return user.toString();
    }

    @ResponseBody
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        //jackson
        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1, "测试名称", 27);

        String s = mapper.writeValueAsString(user);

        return s;
    }

}
