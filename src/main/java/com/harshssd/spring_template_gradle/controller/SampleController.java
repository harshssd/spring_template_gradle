package com.harshssd.spring_template_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController
{
    @RequestMapping(value = "/")
    @ResponseBody
    public String helloSpring()
    {
        return "Hello from Spring Starter Template using Gradle.";
    }
}
