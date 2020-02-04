package com.example.dependency.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int cid;
    private String cname;
    private String cemail;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cemail='" + cemail + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }
}
