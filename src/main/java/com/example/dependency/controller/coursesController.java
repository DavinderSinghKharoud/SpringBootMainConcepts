package com.example.dependency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class coursesController {

    @RequestMapping("/")
    public String courses(HttpServletRequest request){

        HttpSession session = request.getSession();
        String courseName = request.getParameter( "cname");
        session.setAttribute( "cname", courseName);
        System.out.println("welcome");
        return "course";
    }
}