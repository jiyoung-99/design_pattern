package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.domain.product.dao.ProductDao;
import com.pattern.abstractFactory.domain.userinfo.dao.UserinfoDao;

public interface DaoFactory {

    public UserinfoDao createUserinfo();
    public ProductDao createProduct();
}
