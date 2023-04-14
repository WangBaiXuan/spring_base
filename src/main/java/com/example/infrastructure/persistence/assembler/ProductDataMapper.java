package com.example.infrastructure.persistence.assembler;

import com.example.domain.entity.Product;
import com.example.infrastructure.persistence.entity.ProductPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductDataMapper {
    ProductDataMapper mapper = getMapper(ProductDataMapper.class);

    List<Product> toDo(List<ProductPo> productPo);
}
