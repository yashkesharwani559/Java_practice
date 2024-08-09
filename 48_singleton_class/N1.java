
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

    //here to overcome the problem of creating more than one objects of a singleton class using clone() method and implementing the Cloneable interface, we can just override the clone() method in that singleton class and only write one statement 'return this'.

    public Student clone() {
        return this;
    }

}