class Y extends Z{
    
    void a3(){
        System.out.println("a2 of Y");
    }
}
class E{
    public static void main(String[] args){
        Y y = new Y();
        y.a1();
        y.a2();
        y.a3();
        //this will give no error because all methods are inherited to the lowermost child class Y
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