package com.cosmocatsmarket.service;

import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.mapper.ProductMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductServiceImpl {
    private final ProductMapper productMapper;

    public void addProduct(ProductDto productDto) {
        var product = productMapper.toProduct(productDto);

    }

    public boolean removeProduct(ProductDto productDto){
        var product = productMapper.toProduct(productDto);
        return true;
    }

    public ProductDto getProductById(int productId){
        Product product = null;
        return productMapper.toProductDto(product);
    }
}
