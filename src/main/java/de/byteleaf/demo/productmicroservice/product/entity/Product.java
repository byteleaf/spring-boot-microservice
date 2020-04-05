package de.byteleaf.demo.productmicroservice.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
}
