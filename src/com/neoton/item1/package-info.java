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
package com.neoton.item1;