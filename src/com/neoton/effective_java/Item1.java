package com.neoton.effective_java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * Static factory method instead of constructor
 *
 * Advantages of using static factory methods:
 *  - meaningful names
 *  - not required to create new object each time it called
 *  - can return any subtype
 *
 * Disadvantages of using static factory methods:
 *  - classes without public/protected/package constructors can't be subclassed
 *  - static factory methods are not distinguishable from other methods in class
 *
 *  Naming examples:
 *   - valueOf -> mainly used for type conversions maintaining the same values
 *   - of -> alternative to 'valueOf' in EnumSet
 *   - getInstance -> mainly used in singleton pattern
 *   - newInstance -> similar to constructor (creates new instance each time)
 *   - getType -> like 'getInstance' with subtype retrieval
 *   - newType -> like 'newInstance' with subtype retrieval
 *
 * User: neoton
 * Date: 08.12.16
 */
public class Item1 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Coffee coffee = Coffee.valueOf("Some very delicious coffee...");
        Coffee luwak = Coffee.newType(Luwak.class);
    }
}

class Coffee {

    private String name;

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

class Luwak extends Coffee {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface StaticFactoryMethod {
}