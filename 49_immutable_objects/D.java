//to make a user-defined class object immutable we have to follow some steps
// 1. make the class final so that no one can make subclass of that class 

final class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " - " + age;
    }
}

public class D {
    public static void main(String[] args) {
        
        Student s1 = new Student("vikrant", 22);

        System.out.println(s1);

        s1.name = "rahul";
        s1.age = 21;

        System.out.println(s1);
        
    }
}


//output
// vikrant - 22
// rahul - 21