package com.cosmocatsmarket.service;

import com.cosmocatsmarket.dto.OrderDto;
import com.cosmocatsmarket.dto.ProductDto;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(List<ProductDto> productDtos);
    OrderDto getOrderById(int orderId);
    List<OrderDto> getOrdersByUserId(int userId);
    List<OrderDto> getAllOrders();
}
