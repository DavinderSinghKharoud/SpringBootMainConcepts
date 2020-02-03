package com.example.dependency.Repository;

import com.example.dependency.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {


}
