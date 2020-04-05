package de.byteleaf.demo.productmicroservice.product.repository;

import de.byteleaf.demo.productmicroservice.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
