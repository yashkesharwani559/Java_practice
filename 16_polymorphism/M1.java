interface A{

}

class B implements A{}

class M1{
    public static void main(String[] args){
        // Case 1:
        A x;//this will give no error because we can create variable of an interface

        //Case 2:
        // A a = new A();//this will give error because interface doesnot contain constructor

        //Case 3:
        A b = new B();//this will give no error because we can assign child class object to a parent interface variable
    }
}

// M1.java:13: error: A is abstract; cannot be instantiated
//         A a = new A();//this will give error because interface doesnot contain constructor
//               ^
// 1 error