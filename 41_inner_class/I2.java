public class I2 {

    static void pro(AAX7 a) {
        a.pro();//here parent class version is called because there is no dynamic method dispatch in case of static method
    }

    public static void main(String[] args) {
        pro(new AAX7() {
            public static void pro() {
                System.out.println("toy");
            }
        });
    }
}

 
//output
// toy

class AAX7{
    static void pro() {
        System.out.println("gorakhpur");
    }
}