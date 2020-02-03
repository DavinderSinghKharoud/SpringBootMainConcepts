package com.example.dependency.controller;

import com.example.dependency.Repository.CustomerRepo;
import com.example.dependency.model.Customer;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.rmi.MarshalledObject;

@Controller
public class formController {

    @Autowired
    CustomerRepo repo;

    @RequestMapping("/customer")
    public String customer() {
        return "customers";
    }

    @RequestMapping("/details")
    public String details(Customer customer) {
        repo.save(customer);
        return "customers";
    }

    @RequestMapping("/getId")
    public String viewDetails(Customer customer) {
        return "viewCustomers";
    }

    //    @GetMapping("/customer")
//    public String customer(){
//        return "customers";
//    }
//
    @PostMapping("/getDetails")
    public ModelAndView viewDetails(@RequestParam int cid) {

        ModelAndView mv = new ModelAndView("retreive");
        Customer customer = repo.findById(cid).orElse(null);
        mv.addObject(customer);
        return mv;

    }


}