package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.domain.product.dao.ProductDao;
import com.pattern.abstractFactory.domain.product.dao.oracle.ProductOracleDao;
import com.pattern.abstractFactory.domain.userinfo.dao.UserinfoDao;
import com.pattern.abstractFactory.domain.userinfo.dao.oracle.UserinfoOracleDao;

public class OracleDaoFactory implements DaoFactory{
    @Override
    public UserinfoDao createUserinfo() {
        return new UserinfoOracleDao();
    }

    @Override
    public ProductDao createProduct() {
        return new ProductOracleDao();
    }
}
