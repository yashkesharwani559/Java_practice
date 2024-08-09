
class N {

    public static void main(String[] args) {
        Student s = Student.getInstance();
        Student s1 = (Student) s.clone();

        System.out.println(s);
        System.out.println(s1);
        // here this will always time print the different output

    }
}

class User implements Cloneable{
    public Object clone() {
        
        Object obj = null;
        try{

            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

class Student extends User {
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
        return (Student) super.clone();
    }

}