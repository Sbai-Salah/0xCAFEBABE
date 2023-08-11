package immutableKeyHashMap;

import java.util.HashMap;
import java.util.Map;
/*
 * @author sbai-salah
*/
public class TestMap {

    public static void main(String[] args) {
        // using a mutable class as a key : 

        Map<Employee, String> empMap = new HashMap<Employee, String>();
        System.out.println("--- DECLARING SIMPLE OBJECT e1 ---");
        Employee e1 = new Employee("Salah", 2023);
        empMap.put(e1, "ENGINEER");
        System.out.println(empMap.get(e1)); // will display ENGINEER

        // now let us mutate another object and see what will happen
        Employee e2 = new Employee("Sbai", 111);
        empMap.put(e2, "SCIENTISTS");

        System.out.println("--- BEFORE MUTATING THE OBJECT e2 ---");
        System.out.println(empMap.get(e2)); 
        
        e2.setAge(150);

        System.out.println("--- AFTER MUTATING THE OBJECT e2.age ---");
        System.out.println(empMap.get(e2)); 
        System.out.println("\nthe hashCode function depends on the age\n when changing the age or even the name we will get another bucket index with same object : memory lose\n ==> THAT'S WHY HASHMAP KEY SHOULD BE IMMUTABLE");



    }
    
}
