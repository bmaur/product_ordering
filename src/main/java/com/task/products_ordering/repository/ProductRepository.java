package com.task.products_ordering.repository;

import com.task.products_ordering.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
   Optional<Boolean> findByProductName(String productName);
}
