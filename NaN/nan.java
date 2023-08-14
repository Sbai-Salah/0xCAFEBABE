package NaN;

/*
 * @author sbai-salah
 * Floating point representation ?
 * 
 * 
*/
public class nan {
    
    public static void main(String[] args) {
        // System.out.println(2/0); --> Arithmetic Exception
        System.out.println(2.0/0); // Infinity
        System.out.println(0.0/0.0); // NaN
        System.out.println(Math.sqrt(-1)); // NaN

        System.out.println(Float.NaN == Float.NaN); // false :)
        // we can't compare two NaN because they're undefined. 
    }
}

