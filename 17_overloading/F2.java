public class F2 {
    public static void main(String[] args) {
        int x = 45;
        
        System.out.println(x + 2);
        System.out.println(x.toString()  + 2);
        
        //here at line 6 it will give compilation error because the toString() method can be called by using an object only and x is a predefined data type

    }
}

// F2.java:6: error: int cannot be dereferenced
//         System.out.println(x.toString()  + 2);
//                             ^
// 1 error