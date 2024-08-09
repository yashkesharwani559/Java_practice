
//here we have made the Student class as a singleton class but using some techniques which i have written in the next examples using which we can create more than one objects of a singleton class
// we can create more than one objects of a single class using :
// 1. Using serialization and deserialization
// 2. using clone() method.
// 3. using reflection api.

public class H1 {
    public static void main(String[] args) {

        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //here all will print same

    }
}
//output
// om $ 23
// om $ 23
// om $ 23

//now we have created the Student class as a singleton class
class Student{
    private String name;
    private int age;

    private static Student x;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        if(x == null)
            x = new Student("om", 23);
        return x;
    }
    
    public String toString(){
        return name + " $ " + age;
    }
}