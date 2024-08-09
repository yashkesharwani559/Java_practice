class Y1 {
    public static void main(String[] args) {
        System.out.println(1);
        pro();
    }   
    
    static void pro() {        
        try {
            System.out.println(2);
            throw new ArithmeticException();
        } catch(ArithmeticException e) {
            throw new IllegalArgumentException();
            //chaining exception
        } finally {
            throw new NullPointerException();
        }         
    }
}

//output

// 1
// 2
// Exception in thread "main" java.lang.NullPointerException
//         at Y1.pro(Y1.java:15)
//         at Y1.main(Y1.java:4)