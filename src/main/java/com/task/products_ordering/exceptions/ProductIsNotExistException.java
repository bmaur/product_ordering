package com.task.products_ordering.exceptions;

public class ProductIsNotExistException extends RuntimeException {
    public ProductIsNotExistException(String productName) {
        super("Products" + productName + " content cant't be blank");
    }
}
