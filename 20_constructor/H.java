class A {
    A()  {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

class C extends B {
    C(){
        System.out.println("C");
    }
}

public class H {
    public static void main(String[] args) {
        C x = new C();
        System.out.println("H");
    }
}



//this will print output as 
// A
// B
// C
// H


// also note that all class consrtructor will run but runs on the same object of the child class C

// this is because the constructor chaining in which when we call the child class constructor it has hidden super() call which calls the parent class constructor and the series ends when the Object class constructor runs

// Object class is the only class that has Object class constructor that doesnot have the super() call because Object is the ultimate parent of all class in java

//super() call is used to call the constructor of the parent class. If we not create the constructor the compiler supplied constructor has the super() call 
// and if you created the constructor and you didn't write the super() call then compiler writes it in behalf of you

// super() call must be the first line statement inside the constructor

//and also there can be only one super() call in a constructor and it must be a first line statement

