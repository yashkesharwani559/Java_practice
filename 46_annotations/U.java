
public class U {
    public static void main(String[] args){
        
    }
}

@interface UU1{
    String name;
    int age;
}//compilation fail because not a correct syntax to make fields in the annotations

// U.java:9: error: = expected
//     String name;
//                ^
// U.java:10: error: = expected
//     int age;
//            ^
// 2 errors
// error: compilation failed