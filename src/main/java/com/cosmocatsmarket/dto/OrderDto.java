package com.cosmocatsmarket.dto;

import com.cosmocatsmarket.domain.Product;
import jakarta.validation.constraints.Future;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;
import java.util.List;

@Value
@Builder(toBuilder = true)
@Jacksonized
public class OrderDto {
    Integer id;
    Integer sum;
    List<Product> products;

    @Future(message = "The date must be in the future")
    Date orderDate;
}
