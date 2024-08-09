interface X3{

}

class E1{
    public static void main(String[] args){
        X3 x = new X3();
    }
}
//this will give error because we cannot create objects of the interface
// E1.java:7: error: X3 is abstract; cannot be instantiated
//         X3 x = new X3();
//                ^
// 1 error