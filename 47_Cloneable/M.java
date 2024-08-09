public class M {
    public static void main(String[] args) {
        Student s1 = new Student("arjun", 25, new Address(new State("MP"), new City("JBP")));

        Student s2 = s1.clone();

        s1.address.s.state = "CG";

        System.out.println(s1.address.s.state);//CG
        System.out.println(s2.address.s.state);//CG

    }
}

//so here the variable of a non-cloneable class X is in a class Y that is cloneable than when we deep clone the object of the Y class then it will be cloned but the variable X is not deep cloned but it is shallow cloned

class Address{
    State s;
    City c;

    Address(State s, City c){
        this.s = s;
        this.c = c;
    }
}
class State{
    String state;

    State(String s) {
        state = s;
    }
}
class City{
    String city;
    City(String s) {
        city = s;
    }
}

class Student implements Cloneable{
    String name;
    int age;
    Address address;
    Student(String n, int a, Address ad){
        name = n;
        age = a;
        address = ad;
    }
    public Student clone(){
        Student s = null;
        try{
            s = (Student) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return s;
    }
}