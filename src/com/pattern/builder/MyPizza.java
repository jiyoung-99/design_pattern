package com.pattern.builder;

import java.util.Objects;

public class MyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE};

    private final Size size;

    public static class Builder extends Pizza.Builder {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        public MyPizza build() {
            return new MyPizza(this);
        }

        protected Builder self() {
            return this;
        }
    }

    MyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
