package com.cosmocatsmarket.service.mapper;

import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "id", source = "name")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "category", source = "category")
    Product toProduct(ProductDto customerDetails);

    @Mapping(target = "id", source = "name")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "category", source = "category")
    ProductDto toProductDto(Product customerDetails);
}
