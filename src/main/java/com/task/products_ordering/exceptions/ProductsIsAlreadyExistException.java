package com.task.products_ordering.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ProductsIsAlreadyExistException extends RuntimeException{
    public ProductsIsAlreadyExistException(String s){
        super("Product already exist in database");
    }
}
