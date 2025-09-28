package com.gkfcsolution.springjpaentitymappings.repository;

import com.gkfcsolution.springjpaentitymappings.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 22:01
 * File: null.java
 * Project: spring-jpa-entity-mappings
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 22:01
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
