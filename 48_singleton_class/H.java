public class H {
    public static void main(String[] args) {

        Student s1 = new Student("om", 34);
        Student s2 = new Student("sai", 23);
        Student s3 = new Student("god", 19);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

//output
// om $ 0
// sai $ 0
// god $ 0

class Student{
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " $ " + age;
    }
}