class A {
    String name;
    int age;

    A(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // SHALLOW CLONING :- means same object is stored in 2 or more than two variables

    public static void main(String[] args) {

        A a1 = new A("rohan", 20);
        
        A a2 = a1;

        a2.name = "yogesh";
        a2.age = 21;

        System.out.println(a1 == a2);//true
        System.out.println(a1.name);
        System.out.println(a2.name);
        System.out.println(a1.age);
        System.out.println(a2.age);
        
    }
}

//output
// true
// yogesh
// yogesh
// 21
// 21