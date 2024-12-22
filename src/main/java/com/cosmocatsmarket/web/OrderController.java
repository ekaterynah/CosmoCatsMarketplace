package com.cosmocatsmarket.web;


import com.cosmocatsmarket.domain.Order;
import com.cosmocatsmarket.dto.OrderDto;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.OrderService;
import com.cosmocatsmarket.service.mapper.OrderMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@Validated
@RequestMapping("/api/v1/{userId}/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderDtoMapper;

    @PostMapping()
    public ResponseEntity<OrderDto> createOrder(
            @PathVariable("userId") UUID userId,
            @RequestBody @Valid List<ProductDto> productDtos) {
        log.info("UserId {} is creating an order", userId);

        OrderDto orderDto = orderService.createOrder(productDtos);
        return ResponseEntity.ok(orderDto);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDto> getOrder(
            @PathVariable("userId") int userId,
            @PathVariable("orderId") Integer orderId) {
        log.info("UserId {} is getting an order Id {}", userId, orderId);


        try {
            OrderDto orderDto = orderService.getOrderById(orderId);
            return ResponseEntity.ok(orderDto);
        } catch (Exception ex) {
            log.error("Exception occurred while getting order by id {}", orderId);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping()
    public ResponseEntity<List<OrderDto>> getOrders(
            @PathVariable("userId") int userId) {
        log.info("UserId {} is getting orders", userId);

        List<OrderDto> orderDto = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orderDto);

    }
}
