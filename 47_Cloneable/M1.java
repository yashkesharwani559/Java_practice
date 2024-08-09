public class M1 {
    public static void main(String[] args) {
        Student s1 = new Student("arjun", 25, new Address("MP", "Jbp"));

        Student s2 = s1.clone();

        s1.address.s = "CG";

        System.out.println(s1.address.s);// CG
        System.out.println(s2.address.s);// CG

    }
}
// means even if the class A variable is created in class B and both class A and B are Cloneable. We are trying to deep clone the object of class B then the object of the class B is deep cloned but the object of class A in class B is not deep cloned. It is just the reference code of same object of class A copied.

class Address implements Cloneable {
    String s;
    String c;

    Address(String s, String c) {
        this.s = s;
        this.c = c;
    }
    
    public Address clone() {
        Address s = null;
        try {
            s = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return s;
    }
}

// class State implements Cloneable {
//     String state;

//     State(String s) {
//         state = s;
//     }

//     public State clone() {
//         State s = null;
//         try {
//             s = (State) super.clone();
//         } catch (CloneNotSupportedException e) {
//             e.printStackTrace();
//         }
//         return s;
//     }
// }

// class City implements Cloneable {
//     String city;

//     City(String s) {
//         city = s;
//     }

//     public City clone() {
//         City s = null;
//         try {
//             s = (City) super.clone();
//         } catch (CloneNotSupportedException e) {
//             e.printStackTrace();
//         }
//         return s;
//     }
// }

class Student implements Cloneable {
    String name;
    int age;
    Address address;

    Student(String n, int a, Address ad) {
        name = n;
        age = a;
        address = ad;
    }

    public Student clone() {
        Student s = null;
        try {
            s = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return s;
    }
}