package com.gkfcsolution.springjpaentitymappings.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Created on 2025 at 22:01
 * File: null.java
 * Project: spring-jpa-entity-mappings
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 22:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    @ManyToMany(cascade = CascadeType.ALL)
//    private Customer customer;
}
