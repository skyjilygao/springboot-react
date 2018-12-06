package com.skyjilygao.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {

    @RequestMapping("test1")
    public JSONObject test1(){
        JSONObject json = new JSONObject();
        json.put("name","test1111.............................");
        json.put("price","23.88");
        json.put("date",new Date());
        return json;
    }
}
