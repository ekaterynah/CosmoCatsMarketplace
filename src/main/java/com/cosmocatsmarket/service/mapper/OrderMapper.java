package com.cosmocatsmarket.service.mapper;

import com.cosmocatsmarket.domain.Order;
import com.cosmocatsmarket.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "id", source = "name")
    @Mapping(target = "sum", source = "sum")
    @Mapping(target = "orderDate", source = "orderDate")
    @Mapping(target = "products", source = "products")
    Order toOrder(OrderDto customerDetails);

    @Mapping(target = "id", source = "name")
    @Mapping(target = "sum", source = "sum")
    @Mapping(target = "orderDate", source = "orderDate")
    @Mapping(target = "products", source = "products")
    OrderDto toOrderDto(Order customerDetails);
}
