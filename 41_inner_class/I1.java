public class I1 {

    static void pro(AAX6 a) {
        a.pro();//here child class version is called due to dynamic method dispatch (runtime polymorphism)
    }

    public static void main(String[] args) {
        pro(new AAX6() {
            public void pro() {
                System.out.println("toy");
            }
        });
    }
}

 
//output
// toy

class AAX6{
    void pro() {
        System.out.println("gorakhpur");
    }
}