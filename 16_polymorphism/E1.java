class Y extends Z{
    
    void a3(){
        System.out.println("a2 of Y");
    }
}
class E{
    public static void main(String[] args){
        Z y = new Y();
        y.a1();
        y.a2();
        y.a3();
        y.toString();
        //this will give error on line 12 because y is variable of Z class and Z doesnot know about the method of his child class
//         E1.java:12: error: cannot find symbol
//         y.a3();
//          ^
//   symbol:   method a3()
//   location: variable y of type Z
// 1 error

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