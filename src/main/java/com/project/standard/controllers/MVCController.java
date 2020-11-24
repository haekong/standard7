package com.project.standard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {

    @RequestMapping(value="hello")
    public String hello(Model model) {
        model.addAttribute("msg", "Hello Spring MVC");
        return "hello";
    }
}