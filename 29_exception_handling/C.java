public class C {
    public static void main(String[] args) {
        
        System.out.println(1);

        try
        int a = 12/0;
        catch(Exception e){
            System.out.println(2);
        }

    }
}
//this will give compilation error  because in case of try there must be curly braces {} . means the code of try must be written in curly braces

//compilation error
// C.java:6: error: '{' expected
//         try
//            ^
// C.java:8: error: 'catch' without 'try'
//         catch(Exception e){
//         ^
// C.java:6: error: 'try' without 'catch', 'finally' or resource declarations
//         try
//         ^
// C.java:13: error: reached end of file while parsing
// }
//  ^
// 4 errors
// error: compilation failed