package com.pattern.singleton;

import java.util.Calendar;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance address " + instance + "  " + instance2);

        //calendar 도 싱글턴 패턴
        Calendar calendar = Calendar.getInstance();
    }


}
