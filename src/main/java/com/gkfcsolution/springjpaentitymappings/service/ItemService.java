package com.gkfcsolution.springjpaentitymappings.service;

import com.gkfcsolution.springjpaentitymappings.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created on 2025 at 22:02
 * File: null.java
 * Project: spring-jpa-entity-mappings
 *
 * @author Frank GUEKENG
 * @date 28/09/2025
 * @time 22:02
 */
@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
}
