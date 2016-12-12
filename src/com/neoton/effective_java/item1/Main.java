package com.neoton.effective_java.item1;

import com.neoton.effective_java.item1.model.Coffee;
import com.neoton.effective_java.item1.model.Luwak;
import com.neoton.effective_java.item1.model.StaticFactoryMethod;

/**
 * Static factory method instead of constructor
 * <p>
 * Advantages of using static factory methods:
 *  - meaningful names
 *  - not required to create new object each time it called
 *  - can return any subtype
 * <p>
 * Disadvantages of using static factory methods:
 *  - classes without public/protected/package constructors can't be subclassed (somewhat beneficial as the intent
 * would be to use composition instead of inheritance)
 *  - static factory methods are not distinguishable from other methods in class (one of the possible solutions is to
 * use {@link StaticFactoryMethod}) annotation as a pointer
 * <p>
 * Naming examples:
 *  - valueOf -> mainly used for type conversions maintaining the same values
 *  - of -> alternative to 'valueOf' in EnumSet
 *  - getInstance -> mainly used in singleton pattern
 *  - newInstance -> similar to constructor (creates new instance each time)
 *  - getType -> like 'getInstance' with subtype retrieval
 *  - newType -> like 'newInstance' with subtype retrieval
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Coffee coffee = Coffee.valueOf("Some very delicious coffee...");
        Coffee luwak = Coffee.newType(Luwak.class);
    }
}
