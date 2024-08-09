class Student {
    String name;
    int age;
    String college;
    float marks;
}


class Teacher  {
    String name;
    int age;
    String designation;
    float salary;
}

public class L {
    public static void main(String[] args){
        Student s = new Student();

        s.name = "yash";
        s.age = 20;
        s.college = "SRIT";
        s.marks = 34;
        
        
        Teacher t = new Teacher();
        t.name = "yash";
        t.age = 20;
        t.designation = "SRIT";
        t.salary = 34;

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
