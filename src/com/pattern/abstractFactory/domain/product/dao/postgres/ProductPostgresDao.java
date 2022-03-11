package com.pattern.abstractFactory.domain.product.dao.postgres;

import com.pattern.abstractFactory.domain.product.Product;
import com.pattern.abstractFactory.domain.product.dao.ProductDao;

public class ProductPostgresDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into PG db product Id = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into PG db product Id = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into PG db product Id = " + product.getProductId());
    }
}
