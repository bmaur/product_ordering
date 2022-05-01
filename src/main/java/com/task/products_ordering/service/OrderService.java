package com.task.products_ordering.service;

import com.task.products_ordering.OrderEntity;
import com.task.products_ordering.exceptions.ProductsIsAlreadyExistException;
import com.task.products_ordering.repository.OrderRepository;
import com.task.products_ordering.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public void addOrder(List<String> productNames) {
        checkIfProductsExist(productNames);
        OrderEntity orderEntity = new OrderEntity();


    }

    private void checkIfProductsExist(List<String> productsNames) {
        for (int i = 0; i <= productsNames.size(); i++) {
            if (productRepository.findByProductName(productsNames.get(i)).isEmpty()) {
                throw new ProductsIsAlreadyExistException(productsNames.get(i));
            }
        }
    }
}
