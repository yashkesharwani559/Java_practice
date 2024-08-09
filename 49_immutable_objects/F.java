public class F {
    public static void main(String[] args) {

        Student s1 = new Student("vikrant", 22);

        System.out.println(s1);

        s1.setName("rahul");
        s1.setAge(21);

        System.out.println(s1);

    }
}
//output
// vikrant 22
// rahul 21

final class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

