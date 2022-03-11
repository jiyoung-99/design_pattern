package com.pattern.abstractFactory.domain.userinfo.dao.oracle;

import com.pattern.abstractFactory.domain.userinfo.Userinfo;
import com.pattern.abstractFactory.domain.userinfo.dao.UserinfoDao;

public class UserinfoOracleDao implements UserinfoDao {
    @Override
    public void insertUserinfo(Userinfo userinfo) {
        System.out.println("insert into Oracle db userinfo Id = " + userinfo.getUserId());
    }

    @Override
    public void updateUserinfo(Userinfo userinfo) {
        System.out.println("update into Oracle db userinfo Id = " + userinfo.getUserId());
    }

    @Override
    public void deleteUserinfo(Userinfo userinfo) {
        System.out.println("update into Oracle db userinfo Id = " + userinfo.getUserId());
    }
}
