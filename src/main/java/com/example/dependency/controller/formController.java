package com.example.dependency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class formController {

    @GetMapping("/customer")
    public String customer(){
        return "customers";
    }

    @PostMapping("/details")
    public String viewDetails(@RequestParam("cid") int cid, @RequestParam("cname") String cname,
                              @RequestParam("cemail") String cemail, ModelMap modelMap){

        modelMap.put( "cid",cid);
        modelMap.put( "cname",cname);
        modelMap.put( "cemail",cemail);
        return "viewCustomers";

    }


}
