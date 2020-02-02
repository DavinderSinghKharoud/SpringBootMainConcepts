package com.example.dependency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class coursesController {

    @RequestMapping("/")
    public String courses(@RequestParam("cname") String course, HttpSession session){


        session.setAttribute( "cname", course);
        System.out.println("welcome");
        return "course";
    }
}
