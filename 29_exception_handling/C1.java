public class C1 {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            int c = 12/0;
        }catch(Exception e)
        System.out.println(2);
        
    }
}
//this will give error because catch block have have curly braces and the code of the catch block must written in the curly braces

//compilation error
// C1.java:8: error: '{' expected
//         }catch(Exception e)
//                            ^
// C1.java:12: error: reached end of file while parsing
// }
//  ^
// 2 errors
// error: compilation failed
