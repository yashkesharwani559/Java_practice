class L extends AAB {
    public void pro() {
        System.out.println(x);//not allowed
    }
    public static void main(String[] args) {
        L a = new L();
        System.out.println(a.x);//private members are not allowed to access to the child class 
    }
}

class AAB {
    private int x = 45;
}

// L.java:3: error: x has private access in AAB
//         System.out.println(x);//not allowed
//                            ^
// L.java:7: error: x has private access in AAB
//         System.out.println(a.x);//private members are not allowed to access to the child class
//                             ^
// 2 errors
// error: compilation failed