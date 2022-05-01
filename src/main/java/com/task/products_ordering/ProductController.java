package com.task.products_ordering;

import com.task.products_ordering.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/newProduct")
    void addProduct(@RequestBody ProductInput productInput) {
        productService.addProduct(productInput);
    }

    @GetMapping("/products")
    List<ProductInput> getProducts() {
        return productService.getAllProducts();
    }

}
