class H2{
    public static void main(String[] args){
        abstract int x ;
        abstract int y = 30;
    }
}
//this will give error because we cannot mark local variables as abstract
// H2.java:3: error: class, interface, or enum expected
//         abstract int x ;
//                  ^
// H2.java:4: error: class, interface, or enum expected
//         abstract int y = 30;
//                  ^
// 2 errors