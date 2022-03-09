package com.pattern.prototype;

import java.util.ArrayList;

//하나의 로봇 프로토타입, body, manipulator, controller 로 구성되어 있다.
public class Prototype {
    private String body;
    private String manipulator;
    private String controller;

    public Prototype(String body, String manipulator, String controller) {
        this.body = body;
        this.manipulator = manipulator;
        this.controller = controller;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getManipulator() {
        return manipulator;
    }

    public void setManipulator(String manipulator) {
        this.manipulator = manipulator;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "body='" + body + '\'' +
                ", manipulator='" + manipulator + '\'' +
                ", controller='" + controller + '\'' +
                '}';
    }
}

//자바의 object 는 바뀌면 안되는 것, 함부로 바꾸면 안된다. 복제를 가능하게 선언하는 것이 interface Cloneable
//mark interface , 구현하라는 메소드 없음
class PrototypeBox implements Cloneable {
    private ArrayList<Prototype> box;
    
    public PrototypeBox() {
        box = new ArrayList<Prototype>();
    }

    public ArrayList<Prototype> getBox() {
        return box;
    }

    public void setBox(ArrayList<Prototype> box) {
        this.box = box;
    }

    public void addPrototype(Prototype prototype) {
        box.add(prototype);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        PrototypeBox prototypeBox = new PrototypeBox();
        for(Prototype prototype : box) {
            prototypeBox.addPrototype(new Prototype(prototype.getBody(), prototype.getManipulator(), prototype.getController()));
        }
        return super.clone();
    }

    @Override
    public String toString() {
        return "PrototypeBox{" +
                "box=" + box.toString() +
                '}';
    }

}
