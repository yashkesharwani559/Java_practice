public class E2 {
    public static void main(String[] args) {
        AAX2 obj = new AAX2() {//static method local anonymous inner class
            public Object pro() {
                System.out.println(this);//E1$
                return this;
            }
        };

        System.out.println(obj);
        obj.pro();
        System.out.println(obj.getClass());
    }
}

interface AAX2{
    Object pro();
}