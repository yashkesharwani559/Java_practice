
class M {
    public static void main(String[] args) {
        Student s = Student.getInstance();
        Student s1 = Student.getInstance();

        System.out.println(s);
        System.out.println(s1);
        // here both will print the same output

        
    }
}

class Student {
    private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        if (x == null)
            x = new Student("chitragupta", 500);

        return x;
    }
}