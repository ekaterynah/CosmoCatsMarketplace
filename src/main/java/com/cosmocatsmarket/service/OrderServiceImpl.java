package com.cosmocatsmarket.service;

import com.cosmocatsmarket.domain.Order;
import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.mapper.ProductMapper;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class OrderServiceImpl {

    private final ProductMapper productMapper;

    public Product createOrder(ProductDto productDto) {
        Product product = productMapper.toProduct(productDto);
        return product;
    }

    public Order createOrder(List<ProductDto> productDtos) {
        List<Product> products = productDtos.stream()
                .map(productDto -> productMapper.toProduct(productDto)) // Use map to convert each item
                .collect(Collectors.toList());
        Order order = new Order();
        return order;
    }


}
