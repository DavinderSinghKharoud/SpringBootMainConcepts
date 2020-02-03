package com.example.dependency.Repository;

import com.example.dependency.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {


}
