package com.rktirtho.walton.service;

import com.rktirtho.walton.entity.Product;
import com.rktirtho.walton.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    final
    ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product getById(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.delete(repository.getById(id));

    }

    @Override
    public Product update(long id, Product productUpdateRequest) {

        Product product = getById(id);
        product.setSellingPrice(productUpdateRequest.getSellingPrice());
        product.setProductCode(productUpdateRequest.getProductCode());
        product.setProductName(productUpdateRequest.getProductName());

        return repository.save(product);
    }
}
