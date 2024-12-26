package com.cosmocatsmarket.service.impl;

import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.OrderDto;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.OrderService;
import com.cosmocatsmarket.service.exceptions.OrderNotFoundException;
import com.cosmocatsmarket.service.mapper.OrderMapper;
import com.cosmocatsmarket.service.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ProductMapper productMapper;
    private final OrderMapper orderMapper;

    public OrderDto createOrder(List<ProductDto> productDtos) {
        List<Product> products = productDtos.stream()
                .map(productDto -> productMapper.toProduct(productDto)) // Use map to convert each item
                .collect(Collectors.toList());

        return OrderDto.builder()
                .id(1)                             // ID
                .sum(300)                           // Sum
                .products(products) // List of products
                .orderDate(new Date(System.currentTimeMillis() + 1000000000L))  // Future order date
                .build();
    }

    public OrderDto getOrderById(int orderId){
        for (OrderDto order : getAllOrders()) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        throw new OrderNotFoundException(orderId);
    }

    @Override
    public List<OrderDto> getOrdersByUserId(int userId) {
        return List.of();
    }

    public List<OrderDto> getAllOrders() {
        Product product1 = Product.builder()
                .id("1")
                .name("Product One")
                .price(100)
                .build();

        Product product2 = Product.builder()
                .id("2")
                .name("Product Two")
                .price(200)
                .build();

        Product product3 = Product.builder()
                .id("3")
                .name("Product Three")
                .price(300)
                .build();

        // Creating OrderDto objects with lists of products
        OrderDto order1 = OrderDto.builder()
                .id(1)                             // ID
                .sum(300)                           // Sum
                .products(Arrays.asList(product1, product2)) // List of products
                .orderDate(new Date(System.currentTimeMillis() + 1000000000L))  // Future order date
                .build();

        OrderDto order2 = OrderDto.builder()
                .id(2)                             // ID
                .sum(500)                           // Sum
                .products(Arrays.asList(product2, product3)) // List of products
                .orderDate(new Date(System.currentTimeMillis() + 2000000000L))  // Future order date
                .build();

        return List.of(order1, order2);
    }
}
