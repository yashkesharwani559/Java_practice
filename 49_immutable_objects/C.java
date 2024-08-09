class Student   {
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

public class C {
    public static void main(String[] args) {
        
        Student s1 = new Student("vikrant", 22);

        System.out.println(s1);

        s1.name = "rahul";
        s1.age = 21;

        System.out.println(s1);
        
    }
}
// here the Student class object is not mutable

//output
// vikrant - 22
// rahul - 21