public class I1 {
    int p = 34;
    class X{
        void pro(){
            System.out.println(p);
        }
    }
    public static void main(String[] args){
        X x = new I1().new X();

        x.pro();
    }
}

// means the member of the outer class is accessible in the (members of inner class) the inner class
// but the object of the inner class can't access the member of the outer class

//output
// 34