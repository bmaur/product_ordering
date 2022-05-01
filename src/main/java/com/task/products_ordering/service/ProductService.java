package com.task.products_ordering.service;

import com.task.products_ordering.ProductEntity;
import com.task.products_ordering.ProductInput;
import com.task.products_ordering.exceptions.EmptyProductValueException;
import com.task.products_ordering.exceptions.ProductsIsAlreadyExistException;
import com.task.products_ordering.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void addProduct(ProductInput productInput) {
        validateProductInput(productInput);
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(productInput.getProductName());
        productEntity.setProductPrice(productInput.getProductPrice());
        productRepository.save(productEntity);
    }

    public List<ProductInput> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(e -> ProductInput.builder()
                        .productName(e.getProductName())
                        .productPrice(e.getProductPrice()
                        )
                        .build())
                .collect(Collectors.toList());
    }


    void validateProductInput(ProductInput productInput) {
        String priceAsString = Double.toString(productInput.getProductPrice());
        if (productInput.getProductName().isBlank() || priceAsString.isBlank()) {
            throw new EmptyProductValueException();
        } else if (productRepository.findByProductName(productInput.getProductName()).isPresent()) {
            throw new ProductsIsAlreadyExistException(productInput.getProductName());
        }

    }

}