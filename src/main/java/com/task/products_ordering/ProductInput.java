package com.task.products_ordering;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Value
@Builder
public class ProductInput {
    String productName;
    double productPrice;

}
