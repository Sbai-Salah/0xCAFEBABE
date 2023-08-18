package Static.staticBlock;

public class staticBlockQuestions {
    
    // Q1: Explain the static block in java
    /*
     * the static block is created using the static keyword
     * it will be loaded before the main method.
     * we can create multiple static blocks. 
     * The execution of multiple static block = the order which we put them
    */
    static {
        System.out.println("static block1");
    }
    
    static {
        System.out.println("static block2");
    }


    // Q2: difference between static block and static method
    /* static block will be loaded and called automatically
     * the static method should be called explicitly 
     * 
    */

    // Q3: How can we create objects if we make the constructor private ?
    /* 
     * we can't create the object it will say that the constructor is not visible in this class
     * we can do it using 2 solutions :
     * - create a static block
     * - or create a static method to create the object
     * 
     * 
    */

    // Q4: Can we compile and run a program without the main method ?
    /* we can do it using static block :) 
     * 
     * 
    */
    public static void main(String[] args) {
        System.out.println("main method");
    }
}
