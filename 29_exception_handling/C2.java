public class C2 {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            int x = 12/0;
        }
        System.out.println(2);
        catch(Exception e){
            System.out.println(3);
        }

    }
}
//this will give compilation error because catch must be written just below the try block

//compilation error
// C2.java:6: error: 'try' without 'catch', 'finally' or resource declarations
//         try{
//         ^
// C2.java:10: error: 'catch' without 'try'
//         catch(Exception e){
//         ^
// 2 errors
// error: compilation failed