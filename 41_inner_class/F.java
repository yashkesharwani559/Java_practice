public class F {
    public static void main(String[] args)  {
        AAX3 x1 = new AAX3() {//static method local anonymous inner class
            public void pro() {
                System.out.println("hello");
            }
        };
        AAX3 x2 = new AAX3() {
            public void pro() {
                System.out.println("hiii");
            }
        };
        x1.pro();
        x2.pro();
    }
}

//output
// hello
// hiii

interface AAX3{
    void pro();
}