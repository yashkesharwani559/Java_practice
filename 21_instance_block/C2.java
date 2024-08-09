public class C2 {
    static {
        System.out.println("A");
    }
    
    static {
        System.out.println("B");
    }

    public static void main(String[] args) {

        System.out.println("main");
    }
    

    static {
        System.out.println("C");
    }


}
//this will give output as
// A
// B
// C
// main

//this shows that we can write multiple static{} initialization block in java but at the time of running they follow the top-down approach and no matter static{} block is written where it runs before the main method