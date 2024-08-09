public class O1 {
    public static void pro(String[] arr, String... x) {
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");
        for (String s : x) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        
        pro({"A", "B"}, "C", "D");//compilation fail because the supershortcut technique of creating an array is applicable only when we do the declaration and initialization both at the same time.
    
    }
}

// O1.java:14: error: illegal start of expression
//         pro({"A", "B"}, "C", "D");//compilation fail because the supershortcut technique of creating an array is applicable only when we do the declaration and initialization both at the same time.
//             ^
// O1.java:14: error: not a statement
//         pro({"A", "B"}, "C", "D");//compilation fail because the supershortcut technique of creating an array is applicable only when we do the declaration and initialization both at the same time.
//              ^
// O1.java:14: error: ';' expected
//         pro({"A", "B"}, "C", "D");//compilation fail because the supershortcut technique of creating an array is applicable only when we do the declaration and initialization both at the same time.
//                 ^
// O1.java:14: error: illegal start of expression
//         pro({"A", "B"}, "C", "D");//compilation fail because the supershortcut technique of creating an array is applicable only when we do the declaration and initialization both at the same time.
//                       ^
// 4 errors
// error: compilation failed