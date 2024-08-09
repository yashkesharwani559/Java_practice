class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends User {
    // String name;
    // int age;
    String college;
    float marks;

    Student(String name, int age, String college, float marks) {
        super(name, age);
        // this.name = name;
        // this.age = age;
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
        super(name, age);
        // this.name = name;
        // this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

class M1 {
    public static void main(String[] args) {
        Student s = new Student("raju", 2, "Dholkpur Univ", 1.0f);

        // s.name = "om";
        // s.age = 20;
        // s.college = "JEC";
        // s.marks = 78.5f;

        Teacher t = new Teacher("Prof Dhoomketu", 62, "juniorteacher", 5000000.0f);

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
