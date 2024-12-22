package com.cosmocatsmarket.dto;


import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;


@Value
@Builder(toBuilder = true)
@Jacksonized
public class ProductDto {
        String id;

        @Size(max = 30, message = "Name cannot exceed 30 characters")
        String name;

        Integer price;
}
