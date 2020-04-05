package de.byteleaf.demo.productmicroservice.product.boundary;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import de.byteleaf.demo.productmicroservice.product.control.ProductService;
import de.byteleaf.demo.productmicroservice.product.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductResolver implements GraphQLQueryResolver {

    private final ProductService service;

    @Autowired
    public ProductResolver(ProductService service) {
        this.service = service;
    }

    public List<ProductDTO> allProducts() {
        return service.getAllProducts();
    }

    public ProductDTO product(String id) {
        return service.getProduct(id);
    }

}
