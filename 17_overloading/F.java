class Student {
    String name;
    int age;
    public String toString() {
        return name + " " + age;
    }
}

class Teacher{}


public class F {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Student";
        s.age = 20;
        
        Teacher t = new Teacher();

        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(t);
        System.out.println(t.toString());

        Integer i = new Integer(12);

        //this constructor of the Integer is deprecated

        System.out.println(i);
        System.out.println(i.toString());
    }
}
