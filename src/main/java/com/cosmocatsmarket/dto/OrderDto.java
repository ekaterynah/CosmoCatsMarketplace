package com.cosmocatsmarket.dto;

import com.cosmocatsmarket.domain.Product;
import jakarta.validation.constraints.Future;
import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
public class OrderDto {
    Integer Id;
    Integer Sum;
    List<Product> Products;

    @Future(message = "The date must be in the future")
    Date OrderDate;
}
