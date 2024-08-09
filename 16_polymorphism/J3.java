class A{

}
class B extends A{

}
class D extends C{

}
class C extends A{

}

class J3{
    public static void main(String[] args){
        D x = new D();
        A a = (A) x;
        C b = (C) x;
        
    }
}
//this will run without any error because child class class object can be assigned to any parent class variable (no matter whether the parent is direct or indirect the only thing that matters is that they fall in the same inheritance tree)