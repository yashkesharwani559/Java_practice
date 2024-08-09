class A{

}
class B extends A{

}

class C extends A{

}

class J1{
    public static void main(String[] args){
        A x = new A();
        C c = (C) x;
        
    }
}
//this will give no compilation but give runtime exception 
// Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class C (A and C are in unnamed module of loader 'app')
//         at J1.main(J1.java:15)