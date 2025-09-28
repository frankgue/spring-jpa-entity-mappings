package com.gkfcsolution.springjpaentitymappings;

import com.gkfcsolution.springjpaentitymappings.entity.Customer;
import com.gkfcsolution.springjpaentitymappings.entity.Item;
import com.gkfcsolution.springjpaentitymappings.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJpaEntityMappingsApplication {
@Autowired
private CustomerRepository customerRepository;
    @PostConstruct
    public void initApp(){
        Customer customer = new Customer();
        customer.setName("Frank");

        Item item = new Item();
        item.setName("Item");
        Item item2 = new Item();
        item2.setName("Item2");

        customer.getItems().add(item);
        customer.getItems().add(item2);

        item.setCustomer(customer);
        item2.setCustomer(customer);

        customerRepository.save(customer);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaEntityMappingsApplication.class, args);
    }

}
