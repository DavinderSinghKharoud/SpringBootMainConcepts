package com.example.dependency.Repository;

import com.example.dependency.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//http://localhost:8080/Customer
@RepositoryRestResource(collectionResourceRel = "Customer",path = "Customer")
public interface CustomerRepo extends JpaRepository<Customer,Integer> {


}
