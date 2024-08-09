class Student extends Pen {
    // extends keyword is used to inherit one class from other class
    // class child-class extends parent-class
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.x);
    }
} 

class Pen{
    int x = 34;
}