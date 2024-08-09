public class C {
    static{
        System.out.println("C");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}

//static initialization blocks are the blocks that runs at the time when the class loads before it runs

//this will give output as

// C
// main

//point to be noted that the static block runs before the main method