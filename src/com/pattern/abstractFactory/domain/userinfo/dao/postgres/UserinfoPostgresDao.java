package com.pattern.abstractFactory.domain.userinfo.dao.postgres;

import com.pattern.abstractFactory.domain.userinfo.Userinfo;
import com.pattern.abstractFactory.domain.userinfo.dao.UserinfoDao;

public class UserinfoPostgresDao implements UserinfoDao {
    @Override
    public void insertUserinfo(Userinfo userinfo) {
        System.out.println("insert into PG db userinfo Id = " + userinfo.getUserId());
    }

    @Override
    public void updateUserinfo(Userinfo userinfo) {
        System.out.println("update into PG db userinfo Id = " + userinfo.getUserId());
    }

    @Override
    public void deleteUserinfo(Userinfo userinfo) {
        System.out.println("delete into PG db userinfo Id = " + userinfo.getUserId());
    }
}
