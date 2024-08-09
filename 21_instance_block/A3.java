public class A3 {
    {
        System.out.println("instance");
    }

    A3() {
        //super()
        // instance initialization block
        System.out.println("A3()");
    }

    A3(int x){
        this();

        System.out.println("A3(int)");
    }

    public static void main(String[] args){
        A3 x = new A3(14);
    }
}

//this will print output as
// instance
// A3()
// A3(int)

//this shows that an instance initialization block is called only once for creating one object in java