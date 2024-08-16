package com.project.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
    
    @GetMapping("/mainPage")
    public ModelAndView Main(){
        System.out.println("__ Controller Main Page _ [main]");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");

        return mav;
    }

}
