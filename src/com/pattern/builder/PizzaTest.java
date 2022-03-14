package com.pattern.builder;

public class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza = new MyPizza.Builder(MyPizza.Size.LARGE).addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.ONION).build();

        System.out.println(pizza);
    }
}
