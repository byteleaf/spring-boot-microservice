package de.byteleaf.demo.productmicroservice.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductInputDTO {

    private String name;
    private String description;
    private Double price;
}
