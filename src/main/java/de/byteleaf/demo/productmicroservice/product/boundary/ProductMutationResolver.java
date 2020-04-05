package de.byteleaf.demo.productmicroservice.product.boundary;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import de.byteleaf.demo.productmicroservice.product.control.ProductService;
import de.byteleaf.demo.productmicroservice.product.dto.ProductDTO;
import de.byteleaf.demo.productmicroservice.product.dto.ProductInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMutationResolver implements GraphQLMutationResolver {

    private final ProductService service;

    @Autowired
    public ProductMutationResolver(ProductService service) {
        this.service = service;
    }

    public ProductDTO createProduct(ProductInputDTO input) {
        return service.createProduct(input);
    }

}
