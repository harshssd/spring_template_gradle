package com.harshssd.spring_template_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping(value = "/")
    public String renderHome()
    {
        return "home";
    }
}
