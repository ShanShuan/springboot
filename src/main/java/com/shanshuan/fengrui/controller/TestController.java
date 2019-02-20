package com.shanshuan.fengrui.controller;

import com.shanshuan.fengrui.i.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/springboot")
public class TestController {
    @Autowired
    private RedisService redisService;
    @RequestMapping(value = "/{name}")
    private String test(@PathVariable("name") String name){
        redisService.set("name",name);
        return  "Hello Word!";
    }

    @RequestMapping(value = "test")
    private ModelAndView newtest( ){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return  mv;
    }

    @RequestMapping(value = "newtest")
    private String mytest( ){
        return  "index";
    }
}
