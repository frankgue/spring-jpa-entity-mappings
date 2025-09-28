package com.gkfcsolution.springjpaentitymappings.repository;

import com.gkfcsolution.springjpaentitymappings.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 22:02
 * File: null.java
 * Project: spring-jpa-entity-mappings
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 22:02
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
