

public class A2 {

    {
        System.out.println("instance");
    }
    A2() {
        //super()
        //instance initialization block
        System.out.println("A2()");
    }

        
    A2(int x){
        //super()
        //instance initialization block
        System.out.println("A2(int)");
    }    

    public static void main(String[] args){
        A2 x = new A2();
        A2 y = new A2(10);
    }
}


//this will print output as
// instance
// A2()
// A2(int)