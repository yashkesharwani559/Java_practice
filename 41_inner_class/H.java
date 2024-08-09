public class H {
    AAX4 a = new AAX4() {//annonymous inner class
        public void pro() {
            System.out.println("hello");
        }
    };
    public static void main(String[] args){
        new H().a.pro();
    }
}

interface AAX4{
    void pro();
}
