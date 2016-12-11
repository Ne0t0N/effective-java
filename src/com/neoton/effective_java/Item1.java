package com.neoton.effective_java;

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

    public static void main(String[] args) {
        // Usage of static factory methods kept in separate factory-like class
        Person averageUsaMan = Persons.getAverageUsaMan();
        Person averageDutchWoman = Persons.getAverageDutchWoman();
    }
}

enum Sex {
    MALE, FEMALE
}

class Person {

    private Sex sex;
    private int age;
    private int height;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Persons {

    public static Person getAverageUsaMan() {
        Person averageUsaMan = new Person();
        averageUsaMan.setSex(Sex.MALE);
        averageUsaMan.setAge(34);
        averageUsaMan.setHeight(176);
        return averageUsaMan;
    }

    public static Person getAverageDutchWoman() {
        Person averageDutchWoman = new Person();
        averageDutchWoman.setSex(Sex.FEMALE);
        averageDutchWoman.setAge(32);
        averageDutchWoman.setHeight(170);
        return averageDutchWoman;
    }
}