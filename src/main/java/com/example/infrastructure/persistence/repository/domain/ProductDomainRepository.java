package com.example.infrastructure.persistence.repository.domain;

import com.example.domain.entity.Product;
import com.example.domain.repository.ProductRepository;
import com.example.infrastructure.persistence.assembler.ProductDataMapper;
import com.example.infrastructure.persistence.repository.JpaProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProductDomainRepository implements ProductRepository {
    private final JpaProductRepository jpaProductRepository;
    private final ProductDataMapper mapper = ProductDataMapper.mapper;

    @Override
    public List<Product> findAll() {
        return mapper.toDo(
                jpaProductRepository.findAll());
    }
}
