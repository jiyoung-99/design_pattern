package com.pattern.abstractFactory.domain.userinfo.dao;

import com.pattern.abstractFactory.domain.product.Product;
import com.pattern.abstractFactory.domain.userinfo.Userinfo;

public interface UserinfoDao {

    void insertUserinfo(Userinfo userinfo);
    void updateUserinfo(Userinfo userinfo);
    void deleteUserinfo(Userinfo userinfo);

}
