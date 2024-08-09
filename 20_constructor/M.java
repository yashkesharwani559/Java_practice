class User {
    String name;
    int age;
}

class Student extends User {
    // String name;
    // int age;
    String college;
    float marks;

    Student(String name, int age, String college, float marks) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.marks = marks;
    }
}

class Teacher extends User {
    // String name;
    // int age;
    String designation;
    float salary;

    Teacher(String name, int age, String designation, float salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

class M {
    public static void main(String[] args) {
        Student s = new Student("chhotabheem", 10, "Dholkpur Univ", 100.0f);

        // s.name = "om";
        // s.age = 20;
        // s.college = "JEC";
        // s.marks = 78.5f;

        Teacher t = new Teacher("Avi Chhacha", 65, "juniorteacher", 200000.0f);

        // t.name = "mohan";
        // t.age = 32;
        // t.designation = "teacher";
        // t.salary = 23000.45f;

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
