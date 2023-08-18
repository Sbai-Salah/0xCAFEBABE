package InputOutput.oneTOhundred;

import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

/*
 * @author sbai-salah
*/
public class TestMain {
    public static void main(String[] args) {
// print 1 to 100 without using numbers :)
        System.out.println("-- with no numbers | String or ASCII --");
        int one = 'S'/'S';
        String baseTen = "..........";
        for(int i = one; i <= (baseTen.length())*(baseTen.length()); i++){
            System.out.println(i);
        }

        // ASCII of d is 100
        for(int i = one; i <= 'd'; i+=one){
            System.out.println(i);
        } 

// print 1 to 100 without using loops : for/do-while/while :)
        System.out.println("-- with no loops | RECURSION OR Streams--");
        printNum(1);
        IntStream.range(1, 101).forEach(e -> System.out.println(e));

// print 1 to 100 without using recursion or loops :)
        System.out.println("-- with no methods and recursion | Arrays or Sets --");
        // FILLING THE ARRAY
        Object num[] = new Object[100];
        Arrays.fill(num, new Object(){
            int count = 0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));

        // using BitSet
        String mySet = new BitSet() {{set(1, 101);}}.toString();
        System.out.append(mySet, 1, mySet.length());
    }




    public static void printNum(int num){
        if(num <= 100){
            System.out.println(num);
            num++;
            printNum(num);
        }
    }
    
}
