package com.cosmocatsmarket.service.mapper;

import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "name", source = "name")
    //add other fields to be mapped
    Product toProduct(ProductDto customerDetails);
}
