abstract class A{

}

class B extends A{

}

class M{
    public static void main(String[] args){
        // Case 1:
        A x;//this will give no error because we can create variable of an abstract class

        // Case 2:
        // A a = new A();//this will give compilation error because we can't create variable of an abstract class

        // Case 3:
        A b = new B();//this will give no error because we can store child class object to a abstract parent class variable
    }
}

// M.java:15: error: A is abstract; cannot be instantiated
//         A a = new A();//this will give compilation error because we can't create variable of an abstract class
//               ^
// 1 error