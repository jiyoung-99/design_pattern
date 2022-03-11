package com.pattern.abstractFactory.web;

import com.pattern.abstractFactory.domain.product.Product;
import com.pattern.abstractFactory.domain.userinfo.Userinfo;
import com.pattern.abstractFactory.domain.userinfo.dao.UserinfoDao;
import com.pattern.abstractFactory.factory.DaoFactory;
import com.pattern.abstractFactory.factory.OracleDaoFactory;
import com.pattern.abstractFactory.factory.PostgresDaoFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebClient {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/com/pattern/abstractFactory/db.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);

            String dbType = properties.getProperty("DBTYPE");

            Userinfo userinfo = new Userinfo();
            userinfo.setUserId("1234");
            userinfo.setPassword("password");
            userinfo.setUserName("jiyoung");

            Product product = new Product();
            product.setProductId("0011AA");
            product.setProductName("TV");

            DaoFactory daoFactory = null;

            if(dbType.equals("Postgres")) {
                daoFactory = new PostgresDaoFactory();
            }else {
                daoFactory = new OracleDaoFactory();
            }

            UserinfoDao userinfoDao = daoFactory.createUserinfo();

            userinfoDao.insertUserinfo(userinfo);
            userinfoDao.updateUserinfo(userinfo);
            userinfoDao.deleteUserinfo(userinfo);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
