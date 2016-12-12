package com.neoton.effective_java.item1;

public class Coffee {

    private String name;

    Coffee() {
    }

    @StaticFactoryMethod
    public static Coffee valueOf(String coffeeName) {
        Coffee coffee = new Coffee();
        coffee.setName(coffeeName);
        return coffee;
    }

    @StaticFactoryMethod
    public static Coffee newType(Class<? extends Coffee> subtype) throws IllegalAccessException, InstantiationException {
        return subtype.newInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
