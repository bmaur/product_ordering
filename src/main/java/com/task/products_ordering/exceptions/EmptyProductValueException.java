package com.task.products_ordering.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmptyProductValueException extends RuntimeException{
    public EmptyProductValueException(){
        super("Products content cant't be blank");
    }
}

