//here we will study about this keyword
 
class A {
    int x = 45;

    A(int x) {

        this.x = x;
    }
}

class J {
    public static void main(String[] args) {
        A x = new A(34);
        System.out.println(x.x);//34
    }
}

//this.member is used to access the members of that class
