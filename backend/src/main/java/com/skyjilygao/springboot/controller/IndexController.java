package com.skyjilygao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
//    @ResponseBody
    @RequestMapping("")
    public String index(){
        return "index";
    }
}
