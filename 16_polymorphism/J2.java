class A{

}
class B extends A{

}

class C extends A{

}

class J2{
    public static void main(String[] args){
        C x = new C();
        A c = (A) x;
        
    }
}
//this will not give any error and run without any trouble