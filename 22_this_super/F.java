public class F {
    void pro()  {
        System.out.println(this);
        A4 x = new A4(this);
    }

    public static void main(String[] args) {
        F x = new F();
        x.pro();
        System.out.println(x);

    }
}

class A4{
    A4(F x){

    }
}

//so from this example we saw that we can pass object as argument using this keyword in instance methods