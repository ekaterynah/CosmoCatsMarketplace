package com.cosmocatsmarket.web;

import com.cosmocatsmarket.domain.Order;
import com.cosmocatsmarket.domain.Product;
import com.cosmocatsmarket.dto.OrderDto;
import com.cosmocatsmarket.dto.ProductDto;
import com.cosmocatsmarket.service.OrderService;
import com.cosmocatsmarket.service.ProductService;
import com.cosmocatsmarket.service.mapper.OrderMapper;
import com.cosmocatsmarket.service.mapper.ProductMapper;
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
@RequestMapping("/api/v1/{userId}/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productDtoMapper;

    @PostMapping()
    public ResponseEntity<Boolean> createProduct(
            @RequestBody @Valid ProductDto productDto) {
        log.info("The product has been created {}", productDto.getId());

        productService.addProduct(productDto);
        return ResponseEntity.ok(true);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProduct(
            @PathVariable("productId") Integer productId) {
        log.info("Getting a product Id {}", productId);

        ProductDto productDto = productService.getProductById(productId);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping()
    public ResponseEntity<List<ProductDto>> getProducts() {
        log.info("Getting all products");

        List<ProductDto> productDtos = productService.getAllProducts();
        return ResponseEntity.ok(productDtos);
    }
    
    @DeleteMapping()
    public ResponseEntity<Boolean> deleteProduct(
       @PathVariable("productId") Integer productId){
        log.info("Removing product Id {}", productId);

        productService.removeProduct(productId);
        return ResponseEntity.ok(true);
    }
}
