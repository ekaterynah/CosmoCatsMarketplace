package com.cosmocatsmarket.service;

import com.cosmocatsmarket.dto.ProductDto;

import java.util.List;

public interface ProductService {
    void addProduct(ProductDto productDto);
    boolean removeProduct(Integer productId);
    ProductDto getProductById(int productId);
    List<ProductDto> getAllProducts();
}
