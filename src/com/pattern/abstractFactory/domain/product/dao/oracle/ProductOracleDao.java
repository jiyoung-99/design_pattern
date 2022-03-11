package com.pattern.abstractFactory.domain.product.dao.oracle;

import com.pattern.abstractFactory.domain.product.Product;
import com.pattern.abstractFactory.domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into Oracle db product Id = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into Oracle db product Id = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into Oracle db product Id = " + product.getProductId());
    }
}
