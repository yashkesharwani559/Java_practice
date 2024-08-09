class Y extends Z{
    
    void a3(){
        System.out.println("a2 of Y");
    }
}
class E{
    public static void main(String[] args){
        X y = new Y();
        y.a1();
        y.a2();
        y.a3();
        y.toString();
        //this will give error on line 12 and line 11 because y is variable of X class and X doesnot know about the method of his child class
//         E2.java:11: error: cannot find symbol
//         y.a2();
//          ^
//   symbol:   method a2()
//   location: variable y of type X
// E2.java:12: error: cannot find symbol
//         y.a3();
//          ^
//   symbol:   method a3()
//   location: variable y of type X
// 2 errors

    }
}

class Z extends X{

    void a2(){
        System.out.println("a2 of Z");
    }
}

class X{
    void a1(){
        System.out.println("a1 of X");
    }
}