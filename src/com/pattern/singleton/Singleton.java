package com.pattern.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    //constructor 을 중복으로 못만들게 private 으로 생성
    private Singleton() {

    };

    //제공할 Public class 는 instance 를 생성하지 않아도 호출 가능하게 static 으로 만든다.
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    };


//    public static void main(String[] args) {
//
//    }
}
