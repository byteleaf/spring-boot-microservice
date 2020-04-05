package de.byteleaf.demo.productmicroservice.product.control;

import de.byteleaf.demo.productmicroservice.product.dto.ProductDTO;
import de.byteleaf.demo.productmicroservice.product.dto.ProductInputDTO;
import de.byteleaf.demo.productmicroservice.product.entity.Product;
import de.byteleaf.demo.productmicroservice.product.repository.ProductRepository;
import de.byteleaf.demo.productmicroservice.util.AssertUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    private final ModelMapper modelMapper;

    @Autowired
    public ProductService(ProductRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public List<ProductDTO> getAllProducts() {
        List<Product> products = repository.findAll();
        return modelMapper.map(products, new TypeToken<List<ProductDTO>>() {
        }.getType());
    }

    public ProductDTO getProduct(String id) {
        AssertUtil.notNull(id, "ID must be not null!");
        return modelMapper.map(repository.findById(id), ProductDTO.class);
    }

    public ProductDTO createProduct(ProductInputDTO input) {
        AssertUtil.notNull(input, "Input must be not null!");
        Product savedProduct = repository.save(modelMapper.map(input, Product.class));
        return modelMapper.map(savedProduct, ProductDTO.class);
    }
}
