package com.cosmocatsmarket.domain;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder(toBuilder = true)
public class Product {
    String id;
    String name;
    Integer price;
}
