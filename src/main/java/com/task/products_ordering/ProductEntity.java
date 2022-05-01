package com.task.products_ordering;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private double productPrice;
}
