package equalsHashCodeContract;
import java.util.Objects;

/*
 * if two objects are equal to each other based on equals() method, 
 * then the hash code must be the same, 
 * but if the hash code is the same, then equals() can return false.
 * ----------------------
 * here are some complex scenarios and considerations related to the equals() and hashCode() contract in Java :
 * 1- When dealing with objects that have composite keys (multiple fields contributing to identity), the hashCode() calculation needs to take all relevant fields into account. Similarly, the equals() method should compare all these fields to ensure accurate equality checks.
 * 2- Caching: Sometimes, objects that are used frequently might cache their hash codes to improve performance. However, this requires careful synchronization if the object's state can change.
 * 3- Inheritance: If a class overrides the equals() method, subclasses should also override it to maintain the contract. Additionally, if a superclass overrides hashCode(), subclasses might need to adjust how they calculate hash codes to maintain consistency.
 * +++++++++++++++++++++++
 * - enums are particularly well-suited for hash-based collections
 * - ? Immutable: Enums are constant values and cannot be modified after they are defined. 
 * - ? Enums already have a proper equals() and hashCode() implementation provided by the Java runtime. Each enum constant is considered equal only to itself, and their hash codes are based on their ordinal values. 

 * @author sbai-salah
 * 
*/

class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id == myClass.id &&
                Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


public class equalHash {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Object 1");
        MyClass obj2 = new MyClass(1, "Object 2");

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
    }
}
