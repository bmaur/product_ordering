package com.task.products_ordering;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    @ManyToMany
    @JoinColumn(name = "product_id")
    private Set<ProductEntity> orderProducts;
    private double orderPrice;
    private LocalDate orderDate;

}
