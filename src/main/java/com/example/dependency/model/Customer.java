package com.example.dependency.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private int cusId;
    private String custName;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", custName='" + custName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;
    public void display(){
        System.out.println("Returned");
    }

}
