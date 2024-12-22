package com.cosmocatsmarket.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
@Builder(toBuilder = true)
public class Order {
    Integer id;
    Integer sum;
    List<Product> products;
    Date orderDate;
}
