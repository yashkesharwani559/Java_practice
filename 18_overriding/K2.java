public class K2 extends A {
    public void pro(){}
}

class A{
    void pro(){//default

    }
}

//no error

// access modifier on parent class method (overriding method)    -----> access modifier applicable on overridden method  

// private  ---> method is not inherited so write method with same name create new method in the child class and we can apply any access modifier in the child class   public,protected,default,private

//default   --->  default,protected, public

//protected  ----> protected,public

//public   -----> public