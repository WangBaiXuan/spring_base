package com.example.application.assembler;

import com.example.domain.entity.Product;
import com.example.presentation.vo.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductDtoMapper {
    ProductDtoMapper MAPPER = getMapper(ProductDtoMapper.class);

    List<ProductDto> toDto(List<Product> products);

}
