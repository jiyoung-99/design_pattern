package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.domain.product.dao.ProductDao;
import com.pattern.abstractFactory.domain.product.dao.postgres.ProductPostgresDao;
import com.pattern.abstractFactory.domain.userinfo.dao.UserinfoDao;
import com.pattern.abstractFactory.domain.userinfo.dao.postgres.UserinfoPostgresDao;

public class PostgresDaoFactory implements DaoFactory{
    @Override
    public UserinfoDao createUserinfo() {
        return new UserinfoPostgresDao();
    }

    @Override
    public ProductDao createProduct() {
        return new ProductPostgresDao();
    }
}
