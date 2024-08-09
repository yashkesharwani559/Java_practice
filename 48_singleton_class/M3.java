
//here we implementing the clone() method so well that it will always returns the same object

class M3 {

    public static void main(String[] args) {
        Student s = Student.getInstance();
        Student s1 = s.clone();

        System.out.println(s);
        System.out.println(s1);
        // here this will always time print the same output

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

    public Student clone() {

        return this;
    }

}