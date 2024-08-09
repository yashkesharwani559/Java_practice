public class A1 {
    {
        System.out.println("hii");
    }

    A1() {
        //super()
        // instance initialization block
        System.out.println("A1");

    }

    public static void main(String[] args){
        A1 x = new A1();
    }


}

//this will print output as
// hii
// A1
