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
/*    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Customer customer;*/
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
