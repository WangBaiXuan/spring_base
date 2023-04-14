package com.example.application.service;

import com.example.application.assembler.ProductDtoMapper;
import com.example.domain.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductApplicationService {
    private final ProductRepository productRepository;
    private final ProductDtoMapper mapper = ProductDtoMapper.MAPPER;

    public List findAll() {
        return mapper.toDto(productRepository.findAll());
    }
}
