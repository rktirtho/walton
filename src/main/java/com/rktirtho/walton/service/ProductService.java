package com.rktirtho.walton.service;

import com.rktirtho.walton.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProduct();

    Product getById(long id);

    void delete(long id);

    Product update(long id, Product productUpdateRequest);

}
