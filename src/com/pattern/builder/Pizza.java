package com.pattern.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping { HAM, ONION, PEPPER, SAUSAGE, OLIVE };
    final Set<Topping> toppings;

    Pizza(Builder builder) {
        toppings = builder.toppings.clone();
    }

    //정적 inner class pizza 가 생성되지 않아도 builder 를 불러서 피자를 생성할 수 있다.
    abstract static class Builder {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public Builder addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public Builder sauceInside() {
            return self();
        }

        abstract  Pizza build();

        protected abstract Builder self();
    }

    public String toString() {
        return toppings.toString();
    }

}
