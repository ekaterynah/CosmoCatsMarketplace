package com.cosmocatsmarket.service.exceptions;

public class ProductNotFoundException extends RuntimeException {
    private static final String Product_NOT_FOUND_MESSAGE = "Product with id %s not found";

    public ProductNotFoundException(int productId) {
        super(String.format(Product_NOT_FOUND_MESSAGE, productId));
    }
}
