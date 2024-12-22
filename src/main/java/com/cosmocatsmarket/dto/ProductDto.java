package com.cosmocatsmarket.dto;

import com.cosmocatsmarket.domain.Category;
import lombok.Value;
import jakarta.validation.constraints.Size;

@Value
public class ProductDto {
        String Id;

        @Size(max = 30, message = "Name cannot exceed 30 characters")
        String Name;

        Integer Price;
        Category Category;
}
