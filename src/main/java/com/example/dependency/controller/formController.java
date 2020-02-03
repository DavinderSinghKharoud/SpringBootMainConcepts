package com.example.dependency.controller;

import com.example.dependency.Repository.CustomerRepo;
import com.example.dependency.model.Customer;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/getCustomers")
    @ResponseBody
    public List<Customer> getCustomer(){
        return repo.findAll();
    }

    @RequestMapping("/getCustomers/{cid}")
    @ResponseBody
    public Optional<Customer> getByID(@PathVariable("cid") int cid){
        return repo.findById(cid);
    }

    @DeleteMapping("/deleteCus/{cid}")
    public Customer getCustomerId(@PathVariable("cid") int cid){
        Customer cust = repo.getOne( cid );
        repo.delete( cust );
        return cust;
    }

}