package com.cosmocatsmarket.service.impl;

import com.cosmocatsmarket.domain.Order;
import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.OrderDto;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.OrderService;
import com.cosmocatsmarket.service.mapper.OrderMapper;
import com.cosmocatsmarket.service.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ProductMapper productMapper;
    private final OrderMapper orderMapper;

    public Order createOrder(List<ProductDto> productDtos) {
        List<Product> products = productDtos.stream()
                .map(productDto -> productMapper.toProduct(productDto)) // Use map to convert each item
                .collect(Collectors.toList());

        //Order order = new Order();
        return null;
    }

    public OrderDto getOrderById(int orderId){
        Order order = null;
        return orderMapper.toOrderDto(order);
    }

    @Override
    public List<OrderDto> getOrdersByUserId(int userId) {
        return List.of();
    }
}
