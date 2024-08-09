class Student{ 
    String name;
    int age;
    String college;
    float marks;

    Student(String name, int age, String college, float marks){
        this.name = name;
        this.age = age;
        this.college = college;
        this.marks = marks;
    }
}

class Teacher {
    String name;
    int age;
    String designation;
    float salary;

    Teacher(String name, int age, String designation, float salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

public class L1 {
    public static void main(String[] args){
        Student s = new Student("om",20,"JEC",98.2f);

        Teacher t = new Teacher("om",35,"SRIT" , 2312344f);

        System.out.println("Student: ");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.college);
        System.out.println(s.marks);

        System.out.println("Teacher: ");
        
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.designation);
        System.out.println(t.salary);
    }
}
