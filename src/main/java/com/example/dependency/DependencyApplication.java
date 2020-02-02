package com.example.dependency;

import com.example.dependency.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(DependencyApplication.class, args);


        Customer cus = context.getBean( Customer.class);
        cus.display();


    }

}
