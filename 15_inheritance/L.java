class A{

}

class L extends A{
    public static void main(String[] args){
        A x;
        System.out.println(x instanceof A);
    }
}
//this will give compilation error because because class A type variable x is not initialized and a local variable must be initialized before access
//this will give error as
// L.java:8: error: variable x might not have been initialized
//         System.out.println(x instanceof A);
//                            ^
// 1 error