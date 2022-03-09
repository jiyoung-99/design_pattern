package com.pattern.prototype;

public class PrototypeTest {

    public static void main(String[] args) {

        PrototypeBox prototypeBox = new PrototypeBox();
        prototypeBox.addPrototype(new Prototype("body", "manipulator", "controller"));
        prototypeBox.addPrototype(new Prototype("body1", "manipulator1", "controller1"));
        prototypeBox.addPrototype(new Prototype("body2", "manipulator2", "controller2"));

        System.out.println(prototypeBox.toString());

        try {
            PrototypeBox newBox = (PrototypeBox) prototypeBox.clone();
            System.out.println(newBox.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
