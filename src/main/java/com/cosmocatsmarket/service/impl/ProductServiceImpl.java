package com.cosmocatsmarket.service.impl;

import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.ProductService;
import com.cosmocatsmarket.service.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Override
    public boolean removeProduct(Integer productId) {
        return false;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }

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
